package com.ds.practice;

public class ProductOfArrayExceptSelfCleanCode {

        public static int[] productOfArrayExceptSelf(int[] nums) {
            int[] output=new int[nums.length];
            int[] leftArray=new int[nums.length];
            int[] rightArray=new int[nums.length];
            leftArray[0]=1;
            for(int i=1;i<nums.length;i++){
                leftArray[i]=leftArray[i-1]*nums[i-1];
            }
            rightArray[nums.length-1]=1;
            for(int i=nums.length-2;i>=0;i--){
                rightArray[i]=rightArray[i+1]*nums[i+1];
            }

            for(int j=0;j<nums.length;j++){
                output[j]=leftArray[j]*rightArray[j];
            }
            return output;
        }


        public static void main(String[] args) {
            int[] nums = {1,2,3,4};
            int[] output = productOfArrayExceptSelf(nums);
            for (int i = 0; i < output.length; i++) {
                System.out.print(output[i]);
                if (i < output.length - 1) {
                    System.out.print(", ");
                }
            }
        }
    }


