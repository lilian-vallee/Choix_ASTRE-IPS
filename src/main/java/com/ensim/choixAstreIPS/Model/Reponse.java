package com.ensim.choixAstreIPS.Model;

import javax.persistence.Entity;

@Entity
public class Reponse extends Question{

    private String reponse;

    public String getReponse() {
        return reponse;
    }

    public void setReponse(String reponse) {
        this.reponse = reponse;
    }

    public Reponse(){super();}

    public Reponse(int index, String intitule, String reponse) {
        super(index, intitule);
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
