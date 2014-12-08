/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dto.ValgfagResultat;
import entity.Puljer;
import entity.Student;
import entity.Valgfag;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.DefaultListModel;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ahmed
 */
public class ControllerTest {
    
    Controller instance;

    public ControllerTest()
    {
    }

    @BeforeClass
    public static void setUpClass()
    {
         EntityManager em;
        em = Persistence.createEntityManagerFactory("XPScrumProjektPU").createEntityManager();
         em.getTransaction().begin();
        try
        {
           Query q = em.createNativeQuery("delete from puljer");
        q.executeUpdate();
        
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

    @AfterClass
    public static void tearDownClass()
    {
        EntityManager em;
        
        em = Persistence.createEntityManagerFactory("XPScrumProjektPU").createEntityManager();
         em.getTransaction().begin();
        try
        {
        Query q = em.createNativeQuery("delete from puljer");
        q.executeUpdate();
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

    @Before
    public void setUp()
    {
        instance = new Controller();
        
        EntityManager em;
        em = Persistence.createEntityManagerFactory("XPScrumProjektPU").createEntityManager();
        int stud_id = 999;
        Student result = em.find(Student.class, stud_id);
      
        em.getTransaction().begin();
        if(result != null){
        try
        {
            
            em.remove(result);
            em.getTransaction().commit();
            
        } catch (Exception e)
        {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally
        {
            em.close();
        }
        
         em = Persistence.createEntityManagerFactory("XPScrumProjektPU").createEntityManager();
         em.getTransaction().begin();
        try
        {
        
        Query q = em.createNativeQuery("delete from puljer");
        q.executeUpdate();
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

    @After
    public void tearDown()
    {
        EntityManager em;
        em = Persistence.createEntityManagerFactory("XPScrumProjektPU").createEntityManager();
         em.getTransaction().begin();
        try
        {
        Query q = em.createNativeQuery("delete from puljer");
        q.executeUpdate();
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

    /**
     * Test of flytFag method, of class Controller.
     */
    @Test
    public void testFlytFag()
    {
        System.out.println("flytFag");
        DefaultListModel modelFra = new DefaultListModel();
        Valgfag v = new Valgfag(1);
        v.setFag("Android");
        ValgfagResultat vfr = new ValgfagResultat(v, 2, 2);
        modelFra.addElement(vfr);
        Object valgteFag = modelFra.firstElement();
        DefaultListModel modelTil = new DefaultListModel();
        boolean expResult = true;
        boolean result = instance.flytFag(valgteFag, modelFra, modelTil);
        assertEquals(expResult, result);
    }

    /**
     * Test of visResultat method, of class Controller.
     */
    @Test
    public void testVisResultat() {
        System.out.println("visResultat");
        Controller instance = new Controller();
        ArrayList<ValgfagResultat> expResult = new ArrayList();
        
        Valgfag vf1 = new Valgfag(1);
        vf1.setFag("C#");
        ValgfagResultat r1 = new ValgfagResultat(vf1, 2, 2);
        expResult.add(r1);
        
        Valgfag vf2 = new Valgfag(2);
        vf2.setFag("Python");
        ValgfagResultat r2 = new ValgfagResultat(vf2, 2, 2);
        expResult.add(r2);
        
        Valgfag vf3 = new Valgfag(3);
        vf3.setFag("Haskel");
        ValgfagResultat r3 = new ValgfagResultat(vf3, 2, 2);
        expResult.add(r3);
        
        Valgfag vf4 = new Valgfag(4);
        vf4.setFag("Gaming");
        ValgfagResultat r4 = new ValgfagResultat(vf4, 1, 2);
        expResult.add(r4);
        
        Valgfag vf5 = new Valgfag(5);
        vf5.setFag("Android");
        ValgfagResultat r5 = new ValgfagResultat(vf5, 3, 2);
        expResult.add(r5);
        
        boolean expres = false;
        ArrayList<ValgfagResultat> result = instance.visResultat();
        if(expResult.size() == result.size()){
        for (int i = 0; i < expResult.size(); i++) {
            System.out.println(expResult.get(i));
            if(expResult.get(i).getFag().getFag().compareTo(result.get(i).getFag().getFag()) == 0 && 
               expResult.get(i).getPriotet1() == result.get(i).getPriotet1() &&
               expResult.get(i).getPriotet2() == result.get(i).getPriotet2()){
                expres = true;
            }else{ expres = false;}
        }
        }
        assertTrue(expres);
        
    }

    /**
     * Test of gemPuljerIdb method, of class Controller.
     */
    @Test
    public void testGemPuljerIdb() {
        System.out.println("gemPuljerIdb");
        DefaultListModel puljeA = new DefaultListModel();
        DefaultListModel puljeB = new DefaultListModel();
        Collection <Puljer> expPulje = new ArrayList();
        
        Valgfag vf1 = new Valgfag(1);
        vf1.setFag("C#");
        ValgfagResultat r1 = new ValgfagResultat(vf1, 2, 2);
        puljeA.addElement(r1);
        Puljer p_a1 = new Puljer(vf1.getId(), "a");
        expPulje.add(p_a1);
        
        Valgfag vf2 = new Valgfag(2);
        vf2.setFag("Python");
        ValgfagResultat r2 = new ValgfagResultat(vf2, 2, 2);
        puljeA.addElement(r2);
        Puljer p_a2 = new Puljer(vf2.getId(), "a");
        expPulje.add(p_a2);
        
        Valgfag vf3 = new Valgfag(3);
        vf3.setFag("Haskel");
        ValgfagResultat r3 = new ValgfagResultat(vf3, 2, 2);
        puljeB.addElement(r3);
        Puljer p_b1 = new Puljer(vf3.getId(), "b");
        expPulje.add(p_b1);
        
        Valgfag vf4 = new Valgfag(4);
        vf4.setFag("Gaming");
        ValgfagResultat r4 = new ValgfagResultat(vf4, 1, 2);
        puljeB.addElement(r4);
        Puljer p_b2 = new Puljer(vf4.getId(), "b");
        expPulje.add(p_b2);
        
        Valgfag vf5 = new Valgfag(5);
        vf5.setFag("Android");
        ValgfagResultat r5 = new ValgfagResultat(vf5, 3, 2);
        puljeA.addElement(r5);
        Puljer p_a3 = new Puljer(vf5.getId(), "a");
        expPulje.add(p_a3);
        
        Controller instance = new Controller();
        instance.gemPuljerIdb(puljeA, puljeB);
        
        EntityManager em;
        em = Persistence.createEntityManagerFactory("XPScrumProjektPU").createEntityManager();
        
        Query q = em.createNamedQuery("Puljer.findAll");
        Collection<Puljer> result = q.getResultList();
        boolean expResult = false;
        Object[] resultat = result.toArray();
        Object[] expResultat = expPulje.toArray();
        
        if(result.size() == expPulje.size()){
            for (int i = 0; i < resultat.length ;i++) {
                    System.out.println(resultat[i]);
                    System.out.println(expResultat[i]);
                if(((Puljer)resultat[i]).getValgfagid() == ((Puljer)expResultat[i]).getValgfagid() &&
                    ((Puljer)resultat[i]).getPulje().compareTo(((Puljer)expResultat[i]).getPulje()) == 0){
                    System.out.println(resultat[i]);
                    System.out.println(expResultat[i]);
                expResult = true;
            }    
            }
            
            
        }
        
        
        assertTrue(expResult);
        
    }

    /**
     * Test of beregnTilfredshed method, of class Controller.
     */
    @Test
    public void testBeregnTilfredshed() {
        System.out.println("beregnTilfredshed");
        DefaultListModel pulje_A = null;
        DefaultListModel pulje_B = null;
        Controller instance = new Controller();
        List expResult = null;
        List result = instance.beregnTilfredshed(pulje_A, pulje_B);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of persist method, of class Controller.
     */
    @Test
    public void testPersist() {
        EntityManager em;
        em = Persistence.createEntityManagerFactory("XPScrumProjektPU").createEntityManager();
        System.out.println("persist");
        int stud_id = 999;
        Student expResult = new Student(stud_id);
        expResult.setNavn("test");
        Controller instance = new Controller();
        instance.persist(expResult);
        System.out.println("expResult " + expResult.toString());
        
        Student result = em.find(Student.class, stud_id);
        
        System.out.println("result " + result.toString());
        
        
        
        assertEquals(expResult, result);
        
    }
}
