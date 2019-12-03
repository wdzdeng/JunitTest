package com.example.demo.sevice;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.*;
@SpringBootTest
public class JunitAutoWiredTest {
    @Autowired
    JunitAutoWired junitAutoWired;
    @Test
    public void add() {
        assertEquals(5,junitAutoWired.add(1,3));
    }
}