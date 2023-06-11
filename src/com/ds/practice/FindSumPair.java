package com.ds.practice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class FindSumPair {

    public static void findPair(int[] arr,int k){
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            int temp=k-arr[i];
            if(set.contains(temp)){
                System.out.println("exits");
                return;
            }
            set.add(arr[i]);
        }

    }

    public static boolean numbersExists(int[] arr,int sum){
        Set<Integer> set = new HashSet<>();
        for(int a:arr) {
            if (set.contains(sum - a)) {
                return true;
            } else {
                set.add(a);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr={7,12,10,28,3};
        int k=9;
        //findPair(arr,k);
        System.out.println(numbersExists(arr,k));
        HashMap<Integer,Integer> map=new HashMap<>();
        //map.get();
    }
}
