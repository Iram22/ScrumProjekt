/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dto.ValgfagResultat;
import java.util.ArrayList;
import java.util.List;
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
    }

    @AfterClass
    public static void tearDownClass()
    {
    }

    @Before
    public void setUp()
    {
        instance = new Controller();
    }

    @After
    public void tearDown()
    {
    }

    /**
     * Test of flytFag method, of class Controller.
     */
    @Test
    public void testFlytFag()
    {
        System.out.println("flytFag");
        DefaultListModel modelFra = new DefaultListModel();
        modelFra.addElement("Android");
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
        ArrayList<ValgfagResultat> expResult = null;
        ArrayList<ValgfagResultat> result = instance.visResultat();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of gemIDB method, of class Controller.
     */
    @Test
    public void testGemIDB() {
        System.out.println("gemIDB");
        DefaultListModel puljeA = null;
        DefaultListModel puljeB = null;
        Controller instance = new Controller();
        instance.gemIDB(puljeA, puljeB);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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
        System.out.println("persist");
        Object object = null;
        Controller instance = new Controller();
        instance.persist(object);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
