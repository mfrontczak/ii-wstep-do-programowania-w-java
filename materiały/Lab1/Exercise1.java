package pl.krakow.up;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        int i = Integer.MAX_VALUE;
        int n = 0;
        Scanner in = new Scanner(System.in);

        while (n < 10) {
            int j = in.nextInt();
            n += 1;
            if(j < i) {
                i = j;
            }
        }
        System.out.println("Najmniejsza liczba to: " + i);
    }
}