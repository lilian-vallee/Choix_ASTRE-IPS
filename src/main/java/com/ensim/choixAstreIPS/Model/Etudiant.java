package com.ensim.choixAstreIPS.Model;

import java.util.List;

public class Etudiant {
    private String id;
    private List<Question> questions;

    public Etudiant(String id, List<Question> questions) {
        this.id = id;
        this.questions = questions;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

    @Override
    public String toString() {
        return "Etudiant{" +
                "id='" + id + '\'' +
                ", questions=" + questions +
                '}';
    }
}
