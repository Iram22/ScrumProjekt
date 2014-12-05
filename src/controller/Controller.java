/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import javax.swing.DefaultListModel;

/**
 *
 * @author Ahmed
 */
public class Controller {

    public Controller()
    {

    }

    public boolean flytFag(Object valgteFag, DefaultListModel modelFra, DefaultListModel modelTil)
    {
        boolean fundet = modelFra.removeElement(valgteFag);
        if (fundet)
        {
            modelTil.addElement(valgteFag);
        }
        return fundet;
    }

    public ArrayList hentValgfagFraDB()
    {
        ArrayList valgfag = new ArrayList();
        valgfag.add("C#");
        valgfag.add("Android");
        valgfag.add("Python");
        valgfag.add("Dansk");

        return valgfag;
    }

}
