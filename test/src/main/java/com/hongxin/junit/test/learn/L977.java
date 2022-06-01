package com.hongxin.junit.test.learn;

public class L977 {

    public static void main(String[] args) {
        int[] arr = {-7,-3,2,3,11};
        int[] solution = solution(arr);
        for (int i : solution) {
            System.out.println(i);
        }
    }

    private static int[] solution(int[] arr) {

        int n = arr.length;

        int left = 0;
        int right = n - 1;

        int[] ans = new int[n];
        int pos = n - 1;
        while (left <= right) {
            if (arr[left] * arr[left] > arr[right] * arr[right]) {
                ans[pos] = arr[left] * arr[left];
                left++;
            }else{
                ans[pos] = arr[right] * arr[right];
                right--;
            }

            pos--;
        }
        return ans;
    }

    private static void awap(int[] arr, int i, int j) {
        int temp = arr[i] * arr[i];
        arr[i] = arr[j] * arr[j];
        arr[j] = temp;
    }
}
