package com.ensim.choixAstreIPS.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Question {
    @Id
    protected int index;
    protected String intitule;

    public Question(){}

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
