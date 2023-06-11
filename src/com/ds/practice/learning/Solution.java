package com.ds.practice.apptio;

public class Solution {
    public static int findsearchPosition(int[] nums, int target){
        int start=0,end=nums.length,mid=0;
        while(start<end){
            mid=start+(end-start)/2;
            if(nums[mid]==target)
                return mid;
            else if(nums[mid]<target){
                if(nums[start]==target){
                 return mid;
                }
                else if(nums[start]>target){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return start;
    }
    public static void main(String[] args) {
        //int[] nums={8, 9, 10, 11, 1, 2, 3, 4, 5, 6,7};
       // int target=8;
        int[] nums={8, 9, 10, 11, 1, 2, 3, 4, 5, 6,7};
        int target=8;
        System.out.println(findsearchPosition(nums,target));
    }
}
