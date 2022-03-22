package dailyCoding.day_12;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TestCheckIP {

    @Before
    public void beforeTest(){
        System.out.println("--------------------");
        System.out.println("Initializing Testing");
    }

    @Test
    public void testValidIP(){
        assertTrue(CheckIP.validateIP("1.1.1.1"));
        assertTrue(CheckIP.validateIP("192.168.1.1"));
        assertTrue(CheckIP.validateIP("10.0.0.1"));
        assertTrue(CheckIP.validateIP("127.0.0.1"));

        System.out.println("Valid IP Test Successful");
    }

    @Test
    public void testInValidIP(){
        assertFalse(CheckIP.validateIP("0.0.0.0"));
        assertFalse(CheckIP.validateIP("255.255.255.255"));
        assertFalse(CheckIP.validateIP("1.1.1.0"));
        assertFalse(CheckIP.validateIP("10.0.1"));

        System.out.println("Invalid IP Test Successful");
    }

    @After
    public void afterTest(){
        System.out.println("Completed Testing");
        System.out.println("--------------------");

    }

}
