package com.ensim.choixAstreIPS.Model;

import java.util.ArrayList;
import java.util.List;

public class QuestionModel extends Question{

    private List<MotCle> motsCles = new ArrayList<MotCle>();
    private double coeff;

    public List<MotCle> getMotsCles() {
        return motsCles;
    }

    public void setMotsCles(List<MotCle> motsCles) {
        this.motsCles = motsCles;
    }

    public double getCoeff() {
        return coeff;
    }

    public void setCoeff(double coeff) {
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
    public QuestionModel(int index, String intitule, Double coeff) {
        super(index,intitule);
        this.coeff = coeff;
    }

    //Methodes
    //==========================================================================

    public Boolean addMotCle(MotCle motCle){
        motsCles.add(motCle);
        return true;
    }

    @Override
    public String toString() {
        return "QuestionModel{" +
                "motsCles=" + motsCles +
                ", coeff=" + coeff +
                ", index=" + index +
                ", intitule='" + intitule + '\'' +
                '}';
    }
}
