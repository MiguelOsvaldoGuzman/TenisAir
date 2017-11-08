/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import DAO.ClickDAO;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
/**
 *
 * @author jose luis
 */
public class TestSaveHivernate {

    public TestSaveHivernate() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void hello() {
        int id = 1;
        System.out.println("El ID: " + id);
        ClickDAO insertarClick = new ClickDAO();

        System.out.println("El ID: " + id);
        insertarClick.saveaClick(-1, id);
    }
}
