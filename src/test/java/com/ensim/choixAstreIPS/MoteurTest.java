package com.ensim.choixAstreIPS;

import com.ensim.choixAstreIPS.Model.MotCle;
import com.ensim.choixAstreIPS.Model.QuestionModel;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MoteurTest {

    Moteur m;
    QuestionModel qm;

    @BeforeEach
    void setUp() {
        m = new Moteur();
    }

    @Test
    void saveModel() {
        qm = new QuestionModel(1,"Question?", 0.2);

        MotCle mc = new MotCle("mot", 1, 5);
        qm.addMotCle(mc);

        m.addModel(qm);

        List<QuestionModel> want = m.getModels();

        m.saveModel("Test_save_model");
        m.loadModel("Test_save_model");

    }


    @Test
    void addModel() {

        qm = new QuestionModel(1,"Question?", 0.2);

        m.addModel(qm);

        assertEquals(1 , m.getModels().size());
    }

    @Test
    void loadModel() {
        m.loadModel("Test_save_model");
        qm = new QuestionModel(1,"Question?", 0.2);


    }

    @Test
    void loadQuestionnaire3A() {
        m.loadQuestionnaire3A();
        assertEquals( 37, m.getEtudiants().size() );
    }
}