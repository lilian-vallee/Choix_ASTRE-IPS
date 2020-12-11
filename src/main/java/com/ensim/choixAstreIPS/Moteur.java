package com.ensim.choixAstreIPS;


import com.ensim.choixAstreIPS.Model.Etudiant;
import com.ensim.choixAstreIPS.Model.QuestionModel;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Moteur {
    private List<QuestionModel> models;
    private List<Etudiant> etudiants;

    public Boolean saveModel(){
        try {

            ObjectMapper mapper = new ObjectMapper();
            mapper.writeValue(new File("src/main/resources/static/Save/Model_Save.json"), this.models);

            return true;
        } catch (IOException e) {
            Logger.getAnonymousLogger().log(Level.WARNING,"Echec à l'ecriture de l'objet en String");
            return false;
        }
    }
}
