package com.example.htgreentea.test;

import java.util.HashMap;
import java.util.Map;

public class test {

    public static int[] twoSum(int[] nums, int target) throws IllegalAccessException {
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                if (target == nums[i] + nums[j]) {
//                    return new int[]{i, j};
//                }
//            }
//        }

        Map<Integer, Integer> tempMap = new HashMap<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            if (tempMap.containsKey(target - nums[i])) {
                return new int[]{tempMap.get(target - nums[i]), i};
            } else {
                tempMap.put(nums[i], i);
            }
        }
        throw new IllegalAccessException("no two nums solution");
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 19;
        try {
            int[] ints = twoSum(nums, target);
            for (int anInt : ints) {
                System.out.println(anInt);
                System.out.println(",");
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
