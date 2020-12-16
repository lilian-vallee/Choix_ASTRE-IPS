package com.ensim.choixAstreIPS.Model;

import javax.persistence.Embeddable;

@Embeddable
public class Reponse{

    private int index;
    private String intitule;

    private String reponse;

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getIntitule() {
        return intitule;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public String getReponse() {
        return reponse;
    }

    public void setReponse(String reponse) {
        this.reponse = reponse;
    }

    public Reponse(){super();}

    public Reponse(int index, String intitule, String reponse) {
        this.index = index;
        this.intitule = intitule;
        this.reponse = reponse;
    }

    @Override
    public String toString() {
        return "Reponse{" +
                "index='" + index + '\'' +
                ", intitulé='" + intitule + '\'' +
                ", reponse='" + reponse + '\'' +
                '}';
    }
}
