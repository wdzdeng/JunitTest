package com.example.demo.sevice;

import org.springframework.stereotype.Service;

@Service
public class JunitUtil {
    public int myAdd(int numOne, int numTwo){
        return numOne + numTwo;
    }
}
