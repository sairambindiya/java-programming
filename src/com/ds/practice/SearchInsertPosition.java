package com.ds.practice;

public class SearchInsertPosition {
    public static int searchPosition(int[] nums,int target){
        int mid=0,start=0,end=nums.length;
        while(start<=end){
            mid=start+(end-start)/2;
            if(mid< nums.length && nums[mid]==target){
                return mid;
            }
            else if(mid <nums.length && nums[mid]>target){
                end=mid-1;
            }
            else if(mid <nums.length &&nums[mid]<target){
                start=mid+1;
            }

        }
        return start;
    }
    public static void main(String[] args) {
        int[] nums={1,3,5,6};
        int target=2;
        System.out.println(searchPosition(nums,target));

    }
}
