package com.ensim.choixAstreIPS.Utils;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class QuestionUtils {
    private static final String[] questionsList = new String[]{"Timestamp",
    "1-Quel est ton numéro étudiant ?",
    "2-D'où viens tu ?",
    "3-Quel parcours avez vous fait avant d’intégrer l'ensim",
    "4-As-tu déjà passé le TOEIC ? Tu peux mettre ton score dans autre",
    "5-Quelles sont les associations de l'ensim qui t’intéresse ?",
    "5-Plutôt...",
    "6-Quel est ton personnage de fiction préféré ?",
    "7-Que fais-tu de ton temps libre ?",
    "8-Quels sont tes films/séries préférées ?",
    "9-Quel est ton navigateur préféré ?",
    "10-Quel langage de programmation as-tu déjà utilisé ?",
    "11-As-tu déjà utilisé ? [Une carte Arduino/Raspberry]",
    "11-As-tu déjà utilisé ? [Des logiciels de retouche (Paint, Photoshop)]",
    "11-As-tu déjà utilisé ? [Linux]",
    "11-As-tu déjà utilisé ? [Mac]",
    "11-As-tu déjà utilisé ? [Windows]",
    "11-As-tu déjà utilisé ? [Des logiciels de montage vidéo]",
    "11-As-tu déjà utilisé ? [Des logiciels de CAO (solidworks)]",
    "11-As-tu déjà utilisé ? [Des logiciels de création de jeux vidéos (Unity, Unreal)]",
    "12-As-tu déjà réalisé ? [Des logos]",
    "12-As-tu déjà réalisé ? [Un robot]",
    "12-As-tu déjà réalisé ? [Une application mobile]",
    "12-As-tu déjà réalisé ? [Un jeu video]",
    "12-As-tu déjà réalisé ? [Un logiciel sur pc]",
    "12-As-tu déjà réalisé ? [Un système électronique (capteurs...)]",
    "13-Que penses-tu de ? [Visual studio]",
    "13-Que penses-tu de ? [NotePad++]",
    "13-Que penses-tu de ? [Codblock]",
    "13-Que penses-tu de ? [AndroidStudio]",
    "13-Que penses-tu de ? [Eclipse]",
    "13-Que penses-tu de ? [IntellJ]",
    "13-Que penses-tu de ? [LabView]",
    "13-Que penses-tu de ? [Unity]",
    "13-Que penses-tu de ? [UnrealEngine]",
    "13-Que penses-tu de ? [SublimeText]",
    "13-Que penses-tu de ? [Atom]",
    "13-Que penses-tu de ? [Anaconda]",
    "13-Que penses-tu de ? [Ionic]"};

    public static String getQuestion(int index) {
        if(index < 0 || index > questionsList.length) return null;
        else return questionsList[index];
    }

}
