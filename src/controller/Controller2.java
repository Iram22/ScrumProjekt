/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import dto.ValgfagResultat;
import entity.Valgfag;
import java.util.ArrayList;
import java.util.Collection;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author Dino Kalember
 */
public class Controller2 {
    
    //@PersistenceContext(unitName = "XPScrumProjektPU")
    private EntityManager em;

    public Controller2() {
        em = Persistence.createEntityManagerFactory("XPScrumProjektPU").createEntityManager();
    }
    
    

    public ArrayList<ValgfagResultat> visResultat()
    {
        Query query1 = em.createNamedQuery("Valgfag.findAll");
        Query query2 = em.createNamedQuery("FørsteRunde.findCount1");
        Query query3 = em.createNamedQuery("FørsteRunde.findCount2");
        
        ArrayList<ValgfagResultat> resultater = new ArrayList<>();
        Collection<Valgfag> valgfag = query1.getResultList();
        
        for(Valgfag v : valgfag)
        {
            query2.setParameter("førstePrioriteta", v);
            Collection count1 = query2.getResultList();
            
            query3.setParameter("andenPrioriteta", v);
            Collection count2 = query3.getResultList();
            
            ValgfagResultat resultat = new ValgfagResultat(v, Integer.parseInt(count1.toArray()[0] + ""), Integer.parseInt(count2.toArray()[0] + ""));
            resultater.add(resultat);

        }
        return resultater;
    }

   

}
