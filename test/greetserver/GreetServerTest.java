/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package greetserver;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jcast
 */
public class GreetServerTest {
    
    public GreetServerTest() {
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

    /**
     * Test of main method, of class GreetServer.
     */
    @Test
    public void testMain() throws Exception {
        System.out.println("main");
        String[] args = null;
        GreetServer.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of start method, of class GreetServer.
     */
    @Test
    public void testStart() throws Exception {
        System.out.println("start");
        int port = 6666;
        GreetServer instance = new GreetServer();
        instance.start(port);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of stop method, of class GreetServer.
     */
    @Test
    public void testStop() throws Exception {
        System.out.println("stop");
        GreetServer instance = new GreetServer();
        instance.stop();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
