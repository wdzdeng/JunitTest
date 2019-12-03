package com.example.demo.sevice;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BeforeAndAfterTest {
    JunitDemo junitDemo;
    @Before
    public void before(){
        junitDemo = new JunitDemo();
    }
    @After
    public void after(){
        junitDemo = null;
    }
    @Test
    public void add1() {
        assertEquals(5,junitDemo.add(3,3));
    }
    @Test
    public void add2() {
        assertEquals(6,junitDemo.add(3,3));
    }
    @Test(expected = NumberFormatException.class)
    public void testNumberFormatException(){
        Integer.parseInt(null);
    }
    @Test(timeout = 200)
    public void testTimeOut() throws InterruptedException {
        Thread.sleep(100);
    }
}
