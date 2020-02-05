package com.company;
import java.util.Arrays;
import java.util.Random;

public class Main{
    public static void main (String[] args){
        int [] arr = new int[6];
        Random r = new Random();
        for (int i=0;i<arr.length; i++){
            arr [i] = r.nextInt(50);
            for (int l=0; l<i; l++){
                if (arr [l] == arr[i]){
                    arr[i]=r.nextInt(50);

                }
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}
