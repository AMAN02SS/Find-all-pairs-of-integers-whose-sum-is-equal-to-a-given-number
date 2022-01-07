package com.AmanSinghSikarwar;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = {0,2,3,5,4,7,9};
        int target = 9;

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    int[] result ={arr[i],arr[j]};
                    System.out.println(Arrays.toString(result));
                }
            }
        }
    }
}
