package com.example.demo.sevice;

import org.junit.Test;


import static org.junit.Assert.*;

public class JunitDemoTest  {

    @Test
    public void add() {
        assertEquals(5,new JunitDemo().add(3,3));
    }
}