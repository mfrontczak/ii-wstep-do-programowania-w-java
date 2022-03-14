package pl.krakow.up;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        String s = "Ja";
        int x = 5;

        if(x == 5) {
            System.out.println(s + " wyjechał do Szwecji.");
        } else {
            System.out.println(s + " jednak został w Polsce.");
        }

        Scanner in = new Scanner(System.in);
        int liczba = in.nextInt();

        if(liczba > 10) {
            System.out.println("Liczba jest większa od 10.")
        } else if (liczba < 5) {
            System.out.println("Liczba jest mniejsza od 5");
        } else {
            System.out.println("Liczba znajduje się w przedziale od 5 do 10");
        }
    }
}