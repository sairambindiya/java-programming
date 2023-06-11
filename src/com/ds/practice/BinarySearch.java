package com.ds.practice;

public class BinarySearch {
    public static void main(String[] args) {
        int nums[]={2,5,8,12,16,23,38,56,72,91};
        int target=91;
        System.out.println("an element present at "+searchElement(nums,target));
    }

    private static int searchElement(int[] nums, int target) {
        int start=0,end=nums.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(nums[mid]==target)
                return mid;
            else if(nums[mid]>target)
                end=mid-1;
            else
                start=mid+1;
        }
        return -1;
    }
}
