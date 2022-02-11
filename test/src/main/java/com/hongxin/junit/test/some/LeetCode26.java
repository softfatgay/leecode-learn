package com.hongxin.junit.test.some;

public class LeetCode26 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 3, 4, 5};

        int newArray = getNewArray(arr);
        System.out.println(newArray);


    }

    private static int getNewArray(int[] arr) {
        int n = arr.length;
        int fast = 1;
        int slow = 1;
        while (fast < n) {
            if (arr[fast] != arr[fast - 1]) {
                arr[slow] = fast;
                slow++;
            }
            fast++;
        }
        return slow;
    }
}
