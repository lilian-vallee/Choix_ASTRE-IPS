package com.ensim.choixAstreIPS.Model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Etudiant {
    @Id
    private String id;
    @ElementCollection
    private List<Reponse> reponses;

    public Etudiant(){}

    public Etudiant(String id, List<Reponse> reponses) {
        this.id = id;
        this.reponses = reponses;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Reponse> getReponses() {
        return reponses;
    }

    public void setReponses(List<Reponse> reponses) {
        this.reponses = reponses;
    }

    @Override
    public String toString() {
        return "Etudiant{" +
                "id='" + id + '\'' +
                ", reponses=" + reponses +
                '}';
    }
}
