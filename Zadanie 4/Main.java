package com.company;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter parzyste = new PrintWriter("Parzyste.txt");
        PrintWriter nieParzyste = new PrintWriter("NieParzyste.txt");
        Scanner scanner = new Scanner(System.in);
        int liczba = 0;
        System.out.println("Wpisuj liczbe(kiedy juz skonczysz napisz 'koniec'): ");
        do{
            liczba= scanner.nextInt();
            if(liczba%2==0) {
                parzyste.println(liczba);
            }else {
                nieParzyste.println(liczba);
            }
        }while (!scanner.hasNext("koniec"));
        parzyste.close();
        nieParzyste.close();
    }
}
