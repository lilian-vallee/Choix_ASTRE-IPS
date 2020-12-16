package com.ensim.choixAstreIPS;


import com.ensim.choixAstreIPS.Model.*;
import com.ensim.choixAstreIPS.Model.ModelJson.MotsCleJson;
import com.ensim.choixAstreIPS.Model.ModelJson.QuestionModelJson;
import com.ensim.choixAstreIPS.Utils.QuestionUtils;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Moteur {

    //Attribut
    //==========================================================================

    private List<QuestionModel> models;
    private List<Etudiant> etudiants;


    //Get/set
    //==========================================================================

    public List<QuestionModel> getModels() {
        return models;
    }

    public List<Etudiant> getEtudiants() {
        return etudiants;
    }

    public void setModels(List<QuestionModel> models) {
        this.models = models;
    }

    public void setEtudiants(List<Etudiant> etudiants) {
        this.etudiants = etudiants;
    }

    //Constructeur
    //==========================================================================


    /**
     * Constructeur basic
     */
    public Moteur() {
        loadModel("Model_Save");
        //loadQuestionnaire3A();
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
            Logger.getAnonymousLogger().log(Level.WARNING,"Echec à l'ecriture du fichier de sauvegarde");
            return false;
        }
    }

    /**
     * Chargement de fichier de sauvegarde
     * @param nameFile
     * @return
     */
    public Boolean loadModel(String nameFile){

        models = new ArrayList<QuestionModel>();

        try {

            ObjectMapper mapper = new ObjectMapper();

            File file = ResourceUtils.getFile("src/main/resources/static/Save/"+ nameFile +".json");

            if (file.exists()){
                QuestionModelJson[] filemodel = mapper.readValue(new FileInputStream(file), QuestionModelJson[].class);

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
            Logger.getAnonymousLogger().log(Level.WARNING,"Echec à la lecture du fichier de sauvegarde");
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

            File file = ResourceUtils.getFile("classpath:static/Questionnaire_3A.json");

            if( file.exists() ) {
                //convert json file to array of Questionnaire3A
                Questionnaire3A[] q = objectMapper.readValue(new FileInputStream(file), Questionnaire3A[].class);

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
}
