package com.ensim.choixAstreIPS;

import com.ensim.choixAstreIPS.Model.QuestionModel;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoteurTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void saveModel() {
        Moteur m = new Moteur();
        QuestionModel qm = new QuestionModel("1","Question?", 0.2f);

        m.addModel(qm);
        m.saveModel("Test_save_model");
    }
}