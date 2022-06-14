package com.hongxin.junit.test.some;

public class LeetCode26 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 3, 4, 5};

//        int newArray = getNewArray(arr);
//        System.out.println(newArray);


        int newArray1 = getNewArray1(arr);

        System.out.println(newArray1);
    }

    private static int getNewArray1(int[] arr) {
        int fast = 1;
        int slow = 1;
        while (fast < arr.length) {
            if (arr[fast] != arr[fast - 1]) {
                slow++;
            }
            fast++;
        }



        return slow;
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
