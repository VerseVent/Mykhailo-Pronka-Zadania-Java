
package com.company;
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(new File("liczby.txt"));
        int str = 0;
        List<Integer> list = new ArrayList();
        while (scan.hasNextInt()) {
            wiersz = scan.nextInt();
            list.add(str);
        }
        int max = Collections.max(list);
        int min = Collections.min(list);
        System.out.println("Max = " + max);
        System.out.println("Min = " + min);
    }
}
