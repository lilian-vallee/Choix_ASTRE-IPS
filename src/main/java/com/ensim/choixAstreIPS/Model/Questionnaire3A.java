package com.ensim.choixAstreIPS.Model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Questionnaire3A {

    @JsonProperty("Timestamp")
    private String timestamp;
    @JsonProperty("1-Quel est ton numéro étudiant ?")
    private Integer _1QuelEstTonNumRoTudiant;
    @JsonProperty("2-D'où viens tu ?")
    private String _2DOViensTu;
    @JsonProperty("3-Quel parcours avez vous fait avant d’intégrer l'ensim")
    private String _3QuelParcoursAvezVousFaitAvantDIntGrerLEnsim;
    @JsonProperty("4-As-tu déjà passé le TOEIC ? Tu peux mettre ton score dans autre")
    private String _4AsTuDJPassLeTOEICTuPeuxMettreTonScoreDansAutre;
    @JsonProperty("5-Quelles sont les associations de l'ensim qui t’intéresse ?")
    private String _5QuellesSontLesAssociationsDeLEnsimQuiTIntResse;
    @JsonProperty("5-Plutôt...")
    private String _5PlutT;
    @JsonProperty("6-Quel est ton personnage de fiction préféré ?")
    private String _6QuelEstTonPersonnageDeFictionPrFR;
    @JsonProperty("7-Que fais-tu de ton temps libre ?")
    private String _7QueFaisTuDeTonTempsLibre;
    @JsonProperty("8-Quels sont tes films/séries préférées ?")
    private String _8QuelsSontTesFilmsSRiesPrFREs;
    @JsonProperty("9-Quel est ton navigateur préféré ?")
    private String _9QuelEstTonNavigateurPrFR;
    @JsonProperty("10-Quel langage de programmation as-tu déjà utilisé ?")
    private String _10QuelLangageDeProgrammationAsTuDJUtilis;
    @JsonProperty("11-As-tu déjà utilisé ? [Une carte Arduino/Raspberry]")
    private String _11AsTuDJUtilisUneCarteArduinoRaspberry;
    @JsonProperty("11-As-tu déjà utilisé ? [Des logiciels de retouche (Paint, Photoshop)]")
    private String _11AsTuDJUtilisDesLogicielsDeRetouchePaintPhotoshop;
    @JsonProperty("11-As-tu déjà utilisé ? [Linux]")
    private String _11AsTuDJUtilisLinux;
    @JsonProperty("11-As-tu déjà utilisé ? [Mac]")
    private String _11AsTuDJUtilisMac;
    @JsonProperty("11-As-tu déjà utilisé ? [Windows]")
    private String _11AsTuDJUtilisWindows;
    @JsonProperty("11-As-tu déjà utilisé ? [Des logiciels de montage vidéo]")
    private String _11AsTuDJUtilisDesLogicielsDeMontageVidO;
    @JsonProperty("11-As-tu déjà utilisé ? [Des logiciels de CAO (solidworks)]")
    private String _11AsTuDJUtilisDesLogicielsDeCAOSolidworks;
    @JsonProperty("11-As-tu déjà utilisé ? [Des logiciels de création de jeux vidéos (Unity, Unreal)]")
    private String _11AsTuDJUtilisDesLogicielsDeCrAtionDeJeuxVidOsUnityUnreal;
    @JsonProperty("12-As-tu déjà réalisé ? [Des logos]")
    private String _12AsTuDJRAlisDesLogos;
    @JsonProperty("12-As-tu déjà réalisé ? [Un robot]")
    private String _12AsTuDJRAlisUnRobot;
    @JsonProperty("12-As-tu déjà réalisé ? [Une application mobile]")
    private String _12AsTuDJRAlisUneApplicationMobile;
    @JsonProperty("12-As-tu déjà réalisé ? [Un jeu video]")
    private String _12AsTuDJRAlisUnJeuVideo;
    @JsonProperty("12-As-tu déjà réalisé ? [Un logiciel sur pc]")
    private String _12AsTuDJRAlisUnLogicielSurPc;
    @JsonProperty("12-As-tu déjà réalisé ? [Un système électronique (capteurs...)]")
    private String _12AsTuDJRAlisUnSystMeLectroniqueCapteurs;
    @JsonProperty("13-Que penses-tu de ? [Visual studio]")
    private String _13QuePensesTuDeVisualStudio;
    @JsonProperty("13-Que penses-tu de ? [NotePad++]")
    private String _13QuePensesTuDeNotePad;
    @JsonProperty("13-Que penses-tu de ? [Codblock]")
    private String _13QuePensesTuDeCodblock;
    @JsonProperty("13-Que penses-tu de ? [AndroidStudio]")
    private String _13QuePensesTuDeAndroidStudio;
    @JsonProperty("13-Que penses-tu de ? [Eclipse]")
    private String _13QuePensesTuDeEclipse;
    @JsonProperty("13-Que penses-tu de ? [IntellJ]")
    private String _13QuePensesTuDeIntellJ;
    @JsonProperty("13-Que penses-tu de ? [LabView]")
    private String _13QuePensesTuDeLabView;
    @JsonProperty("13-Que penses-tu de ? [Unity]")
    private String _13QuePensesTuDeUnity;
    @JsonProperty("13-Que penses-tu de ? [UnrealEngine]")
    private String _13QuePensesTuDeUnrealEngine;
    @JsonProperty("13-Que penses-tu de ? [SublimeText]")
    private String _13QuePensesTuDeSublimeText;
    @JsonProperty("13-Que penses-tu de ? [Atom]")
    private String _13QuePensesTuDeAtom;
    @JsonProperty("13-Que penses-tu de ? [Anaconda]")
    private String _13QuePensesTuDeAnaconda;
    @JsonProperty("13-Que penses-tu de ? [Ionic]")
    private String _13QuePensesTuDeIonic;


    public List<String> getAll() {
        List<String> list = new ArrayList<>();
        list.add(timestamp);
        list.add(String.valueOf(_1QuelEstTonNumRoTudiant));
        list.add(_2DOViensTu);
        list.add(_3QuelParcoursAvezVousFaitAvantDIntGrerLEnsim);
        list.add(_4AsTuDJPassLeTOEICTuPeuxMettreTonScoreDansAutre);
        list.add(_5QuellesSontLesAssociationsDeLEnsimQuiTIntResse);
        list.add(_5PlutT);
        list.add(_6QuelEstTonPersonnageDeFictionPrFR);
        list.add(_7QueFaisTuDeTonTempsLibre);
        list.add(_8QuelsSontTesFilmsSRiesPrFREs);
        list.add(_9QuelEstTonNavigateurPrFR);
        list.add(_10QuelLangageDeProgrammationAsTuDJUtilis);
        list.add(_11AsTuDJUtilisUneCarteArduinoRaspberry);
        list.add(_11AsTuDJUtilisDesLogicielsDeRetouchePaintPhotoshop);
        list.add(_11AsTuDJUtilisLinux);
        list.add(_11AsTuDJUtilisMac);
        list.add(_11AsTuDJUtilisWindows);
        list.add(_11AsTuDJUtilisDesLogicielsDeMontageVidO);
        list.add(_11AsTuDJUtilisDesLogicielsDeCAOSolidworks);
        list.add(_11AsTuDJUtilisDesLogicielsDeCrAtionDeJeuxVidOsUnityUnreal);
        list.add(_12AsTuDJRAlisDesLogos);
        list.add(_12AsTuDJRAlisUnRobot);
        list.add(_12AsTuDJRAlisUneApplicationMobile);
        list.add(_12AsTuDJRAlisUnJeuVideo);
        list.add(_12AsTuDJRAlisUnLogicielSurPc);
        list.add(_12AsTuDJRAlisUnSystMeLectroniqueCapteurs);
        list.add(_13QuePensesTuDeVisualStudio);
        list.add(_13QuePensesTuDeNotePad);
        list.add(_13QuePensesTuDeCodblock);
        list.add(_13QuePensesTuDeAndroidStudio);
        list.add(_13QuePensesTuDeEclipse);
        list.add(_13QuePensesTuDeIntellJ);
        list.add(_13QuePensesTuDeLabView);
        list.add(_13QuePensesTuDeUnity);
        list.add(_13QuePensesTuDeUnrealEngine);
        list.add(_13QuePensesTuDeSublimeText);
        list.add(_13QuePensesTuDeAtom);
        list.add(_13QuePensesTuDeAnaconda);
        list.add(_13QuePensesTuDeIonic);
        return list;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public Integer get1QuelEstTonNumRoTudiant() {
        return _1QuelEstTonNumRoTudiant;
    }

    public void set1QuelEstTonNumRoTudiant(Integer _1QuelEstTonNumRoTudiant) {
        this._1QuelEstTonNumRoTudiant = _1QuelEstTonNumRoTudiant;
    }

    public String get2DOViensTu() {
        return _2DOViensTu;
    }

    public void set2DOViensTu(String _2DOViensTu) {
        this._2DOViensTu = _2DOViensTu;
    }

    public String get3QuelParcoursAvezVousFaitAvantDIntGrerLEnsim() {
        return _3QuelParcoursAvezVousFaitAvantDIntGrerLEnsim;
    }

    public void set3QuelParcoursAvezVousFaitAvantDIntGrerLEnsim(String _3QuelParcoursAvezVousFaitAvantDIntGrerLEnsim) {
        this._3QuelParcoursAvezVousFaitAvantDIntGrerLEnsim = _3QuelParcoursAvezVousFaitAvantDIntGrerLEnsim;
    }

    public String get4AsTuDJPassLeTOEICTuPeuxMettreTonScoreDansAutre() {
        return _4AsTuDJPassLeTOEICTuPeuxMettreTonScoreDansAutre;
    }

    public void set4AsTuDJPassLeTOEICTuPeuxMettreTonScoreDansAutre(String _4AsTuDJPassLeTOEICTuPeuxMettreTonScoreDansAutre) {
        this._4AsTuDJPassLeTOEICTuPeuxMettreTonScoreDansAutre = _4AsTuDJPassLeTOEICTuPeuxMettreTonScoreDansAutre;
    }

    public String get5QuellesSontLesAssociationsDeLEnsimQuiTIntResse() {
        return _5QuellesSontLesAssociationsDeLEnsimQuiTIntResse;
    }

    public void set5QuellesSontLesAssociationsDeLEnsimQuiTIntResse(String _5QuellesSontLesAssociationsDeLEnsimQuiTIntResse) {
        this._5QuellesSontLesAssociationsDeLEnsimQuiTIntResse = _5QuellesSontLesAssociationsDeLEnsimQuiTIntResse;
    }

    public String get5PlutT() {
        return _5PlutT;
    }

    public void set5PlutT(String _5PlutT) {
        this._5PlutT = _5PlutT;
    }

    public String get6QuelEstTonPersonnageDeFictionPrFR() {
        return _6QuelEstTonPersonnageDeFictionPrFR;
    }

    public void set6QuelEstTonPersonnageDeFictionPrFR(String _6QuelEstTonPersonnageDeFictionPrFR) {
        this._6QuelEstTonPersonnageDeFictionPrFR = _6QuelEstTonPersonnageDeFictionPrFR;
    }

    public String get7QueFaisTuDeTonTempsLibre() {
        return _7QueFaisTuDeTonTempsLibre;
    }

    public void set7QueFaisTuDeTonTempsLibre(String _7QueFaisTuDeTonTempsLibre) {
        this._7QueFaisTuDeTonTempsLibre = _7QueFaisTuDeTonTempsLibre;
    }

    public String get8QuelsSontTesFilmsSRiesPrFREs() {
        return _8QuelsSontTesFilmsSRiesPrFREs;
    }

    public void set8QuelsSontTesFilmsSRiesPrFREs(String _8QuelsSontTesFilmsSRiesPrFREs) {
        this._8QuelsSontTesFilmsSRiesPrFREs = _8QuelsSontTesFilmsSRiesPrFREs;
    }

    public String get9QuelEstTonNavigateurPrFR() {
        return _9QuelEstTonNavigateurPrFR;
    }

    public void set9QuelEstTonNavigateurPrFR(String _9QuelEstTonNavigateurPrFR) {
        this._9QuelEstTonNavigateurPrFR = _9QuelEstTonNavigateurPrFR;
    }

    public String get10QuelLangageDeProgrammationAsTuDJUtilis() {
        return _10QuelLangageDeProgrammationAsTuDJUtilis;
    }

    public void set10QuelLangageDeProgrammationAsTuDJUtilis(String _10QuelLangageDeProgrammationAsTuDJUtilis) {
        this._10QuelLangageDeProgrammationAsTuDJUtilis = _10QuelLangageDeProgrammationAsTuDJUtilis;
    }

    public String get11AsTuDJUtilisUneCarteArduinoRaspberry() {
        return _11AsTuDJUtilisUneCarteArduinoRaspberry;
    }

    public void set11AsTuDJUtilisUneCarteArduinoRaspberry(String _11AsTuDJUtilisUneCarteArduinoRaspberry) {
        this._11AsTuDJUtilisUneCarteArduinoRaspberry = _11AsTuDJUtilisUneCarteArduinoRaspberry;
    }

    public String get11AsTuDJUtilisDesLogicielsDeRetouchePaintPhotoshop() {
        return _11AsTuDJUtilisDesLogicielsDeRetouchePaintPhotoshop;
    }

    public void set11AsTuDJUtilisDesLogicielsDeRetouchePaintPhotoshop(String _11AsTuDJUtilisDesLogicielsDeRetouchePaintPhotoshop) {
        this._11AsTuDJUtilisDesLogicielsDeRetouchePaintPhotoshop = _11AsTuDJUtilisDesLogicielsDeRetouchePaintPhotoshop;
    }

    public String get11AsTuDJUtilisLinux() {
        return _11AsTuDJUtilisLinux;
    }

    public void set11AsTuDJUtilisLinux(String _11AsTuDJUtilisLinux) {
        this._11AsTuDJUtilisLinux = _11AsTuDJUtilisLinux;
    }

    public String get11AsTuDJUtilisMac() {
        return _11AsTuDJUtilisMac;
    }

    public void set11AsTuDJUtilisMac(String _11AsTuDJUtilisMac) {
        this._11AsTuDJUtilisMac = _11AsTuDJUtilisMac;
    }

    public String get11AsTuDJUtilisWindows() {
        return _11AsTuDJUtilisWindows;
    }

    public void set11AsTuDJUtilisWindows(String _11AsTuDJUtilisWindows) {
        this._11AsTuDJUtilisWindows = _11AsTuDJUtilisWindows;
    }

    public String get11AsTuDJUtilisDesLogicielsDeMontageVidO() {
        return _11AsTuDJUtilisDesLogicielsDeMontageVidO;
    }

    public void set11AsTuDJUtilisDesLogicielsDeMontageVidO(String _11AsTuDJUtilisDesLogicielsDeMontageVidO) {
        this._11AsTuDJUtilisDesLogicielsDeMontageVidO = _11AsTuDJUtilisDesLogicielsDeMontageVidO;
    }

    public String get11AsTuDJUtilisDesLogicielsDeCAOSolidworks() {
        return _11AsTuDJUtilisDesLogicielsDeCAOSolidworks;
    }

    public void set11AsTuDJUtilisDesLogicielsDeCAOSolidworks(String _11AsTuDJUtilisDesLogicielsDeCAOSolidworks) {
        this._11AsTuDJUtilisDesLogicielsDeCAOSolidworks = _11AsTuDJUtilisDesLogicielsDeCAOSolidworks;
    }

    public String get11AsTuDJUtilisDesLogicielsDeCrAtionDeJeuxVidOsUnityUnreal() {
        return _11AsTuDJUtilisDesLogicielsDeCrAtionDeJeuxVidOsUnityUnreal;
    }

    public void set11AsTuDJUtilisDesLogicielsDeCrAtionDeJeuxVidOsUnityUnreal(String _11AsTuDJUtilisDesLogicielsDeCrAtionDeJeuxVidOsUnityUnreal) {
        this._11AsTuDJUtilisDesLogicielsDeCrAtionDeJeuxVidOsUnityUnreal = _11AsTuDJUtilisDesLogicielsDeCrAtionDeJeuxVidOsUnityUnreal;
    }

    public String get12AsTuDJRAlisDesLogos() {
        return _12AsTuDJRAlisDesLogos;
    }

    public void set12AsTuDJRAlisDesLogos(String _12AsTuDJRAlisDesLogos) {
        this._12AsTuDJRAlisDesLogos = _12AsTuDJRAlisDesLogos;
    }

    public String get12AsTuDJRAlisUnRobot() {
        return _12AsTuDJRAlisUnRobot;
    }

    public void set12AsTuDJRAlisUnRobot(String _12AsTuDJRAlisUnRobot) {
        this._12AsTuDJRAlisUnRobot = _12AsTuDJRAlisUnRobot;
    }

    public String get12AsTuDJRAlisUneApplicationMobile() {
        return _12AsTuDJRAlisUneApplicationMobile;
    }

    public void set12AsTuDJRAlisUneApplicationMobile(String _12AsTuDJRAlisUneApplicationMobile) {
        this._12AsTuDJRAlisUneApplicationMobile = _12AsTuDJRAlisUneApplicationMobile;
    }

    public String get12AsTuDJRAlisUnJeuVideo() {
        return _12AsTuDJRAlisUnJeuVideo;
    }

    public void set12AsTuDJRAlisUnJeuVideo(String _12AsTuDJRAlisUnJeuVideo) {
        this._12AsTuDJRAlisUnJeuVideo = _12AsTuDJRAlisUnJeuVideo;
    }

    public String get12AsTuDJRAlisUnLogicielSurPc() {
        return _12AsTuDJRAlisUnLogicielSurPc;
    }

    public void set12AsTuDJRAlisUnLogicielSurPc(String _12AsTuDJRAlisUnLogicielSurPc) {
        this._12AsTuDJRAlisUnLogicielSurPc = _12AsTuDJRAlisUnLogicielSurPc;
    }

    public String get12AsTuDJRAlisUnSystMeLectroniqueCapteurs() {
        return _12AsTuDJRAlisUnSystMeLectroniqueCapteurs;
    }

    public void set12AsTuDJRAlisUnSystMeLectroniqueCapteurs(String _12AsTuDJRAlisUnSystMeLectroniqueCapteurs) {
        this._12AsTuDJRAlisUnSystMeLectroniqueCapteurs = _12AsTuDJRAlisUnSystMeLectroniqueCapteurs;
    }

    public String get13QuePensesTuDeVisualStudio() {
        return _13QuePensesTuDeVisualStudio;
    }

    public void set13QuePensesTuDeVisualStudio(String _13QuePensesTuDeVisualStudio) {
        this._13QuePensesTuDeVisualStudio = _13QuePensesTuDeVisualStudio;
    }

    public String get13QuePensesTuDeNotePad() {
        return _13QuePensesTuDeNotePad;
    }

    public void set13QuePensesTuDeNotePad(String _13QuePensesTuDeNotePad) {
        this._13QuePensesTuDeNotePad = _13QuePensesTuDeNotePad;
    }

    public String get13QuePensesTuDeCodblock() {
        return _13QuePensesTuDeCodblock;
    }

    public void set13QuePensesTuDeCodblock(String _13QuePensesTuDeCodblock) {
        this._13QuePensesTuDeCodblock = _13QuePensesTuDeCodblock;
    }

    public String get13QuePensesTuDeAndroidStudio() {
        return _13QuePensesTuDeAndroidStudio;
    }

    public void set13QuePensesTuDeAndroidStudio(String _13QuePensesTuDeAndroidStudio) {
        this._13QuePensesTuDeAndroidStudio = _13QuePensesTuDeAndroidStudio;
    }

    public String get13QuePensesTuDeEclipse() {
        return _13QuePensesTuDeEclipse;
    }

    public void set13QuePensesTuDeEclipse(String _13QuePensesTuDeEclipse) {
        this._13QuePensesTuDeEclipse = _13QuePensesTuDeEclipse;
    }

    public String get13QuePensesTuDeIntellJ() {
        return _13QuePensesTuDeIntellJ;
    }

    public void set13QuePensesTuDeIntellJ(String _13QuePensesTuDeIntellJ) {
        this._13QuePensesTuDeIntellJ = _13QuePensesTuDeIntellJ;
    }

    public String get13QuePensesTuDeLabView() {
        return _13QuePensesTuDeLabView;
    }

    public void set13QuePensesTuDeLabView(String _13QuePensesTuDeLabView) {
        this._13QuePensesTuDeLabView = _13QuePensesTuDeLabView;
    }

    public String get13QuePensesTuDeUnity() {
        return _13QuePensesTuDeUnity;
    }

    public void set13QuePensesTuDeUnity(String _13QuePensesTuDeUnity) {
        this._13QuePensesTuDeUnity = _13QuePensesTuDeUnity;
    }

    public String get13QuePensesTuDeUnrealEngine() {
        return _13QuePensesTuDeUnrealEngine;
    }

    public void set13QuePensesTuDeUnrealEngine(String _13QuePensesTuDeUnrealEngine) {
        this._13QuePensesTuDeUnrealEngine = _13QuePensesTuDeUnrealEngine;
    }

    public String get13QuePensesTuDeSublimeText() {
        return _13QuePensesTuDeSublimeText;
    }

    public void set13QuePensesTuDeSublimeText(String _13QuePensesTuDeSublimeText) {
        this._13QuePensesTuDeSublimeText = _13QuePensesTuDeSublimeText;
    }

    public String get13QuePensesTuDeAtom() {
        return _13QuePensesTuDeAtom;
    }

    public void set13QuePensesTuDeAtom(String _13QuePensesTuDeAtom) {
        this._13QuePensesTuDeAtom = _13QuePensesTuDeAtom;
    }

    public String get13QuePensesTuDeAnaconda() {
        return _13QuePensesTuDeAnaconda;
    }

    public void set13QuePensesTuDeAnaconda(String _13QuePensesTuDeAnaconda) {
        this._13QuePensesTuDeAnaconda = _13QuePensesTuDeAnaconda;
    }

    public String get13QuePensesTuDeIonic() {
        return _13QuePensesTuDeIonic;
    }

    public void set13QuePensesTuDeIonic(String _13QuePensesTuDeIonic) {
        this._13QuePensesTuDeIonic = _13QuePensesTuDeIonic;
    }

    @Override
    public String toString() {
        return "Questionnaire3A{" +
                "timestamp='" + timestamp + '\'' +
                ", _1QuelEstTonNumRoTudiant=" + _1QuelEstTonNumRoTudiant +
                ", _2DOViensTu='" + _2DOViensTu + '\'' +
                ", _3QuelParcoursAvezVousFaitAvantDIntGrerLEnsim='" + _3QuelParcoursAvezVousFaitAvantDIntGrerLEnsim + '\'' +
                ", _4AsTuDJPassLeTOEICTuPeuxMettreTonScoreDansAutre='" + _4AsTuDJPassLeTOEICTuPeuxMettreTonScoreDansAutre + '\'' +
                ", _5QuellesSontLesAssociationsDeLEnsimQuiTIntResse='" + _5QuellesSontLesAssociationsDeLEnsimQuiTIntResse + '\'' +
                ", _5PlutT='" + _5PlutT + '\'' +
                ", _6QuelEstTonPersonnageDeFictionPrFR='" + _6QuelEstTonPersonnageDeFictionPrFR + '\'' +
                ", _7QueFaisTuDeTonTempsLibre='" + _7QueFaisTuDeTonTempsLibre + '\'' +
                ", _8QuelsSontTesFilmsSRiesPrFREs='" + _8QuelsSontTesFilmsSRiesPrFREs + '\'' +
                ", _9QuelEstTonNavigateurPrFR='" + _9QuelEstTonNavigateurPrFR + '\'' +
                ", _10QuelLangageDeProgrammationAsTuDJUtilis='" + _10QuelLangageDeProgrammationAsTuDJUtilis + '\'' +
                ", _11AsTuDJUtilisUneCarteArduinoRaspberry='" + _11AsTuDJUtilisUneCarteArduinoRaspberry + '\'' +
                ", _11AsTuDJUtilisDesLogicielsDeRetouchePaintPhotoshop='" + _11AsTuDJUtilisDesLogicielsDeRetouchePaintPhotoshop + '\'' +
                ", _11AsTuDJUtilisLinux='" + _11AsTuDJUtilisLinux + '\'' +
                ", _11AsTuDJUtilisMac='" + _11AsTuDJUtilisMac + '\'' +
                ", _11AsTuDJUtilisWindows='" + _11AsTuDJUtilisWindows + '\'' +
                ", _11AsTuDJUtilisDesLogicielsDeMontageVidO='" + _11AsTuDJUtilisDesLogicielsDeMontageVidO + '\'' +
                ", _11AsTuDJUtilisDesLogicielsDeCAOSolidworks='" + _11AsTuDJUtilisDesLogicielsDeCAOSolidworks + '\'' +
                ", _11AsTuDJUtilisDesLogicielsDeCrAtionDeJeuxVidOsUnityUnreal='" + _11AsTuDJUtilisDesLogicielsDeCrAtionDeJeuxVidOsUnityUnreal + '\'' +
                ", _12AsTuDJRAlisDesLogos='" + _12AsTuDJRAlisDesLogos + '\'' +
                ", _12AsTuDJRAlisUnRobot='" + _12AsTuDJRAlisUnRobot + '\'' +
                ", _12AsTuDJRAlisUneApplicationMobile='" + _12AsTuDJRAlisUneApplicationMobile + '\'' +
                ", _12AsTuDJRAlisUnJeuVideo='" + _12AsTuDJRAlisUnJeuVideo + '\'' +
                ", _12AsTuDJRAlisUnLogicielSurPc='" + _12AsTuDJRAlisUnLogicielSurPc + '\'' +
                ", _12AsTuDJRAlisUnSystMeLectroniqueCapteurs='" + _12AsTuDJRAlisUnSystMeLectroniqueCapteurs + '\'' +
                ", _13QuePensesTuDeVisualStudio='" + _13QuePensesTuDeVisualStudio + '\'' +
                ", _13QuePensesTuDeNotePad='" + _13QuePensesTuDeNotePad + '\'' +
                ", _13QuePensesTuDeCodblock='" + _13QuePensesTuDeCodblock + '\'' +
                ", _13QuePensesTuDeAndroidStudio='" + _13QuePensesTuDeAndroidStudio + '\'' +
                ", _13QuePensesTuDeEclipse='" + _13QuePensesTuDeEclipse + '\'' +
                ", _13QuePensesTuDeIntellJ='" + _13QuePensesTuDeIntellJ + '\'' +
                ", _13QuePensesTuDeLabView='" + _13QuePensesTuDeLabView + '\'' +
                ", _13QuePensesTuDeUnity='" + _13QuePensesTuDeUnity + '\'' +
                ", _13QuePensesTuDeUnrealEngine='" + _13QuePensesTuDeUnrealEngine + '\'' +
                ", _13QuePensesTuDeSublimeText='" + _13QuePensesTuDeSublimeText + '\'' +
                ", _13QuePensesTuDeAtom='" + _13QuePensesTuDeAtom + '\'' +
                ", _13QuePensesTuDeAnaconda='" + _13QuePensesTuDeAnaconda + '\'' +
                ", _13QuePensesTuDeIonic='" + _13QuePensesTuDeIonic + '\'' +
                '}';
    }
}
