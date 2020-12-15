package com.ensim.choixAstreIPS.Model;

@Entity
@Table
public class Question {

    @Id
    private int index;
    private String intitule;

    public Question(int index, String intitule) {
        this.index = index;
        this.intitule = intitule;
    }

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

    @Override
    public String toString() {
        return "Question{" +
                "index='" + index + '\'' +
                ", intitulé='" + intitule + '\'' +
                '}';
    }
}
