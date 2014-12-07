/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dto.ValgfagResultat;
import entity.Puljer;
import entity.Valgfag;
import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.DefaultListModel;

/**
 *
 * @author Ahmed
 */
public class Controller {

    private EntityManager em;

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

    public void gemIDB(DefaultListModel puljeA, DefaultListModel puljeB)
    {
        gemFagIPuljer("a", puljeA.toArray());
        gemFagIPuljer("b", puljeB.toArray());
    }

    private void gemFagIPuljer(String puljenavn, Object[] pulje)
    {
        for (int i = 0; i < pulje.length; i++)
        {
            persist(new Puljer(((ValgfagResultat)pulje[i]).getFag().getId(), puljenavn));
        }
    }

    public void persist(Object object)
    {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("XPScrumProjektPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        try
        {
            em.persist(object);
            em.getTransaction().commit();
        } catch (Exception e)
        {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally
        {
            em.close();
        }
    }
}
