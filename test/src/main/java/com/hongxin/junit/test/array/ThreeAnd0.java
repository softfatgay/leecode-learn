package com.hongxin.junit.test.array;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


/**
 * 三数之和等于0的所有数组
 */
public class ThreeAnd0 {

    public static void main(String[] args) {

        int[] arr = {-1, 0, 1, 2, -1, -4, 0, 4, 2};

        List<List<Integer>> lists = threeSum0(arr);

        for (List<Integer> list : lists) {
            for (Integer integer : list) {
                System.out.print(integer + ",");
            }
            System.out.println("");
        }

    }

    private static List<List<Integer>> threeSum0(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        int len = nums.length;
        for(int i = 0;i < len; i++){
            if(nums[i]>0) break;
            if(i >0 && nums[i] == nums[i-1]) continue;
            int L = i+1;
            int R = len-1;
            while(L<R){
                int sum = nums[i] + nums[L] + nums[R];
                if(sum == 0){
                    res.add(Arrays.asList(nums[i],nums[L],nums[R]));
                    while (L<R && nums[L] == nums[L+1]) L++; // 去重
                    while (L<R && nums[R] == nums[R-1]) R--; // 去重
                    L++;
                    R--;
                }
                else if(sum < 0){
                    L++;
                }
                else if(sum > 0){
                    R--;
                }
            }
        }
        return res;
    }



    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList();
        int len = nums.length;
        if(nums == null || len < 3) return ans;
        Arrays.sort(nums); // 排序
        for (int i = 0; i < len ; i++) {
            if(nums[i] > 0) break; // 如果当前数字大于0，则三数之和一定大于0，所以结束循环
            if(i > 0 && nums[i] == nums[i-1]) continue; // 去重
            int L = i+1;
            int R = len-1;
            while(L < R){
                int sum = nums[i] + nums[L] + nums[R];
                if(sum == 0){
                    ans.add(Arrays.asList(nums[i],nums[L],nums[R]));
                    while (L<R && nums[L] == nums[L+1]) L++; // 去重
                    while (L<R && nums[R] == nums[R-1]) R--; // 去重
                    L++;
                    R--;
                }
                else if (sum < 0) L++;
                else if (sum > 0) R--;
            }
        }
        return ans;
    }
}
