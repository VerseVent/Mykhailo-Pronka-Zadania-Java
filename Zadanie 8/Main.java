package com.company;
import java.io.*;
import java.util.*;
public class Main {
    static boolean isPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start) != str.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter printWriter = new PrintWriter("palindrom.txt");
        Scanner scanner = new Scanner(new File("znaki.txt"));
        String wiersz;

        while (scanner.hasNextLine()) {
            wiersz = scanner.nextLine();
            if (isPalindrome(wiersz)) {
                System.out.println(wiersz + " -> Jest palindromem ");
                printWriter.println(wiersz);
            }
        }
        scanner.close();
        printWriter.close();
    }
}
