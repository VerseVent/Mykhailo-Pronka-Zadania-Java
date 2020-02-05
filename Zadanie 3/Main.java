
package com.company;
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(new File("liczby.txt"));
        int str = 0;
        List<Integer> lista = new ArrayList();
        while (scan.hasNextInt()) {
            str = scan.nextInt();
            lista.add(str);
        }
        int max = Collections.max(lista);
        int min = Collections.min(lista);
        System.out.println("Max = " + max);
        System.out.println("Min = " + min);
    }
}
