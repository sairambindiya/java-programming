package com.ds.practice;

public class ProductOfArrayExceptSelf {
    public static int[] productOfArrayExceptSelf(int[] nums){
        int[] output=new int[nums.length];
        int product,j,k=0;
        for(int i=0;i<nums.length;i++){
            j=0;product=1;
            while(j>=0&&j<nums.length){
                if(i!=j){
                    product*=nums[j];
                    j++;
                }
                else{
                    j++;
                }
            }
            output[k]=product;
            k++;
        }
        return output;
    }
    public static void main(String[] args) {
        int[] nums={1,2,3,4};
        int [] output=productOfArrayExceptSelf(nums);
        for (int i=0;i<output.length;i++){
            System.out.println(output[i]+" ,");
        }

    }
}
