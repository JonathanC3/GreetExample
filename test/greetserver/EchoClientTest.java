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
public class EchoClientTest {
    
    public EchoClientTest() {
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
     * Test of startConnection method, of class EchoClient.
     */
    @Test
    public void testStartConnection() throws Exception {
        System.out.println("startConnection");
        String ip = "";
        int port = 6666;
        EchoClient instance = new EchoClient();
        instance.startConnection(ip, port);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sendMessage method, of class EchoClient.
     */
    @Test
    public void testSendMessage() throws Exception {
        System.out.println("sendMessage");
        String msg = "";
        EchoClient instance = new EchoClient();
        String expResult = "";
        String result = instance.sendMessage(msg);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of stopConnection method, of class EchoClient.
     */
    @Test
    public void testStopConnection() throws Exception {
        System.out.println("stopConnection");
        EchoClient instance = new EchoClient();
        instance.stopConnection();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
