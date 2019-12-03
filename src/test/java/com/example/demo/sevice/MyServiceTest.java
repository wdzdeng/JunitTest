package com.example.demo.sevice;

import com.example.demo.dao.MyDao;
import org.junit.Test;
import org.mockito.Mockito;
import org.powermock.reflect.Whitebox;

import static org.junit.Assert.*;

public class MyServiceTest {

    private MyService service;//mock对象要注入的类
    private MyDao dao;//需要mock的对象
    @Test
    public void hello() {
        service = new MyService();
        dao = Mockito.mock(MyDao.class);
        Whitebox.setInternalState(service,"myDao", dao);
        Mockito.when(dao.hello()).thenReturn("mock hello");//执行被mock掉对象的方法时，直接返回设定的返回值
        assertEquals("mock hello",service.hello());
    }
}