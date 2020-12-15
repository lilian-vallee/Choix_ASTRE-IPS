package com.ensim.choixAstreIPS.Model;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table
public class Etudiant {
    @Id
    private String id;
    @ElementCollection
    private List<Question> reponses;

    public Etudiant(String id, List<Question> questions) {
        this.id = id;
        this.reponses = questions;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Question> getQuestions() {
        return reponses;
    }

    public void setQuestions(List<Question> questions) {
        this.reponses = questions;
    }

    @Override
    public String toString() {
        return "Etudiant{" +
                "id='" + id + '\'' +
                ", questions=" + reponses +
                '}';
    }
}
