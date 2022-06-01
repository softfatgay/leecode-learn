package com.hongxin.junit.test.learn;

public class L167 {
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 13;
        int[] solution = solution(arr, target);
        for (int i : solution) {
            System.out.println(i);
        }
    }

    private static int[] solution(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            if (arr[left] + arr[right] == target) {
                return new int[]{left+1,right+1};
            } else if (arr[left] + arr[right] < target) {
                left++;
            }else{
                right--;
            }
        }

        return new int[]{};
    }
}
