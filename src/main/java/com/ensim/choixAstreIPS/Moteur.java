package com.ensim.choixAstreIPS;


import com.ensim.choixAstreIPS.Model.Etudiant;
import com.ensim.choixAstreIPS.Model.QuestionModel;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Moteur {
    private List<QuestionModel> models;
    private List<Etudiant> etudiants;


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
            Logger.getAnonymousLogger().log(Level.WARNING,"Echec à l'ecriture de l'objet en String");
            return false;
        }
    }
}
