package com.ds.practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDupsFromSortedArray {

    public static int removeDuplicates(int[] nums) {
        Set<Integer> set=new LinkedHashSet<Integer>();
        for(int num:nums){
            set.add(num);
        }
       int i=0;
        for(int ele:set){
            nums[i]=ele;
            i++;
        }

        return set.size();
    }
    public static void main(String[] args) {
        int[] nums = {-3,-1,0,0,0,3,3};
        System.out.println(removeDuplicates(nums)+" ,");
        Arrays.stream(nums).forEach(n-> System.out.println(n));
    }
}
