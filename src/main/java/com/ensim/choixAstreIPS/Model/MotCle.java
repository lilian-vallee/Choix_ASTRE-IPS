package com.ensim.choixAstreIPS.Model;

public class MotCle {

    //Attribut
    //==========================================================================

    private String mot;
    private int Ips;
    private int Astre;

    //Get/Set
    //==========================================================================


    public String getMot() {
        return mot;
    }

    public void setMot(String mot) {
        this.mot = mot;
    }

    public int getIps() {
        return Ips;
    }

    public Boolean setIps(int ips) {
        if (ips<0){
            return false;
        }
        else {
            Ips = ips;
            return true;
        }
    }

    public int getAstre() {
        return Astre;
    }

    public boolean setAstre(int astre) {
        if (astre<0){
            return false;
        }
        else {
            Astre = astre;
            return true;
        }
    }

    //Constructeur
    //==========================================================================

    /**
     * Creation d'un nouveau mot clé en entrant les différents parmamètre
     * @param mot
     * @param ips
     * @param astre
     */
    public MotCle(String mot, int ips, int astre) {
        this.mot = mot;
        Ips = ips;
        Astre = astre;
    }


}
