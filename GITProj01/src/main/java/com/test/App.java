package com.test;

import com.nt.service.Arithmetic;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Arithmetic  ar=new Arithmetic();
        int result=ar.sum(10, 20);
        System.out.println("result::"+result);
    }
}
