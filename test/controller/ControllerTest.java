/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
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
}
