package com.ensim.choixAstreIPS;


import com.ensim.choixAstreIPS.Model.*;
import com.ensim.choixAstreIPS.Model.ModelJson.MotsCleJson;
import com.ensim.choixAstreIPS.Model.ModelJson.QuestionModelJson;
import com.ensim.choixAstreIPS.Utils.QuestionUtils;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.core.io.ClassPathResource;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public enum Moteur {
    INSTANCE;

    //Attribut
    //==========================================================================

    private final List<QuestionModel> models;
    private final List<Etudiant> etudiants;


    //Get/set
    //==========================================================================

    public List<QuestionModel> getModels() {
        return models;
    }

    public List<Etudiant> getEtudiants() {
        return etudiants;
    }

    //Constructeur
    //==========================================================================


    /**
     * Constructeur basic
     */
    Moteur() {
        this.models = new ArrayList<>();
        this.etudiants = new ArrayList<>();
        loadModel("Model_Save");
        loadQuestionnaire3A();
    }

    public void addModel(QuestionModel questionModel){
        models.add(questionModel);
    }


    //Methodes
    //==========================================================================

    /**
     * Sauvegarde les models de question dans un fichier json
     * @return
     */
    public Boolean saveModel(String nameFile){
        try {

            ObjectMapper mapper = new ObjectMapper();
            mapper.writeValue(new File("src/main/resources/static/Save/"+ nameFile +".json"), this.models);

            return true;
        } catch (IOException e) {
            Logger.getLogger("saveModel").severe("Echec à l'ecriture du fichier de sauvegarde : " + e.getMessage());
            return false;
        }
    }

    /**
     * Chargement de fichier de sauvegarde
     * @param nameFile
     * @return
     */
    public Boolean loadModel(String nameFile){

        models.clear();

        try {
            ObjectMapper mapper = new ObjectMapper();

            InputStream inputStream = new ClassPathResource("static/Save/"+ nameFile +".json").getInputStream();;

            if ( inputStream.available() > 0 ){
                QuestionModelJson[] filemodel = mapper.readValue(inputStream, QuestionModelJson[].class);

                for (QuestionModelJson q : filemodel) {

                    QuestionModel questionModel = new QuestionModel(q.getIndex(), q.getIntitule(), q.getCoeff());

                    for (MotsCleJson mc : q.getMotsCles()) {
                        MotCle motCle = new MotCle(mc.getMot(),mc.getIps(),mc.getAstre());
                        questionModel.addMotCle(motCle);
                    }

                    models.add(questionModel);
                }
                return true;
            }
            else{
                return false;
            }

        } catch (IOException e) {
            Logger.getLogger("loadModel").severe("Echec à la lecture du fichier de sauvegarde : " + e.getMessage());
            return false;
        }
    }

    /**
     * Loads the Questionnaire_3A.json file and creates Questions
     * @return
     */
    public boolean loadQuestionnaire3A() {
        try {
            //create ObjectMapper instance
            ObjectMapper objectMapper = new ObjectMapper();

            InputStream inputStream = new ClassPathResource("static/Questionnaire_3A.json").getInputStream();;

            if( inputStream.available() > 0 ) {
                //convert json file to array of Questionnaire3A
                Questionnaire3A[] q = objectMapper.readValue(inputStream, Questionnaire3A[].class);

                // loop on each response to the quizz
                for (Questionnaire3A questionnaire3A : q) {
                    List<Reponse> reponses = new ArrayList<>();
                    // Loop on each question
                    int i = 0;
                    for (String rep:
                         questionnaire3A.getAll()) {
                        reponses.add(new Reponse(i, QuestionUtils.getQuestion(i) , rep));
                        i++;
                    }
                    etudiants.add( new Etudiant( String.valueOf(reponses.get(1).getReponse()), reponses) );
                }
            }
        } catch (IOException e) {
           Logger.getLogger("loadQuestionnaire3A").severe("IO error : " + e.getMessage());
           return false;
        }
        return true;
    }

    /**
     * Calcule le score des affinités ASTRE ou IPS pour un étudiant donné
     * @param etudiant
     * @return
     */
    public boolean calcul(Etudiant etudiant){
        if (etudiant.getReponses().size()-1 != models.size()){
            return false;
        }

        double ips = 0;
        double astre = 0;
        int i=1;

        for (QuestionModel qm : models){
            String reponse = etudiant.getReponses().get(i).getReponse();
            for (MotCle mot : qm.getMotsCles()){
                if ( reponse.contains(mot.getMot()) ){
                    ips += mot.getIps()*qm.getCoeff();
                    astre += mot.getAstre()*qm.getCoeff();
                }
            }
            i++;
        }
        etudiant.setIps(ips);
        etudiant.setAstre(astre);

        return true;
    }
}
