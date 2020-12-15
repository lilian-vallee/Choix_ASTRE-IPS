package com.ensim.choixAstreIPS.Model;

public class Question {
    private int index;
    private String reponse;

    public Question(int index, String reponse) {
        this.index = index;
        this.reponse = reponse;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getReponse() {
        return reponse;
    }

    public void setReponse(String reponse) {
        this.reponse = reponse;
    }

    @Override
    public String toString() {
        return "Question{" +
                "index='" + index + '\'' +
                ", reponse='" + reponse + '\'' +
                '}';
    }
}
