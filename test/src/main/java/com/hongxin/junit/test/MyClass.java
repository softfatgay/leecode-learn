package com.hongxin.junit.test;

import com.hongxin.junit.test.model.Person;

import java.util.concurrent.locks.ReentrantLock;

public class MyClass {

    public static void main(String[] args) {
        testFor();
    }

    private static void testFor() {
        int a = 16;
        int i = a << 1;
        System.out.println(i);
    }
}