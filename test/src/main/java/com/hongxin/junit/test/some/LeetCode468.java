package com.hongxin.junit.test.some;

public class LeetCode468 {

    public static void main(String[] args) {
        String ip = "";
        isIP(ip);
    }

    private static String isIP(String ip) {
        if (ip.contains(".") && ip.contains(":")) {
            return "Neither";
        }
        if (ip.contains(".")) {
            String[] split = ip.split(".");
            isIPV4(split);
        }


        return "Neither";
    }

    private static void isIPV4(String[] split) {


    }
}
