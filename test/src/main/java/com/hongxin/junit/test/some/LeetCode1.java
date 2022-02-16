package com.hongxin.junit.test.some;

import java.util.HashMap;

public class LeetCode1 {
    public static void main(String[] args) {

//        int[] arr = {2,9,11,20};
//        int[] newArr = getIndex(arr, 31);
//
//        for (int i : newArr) {
//            System.out.println(i);
//        }


    }

    private static int[] getIndex(int[] arr,int tag) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(tag - arr[i])) {

                return new int[]{map.get(tag - arr[i]),i};
            }else{
                map.put(arr[i], i);
            }
        }
        return null;

    }




}
