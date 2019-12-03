package com.example.demo.sevice;


import org.springframework.stereotype.Service;

@Service
public class JunitAutoWired {
    private JunitUtil util;
    int add(int numOne, int numTwo){
        return util.myAdd(numOne, numTwo);
    }
}
