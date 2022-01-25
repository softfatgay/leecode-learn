package com.hongxin.junit.test;

public class MyClass {

    public static void main(String[] args) {
        testFor();
    }

    private static void testFor() {

        String a = null;

        for(;;){
            System.out.println("------------");
            if (a == null) {
                return;
            }

        }

    }
}