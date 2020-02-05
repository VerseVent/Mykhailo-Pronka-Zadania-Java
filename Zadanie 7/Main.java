package com.company;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("wiersz.txt"));
        String wiersz = null;
        int wierszNow = 0;
        while (scanner.hasNextLine()) {
            wierszNow++;
            wiersz = scanner.nextLine();
            System.out.print("wiersz " + wierszNow + " ma " +  numberLetters(wiersz) +"-liter" + "  "+ numberDigit(wiersz)
                    +"-cyfr"+ "  "+ numberWhiteSpace(wiersz) +"-znaków białych"+"  "+ numberDifferent(wiersz)+"-inne");
            if(checkForEmptiness(wiersz)){
                System.out.println(" Wiersz jest pusty/ tabulator");
            }
            System.out.println();
        }
    }
    static int numberLetters(String string) {
        int letters = 0;
        for (int i = 0; i < string.length(); i++) {
            if (Character.isLetter(string.charAt(i))) {
                letters++;
            }
        }
        return letters;
    }

    static int numberDigit(String string) {
        int digit = 0;
        for (int i = 0; i < string.length(); i++) {
            if (Character.isDigit(string.charAt(i))) {
                digit++;
            }
        }
        return digit;
    }

    static int numberWhiteSpace(String string) {
        int space = 0;
        for (int i = 0; i < string.length(); i++) {
            if (Character.isWhitespace(string.charAt(i))) {
                space++;
            }
        }
        return space;
    }

    static int numberDifferent(String string) {
        int different = 0;
        char [] d = {'c','a'};
        char dif []= {'-','@','№','`','?','~','$','^','*','=','+','<','>',',',':','!','_','(',')','/','#','¤','%','&','"',';','.',']','['};
        for (int i = 0; i < string.length(); i++) {
            char chars = string.charAt(i);
            String charr = Character.toString(chars);
            for (int q=0;q<dif.length;q++) {
                if (charr.contains(String.valueOf(dif[q]))){
                    different++;
                    break;
                }
            }
        }
        return different;
    }
    static boolean checkForEmptiness(String string) {
        int a = 0;
        char[] chars = string.toCharArray();
        for (char ch : chars) {
            if (ch == ' ') {
                a++;
            }
        }
        if (a == chars.length) {
            return true;
        } else return false;
    }
}
