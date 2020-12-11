package com.ensim.choixAstreIPS;


import com.ensim.choixAstreIPS.Model.Etudiant;
import com.ensim.choixAstreIPS.Model.Question;
import com.ensim.choixAstreIPS.Model.QuestionModel;
import com.ensim.choixAstreIPS.Model.Questionnaire3A;
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

    //Constructeur
    //==========================================================================


    /**
     * Constructeur basic
     */
    public Moteur() {
        this.models = new ArrayList<QuestionModel>();
        this.etudiants = new ArrayList<Etudiant>();
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
        try {

            ObjectMapper mapper = new ObjectMapper();
            this.models = mapper.readValue(new File("src/main/resources/static/Save/"+ nameFile +".json"), this.models.getClass());
            return true;

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
                    List<Question> questions = new ArrayList<>();
                    // Loop on each question
                    for (String s:
                         questionnaire3A.getAll()) {
                        questions.add(createQuestion(s));
                    }
                    etudiants.add( createEtudiant( String.valueOf(questions.get(1)), questions) );
                }
                Logger.getLogger("loadQuestionnaire3A").info(etudiants.toString());
            }
        } catch (IOException e) {
           Logger.getLogger("loadQuestionnaire3A").severe("IO error : " + e.getMessage());
           return false;
        }
        return true;
    }

    /**
     * Creates a Question from a String (response)
     * @param r
     * @return
     */
    private Question createQuestion(String r) {
        Question question = new Question();
        question.setReponse(r);
        return question;
    }

    /**
     * Creates an Etudiant with a given id (String) and questions (List)
     * @param id
     * @param questions
     * @return
     */
    private Etudiant createEtudiant(String id, List<Question> questions) {
        Etudiant etu = new Etudiant();
        etu.setId(id);
        etu.setQuestions(questions);
        return etu;
    }
}
