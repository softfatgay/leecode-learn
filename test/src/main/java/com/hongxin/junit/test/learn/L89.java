package com.hongxin.junit.test.learn;

public class L89 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};

        int k = 2;

        int[] solution = solution(arr, k);
        for (int i : solution) {
            System.out.println(i);
        }
    }

    private static int[] solution(int[] arr, int k) {
        int n = arr.length;
        int left = 0;
        int right = k+1;

        while (left < k && right < n) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right++;
        }
        return arr;
    }
}
