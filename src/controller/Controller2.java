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
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Dino Kalember
 */
public class Controller2 {
    
    @PersistenceContext(unitName = "ValgfagDBPU")
    private EntityManager em;

    
    public ArrayList<ValgfagResultat> visResultat()
    {
        em=Persistence.createEntityManagerFactory("ValgfagDBPU").createEntityManager();
        System.out.println(em);
        Query query = em.createNamedQuery("Valgfag.findAll");
        Query query2 = em.createNamedQuery("F\u00f8rsteRunde.findAll");
        ArrayList<ValgfagResultat> resultater = new ArrayList<>();
        Collection<Valgfag> valgfag = query.getResultList();
        
        for(Valgfag v : valgfag)
        {
            query2.setParameter("første_prioritetA", v.getId());
            Collection count = query2.getResultList();
            ValgfagResultat resultat = new ValgfagResultat(v.getFag(), Integer.parseInt(count.toArray()[0] + ""), 0);
            resultater.add(resultat);

        }
        return resultater;
    }
}
