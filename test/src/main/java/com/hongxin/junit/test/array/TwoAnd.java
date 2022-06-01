package com.hongxin.junit.test.array;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;


/**
 * LeetCode1.两数之和(java)
 */
public class TwoAnd {

    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};

        int[] and = and(arr, 13);

        for (int i : and) {
            System.out.print(i+",");
        }
        System.out.println();
    }

    private static int[] and(int[] arr,int sum) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int diff = sum - arr[i];
            if (map.containsKey(diff)) {
                return new int[]{map.get(diff), i};
            }
            map.put(arr[i], i);
        }


        return new int[]{-1, -1};
    }

}
