package com.hongxin.junit.test.model;

public class Person implements Cloneable {

    Jack jack;
    Lily lily;

    int age;

    public Person() {
    }

    public Person(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Jack getJack() {
        return jack;
    }

    public void setJack(Jack jack) {
        this.jack = jack;
    }

    public Lily getLily() {
        return lily;
    }

    public void setLily(Lily lily) {
        this.lily = lily;
    }

}
