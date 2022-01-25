package com.hongxin.junit.test.str;

public class PrintZStr {


    public static void main(String[] args) {

        getZStr("sahkdhalsjdla", 3);
    }

    private static String getZStr(String str, int rows) {

        String[] strArr = new String[rows];

        int period = rows * 2 - 2;
        for (int i = 0; i < str.length(); i++) {
            if (i % period < rows) {
                strArr[i % period] += str.charAt(i);
            } else {
                strArr[period - i % period] += str.charAt(i);
            }
        }

        StringBuilder res = new StringBuilder();
        for (String s : strArr) {
            res.append(s);
        }
        return res.toString();
    }


}
