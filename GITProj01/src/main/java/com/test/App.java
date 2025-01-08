package com.test;

import com.nt.service.Arithmetic;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Arithmetic  ar=new Arithmetic();
        long result=ar.sum(30, 40);
        System.out.println("result::"+result);
    }
}
