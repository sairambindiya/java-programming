package com.ds.practice;

public class RemoveElement {
    public static int removeInteger(int[] nums,int value){
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=value){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
       // int[] nums={3,2,2,3};
        int[] nums={0,1,2,2,3,0,4,2};
        int value=2;
        System.out.println(removeInteger(nums,value));

    }
}
