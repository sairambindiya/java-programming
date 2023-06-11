package com.ds.practice;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    public static boolean checkDuplicates(int[] nums){
        Set<Integer> set=new HashSet<>();
        for(int i:nums){
            if(set.contains(i))
                    return true;
            else{
                set.add(i);
            }

        }
        return  false;
    }

    public static void main(String[] args) {
        int[] nums={1,2,3,4};
        System.out.println(checkDuplicates(nums));
    }
}
