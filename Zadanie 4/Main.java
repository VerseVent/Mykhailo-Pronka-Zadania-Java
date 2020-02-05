package com.company;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter liczbyParzyste = new PrintWriter("Parzyste.txt");
        PrintWriter liczbyNieParzyste = new PrintWriter("NieParzyste.txt");
        Scanner scan = new Scanner(System.in);
        int i = 0;
        System.out.println("Wpisuj liczbe, jezeli chcesz skonczyc napisz 'koniec': ");
        do{
            i= scan.nextInt();
            if(i%2==0) {
                liczbyParzyste.println(i);
            }else {
                liczbyNieParzyste.println(i);
            }
        }while (!scanner.hasNext("koniec"));
        liczbyParzyste.close();
        liczbyNieParzyste.close();
    }
}
