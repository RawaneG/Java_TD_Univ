package services;

import java.util.ArrayList;

public enum Bourse
{
    DEMI, ENTIERE;
    private ArrayList<NonLoge> nonloge;
    private ArrayList<Loge> loge;

    /*
     * Getter and Setter Logé
     */
    public ArrayList<Loge> getLoge() {
        return loge;
    }
    public void setLoge(ArrayList<Loge> loge) {
        this.loge = loge;
    }
    /*
     * Getter and Setter Non Logé
     */
    public ArrayList<NonLoge> getNonloge() {
        return nonloge;
    }
    public void setNonloge(ArrayList<NonLoge> nonloge) {
        this.nonloge = nonloge;
    }
}
