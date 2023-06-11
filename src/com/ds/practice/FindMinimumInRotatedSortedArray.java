package com.ds.practice;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Set;
import java.util.TreeSet;

public class FindMinimumInRotatedSortedArray {
    public static int findMinimum(int[] nums){
        int start=0,end=nums.length-1;
            while(start<end)
            {
                int mid=start+(end-start)/2;
            if(nums[mid]>nums[end])
                start=mid+1;
            else
                end=mid;
        }
        return nums[end];
    }

    public static void main(String[] args) {
       //int[] nums={3,4,5,1,2};
        int[] nums={4,5,6,7,0,1,2};
        //int[] nums={11,13,15,17};
        //int[] nums={1,2,3};
       // int[] nums={2,1};
       // int[] nums={3,1,2};
        //int[] nums={5,1,2,3,4};
       // System.out.println(findMinimum(nums));
        Hashtable<String,Integer> ht=new Hashtable<>();
        ht.put("",100);
        ht.put("",101);
        ht.hashCode();
        System.out.println(ht.hashCode());
        HashMap<String,Integer> hmap=new HashMap<>();
        hmap.put(null,45);
        System.out.println(hmap);

    }
}
