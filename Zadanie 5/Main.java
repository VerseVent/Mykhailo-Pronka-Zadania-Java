package com.company;
import java.util.Arrays;
import java.util.Random;

public class Main{
    public static void main (String[] args){
        int [] array = new int[6];
        Random rand = new Random();
        for (int i=0;i<array.length; i++){
            array [i] = rand.nextInt(50);
            for (int k=0; k<i; k++){
                if (array [k] == array[i]){
                    array[i]=rand.nextInt(50);

                }
            }
        }
        System.out.println(Arrays.toString(array));

    }
}
/*
 *
 *
 *
 */
//// losuje 6 roznych z 49 liczb (uzywajac kolekcji)
//package com.company;
//        import java.util.*;
//public class Main {
//    public static void main(String[] args) {
//        int liczba;
//        Set<Integer> set = new HashSet<>();
//        Random rand = new Random();
//
//        for ( int i = 0; i < 6; i++) {
//            liczba = rand.nextInt(50);
//            set.add(liczba);
//        }
//        if (set.size()==6){
//            System.out.println(set);
//        }else {
//            int liczba_2;
//            liczba_2 =  rand.nextInt(50);
//            set.add(liczba_2);
//            System.out.println(set);
//        }
//    }
//}
