package com.company;
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        List list = new ArrayList();
        Scanner scanner = new Scanner(new File("baza.txt"));
        String wiersz;
        while (scanner.hasNextLine()){
            wiersz = scanner.nextLine();
            list.add(wiersz);
        }
        Scanner scannerImie = new Scanner(System.in);
        System.out.println("Wpisz swoje imie i nazwisko: ");
        String imie = scannerImie.nextLine();
        int  wierszNow =0;
        for(Object object : list){
            if(object.equals(imie)){
                System.out.println("Takie imie jest w pliku! ");
                break;
            }else {
                wierszNow++;
                continue;
            }
        }
        if(wierszNow== list.size()){
            System.out.println("Nie ma w pliku");
        }
    }
}
