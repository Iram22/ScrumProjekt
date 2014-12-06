/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gui;

import java.util.ArrayList;
import java.util.Collection;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author Ahmed
 */
public class NewClass {
    public static void main(String[] args)
    {
        EntityManager em=Persistence.createEntityManagerFactory("ValgfagDBPU").createEntityManager();
        
        Query query2 = em.createNamedQuery("F\u00f8rsteRunde.findAll");
        
        Collection result = query2.getResultList();
        
        System.out.println(result.size());
    }
}
