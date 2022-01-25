package com.hongxin.junit.testpro;

import androidx.annotation.NonNull;

import java.io.Serializable;

public class Aaa implements Cloneable {


    @NonNull
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object obj = null;
        try {
            obj = super.clone();
        } catch (Exception e) {

        }

        return obj;
    }
}
