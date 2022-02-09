package com.hongxin.junit.test.xiaohongshu;

public class LeetCode240 {

    public static void main(String[] args) {
        int[][] arr = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 50}};
        boolean b = quickQuery(arr, 13);


        System.out.println(b);
    }

    private static boolean quickQuery(int[][] arr, int target) {


        //此题是从length-1位置左下角开始寻找，大于左下角的肯定在右方向，小于此数的肯定在上方，
        // 总次数不超过arr.length+arr[0].length

        //外层数组长度
        int len = arr.length;
        int iLen = arr[0].length;

        int i = len - 1;
        int j = 0;
        while (i >= 0 && j < iLen) {
            if (target > arr[i][j]) {
                j++;
            } else if (target < arr[i][j]) {
                i--;
            }else{
                return true;
            }

        }
        return false;
    }
}
