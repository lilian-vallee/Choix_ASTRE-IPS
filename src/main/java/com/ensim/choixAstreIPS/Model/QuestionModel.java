package com.ensim.choixAstreIPS.Model;

import java.util.ArrayList;
import java.util.List;

public class QuestionModel {
    private String index;
    private String intitule;
    private List<MotCle> motsCles = new ArrayList<MotCle>();
    private float coeff;

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getIntitule() {
        return intitule;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public List<MotCle> getMotsCles() {
        return motsCles;
    }

    public void setMotsCles(List<MotCle> motsCles) {
        this.motsCles = motsCles;
    }

    public float getCoeff() {
        return coeff;
    }

    public void setCoeff(float coeff) {
        this.coeff = coeff;
    }


    //Constructeur
    //==========================================================================

    /**
     * Constructeur d'un model de question en rentrant manuellement l'index l'ititulé et son coéfficient
     * @param index
     * @param intitule
     * @param coeff
     */
    public QuestionModel(String index, String intitule, float coeff) {
        this.index = index;
        this.intitule = intitule;
        this.coeff = coeff;
    }
}
