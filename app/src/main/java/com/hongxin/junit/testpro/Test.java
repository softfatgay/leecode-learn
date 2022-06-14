package com.hongxin.junit.testpro;

import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;

import java.util.concurrent.ConcurrentHashMap;

public class Test implements Parcelable {
    String a;
    String b;


    protected Test(Parcel in) {
        a = in.readString();
        b = in.readString();
    }

    public static final Creator<Test> CREATOR = new Creator<Test>() {
        @Override
        public Test createFromParcel(Parcel in) {
            return new Test(in);
        }

        @Override
        public Test[] newArray(int size) {
            return new Test[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(a);
        dest.writeString(b);

        Looper.prepare();

    }
}
