package com.example.demo.sevice;

import com.example.demo.dao.MyDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyService {
    @Autowired
    private MyDao myDao;
    public String hello(){
        return myDao.hello();
    }

}
