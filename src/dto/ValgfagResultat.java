/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dto;

/**
 *
 * @author Dino Kalember
 */
public class ValgfagResultat {
    String fagnavn;
    int priotet1;
    int priotet2;

    public ValgfagResultat(String fagnavn, int priotet1, int priotet2) {
        this.fagnavn = fagnavn;
        this.priotet1 = priotet1;
        this.priotet2 = priotet2;
    }

    public String getFagnavn() {
        return fagnavn;
    }

    public void setFagnavn(String fagnavn) {
        this.fagnavn = fagnavn;
    }

    public int getPriotet1() {
        return priotet1;
    }

    public void setPriotet1(int priotet1) {
        this.priotet1 = priotet1;
    }

    public int getPriotet2() {
        return priotet2;
    }

    public void setPriotet2(int priotet2) {
        this.priotet2 = priotet2;
    }
    
}
