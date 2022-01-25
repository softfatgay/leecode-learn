package com.hongxin.junit.test;

//41. 缺失的第一个正数
public class LeetCode41 {

    public static void main(String[] args) {

//        int[] arr = {1, 2, 7, 3, 6, 4};
//        int firstInt = getFirstInt(arr);
//        System.out.println(firstInt);
//
        String a = "5";
        String b = "4";


        int num = 0;
        num+=a.charAt(0) - '0';
        num+=b.charAt(0) - '0';


        System.out.println(num);




    }

    public String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        int carry = 0, i = num1.length()-1, j = num2.length()-1;
        while(i >= 0 || j >= 0 || carry != 0){
            if(i>=0) carry += num1.charAt(i--)-'0';
            if(j>=0) carry += num2.charAt(j--)-'0';
            sb.append(carry%10);
            carry /= 10;
        }
        return sb.reverse().toString();
    }


    private static int getFirstInt(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0 && arr[i] < arr.length && arr[i] != i + 1) {
                int temp = arr[arr[i] - 1];
                arr[arr[i] - 1] = arr[i];
                arr[i] = temp;
            }
        }


        for (int i = 0; i < arr.length; i++) {
            if (arr[i] - 1 != i) {
                return i + 1;
            }
        }
        return 1;
    }
}
