package com.ensim.choixAstreIPS.Model;

public class Reponse extends Question{

    private String reponse;

    public String getReponse() {
        return reponse;
    }

    public void setReponse(String reponse) {
        this.reponse = reponse;
    }

    public Reponse(int index, String intitule, String reponse) {
        super(index, intitule);
        this.reponse = reponse;
    }

    @Override
    public String toString() {
        return "Reponse{" +
                "reponse='" + reponse + '\'' +
                '}';
    }
}
