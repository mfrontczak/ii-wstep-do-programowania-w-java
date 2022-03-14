package pl.krakow.up;

import java.util.Scanner;

    public class Example1 {
        final static int maxCount = 10;
        enum PORA_ROKU {
            ZIMA,
            WIOSNA,
            LATO,
            JESIEN
        }
        public static void main(String[] args) {
            PORA_ROKU p = PORA_ROKU.valueOf("ZIMA");
            switch (p) {
                case ZIMA:
                    System.out.println("Moja pora roku to " + p);
                    break;
                case WIOSNA:
                    System.out.println("Moja pora roku to " + p);
                    break;
                case LATO:
                    System.out.println("Moja pora roku to " + p);
                    break;
                case JESIEN:
                    System.out.println("Moja pora roku to " + p);
                    break;
                default:
                    System.out.println("Jakaś dziwna pora roku");
            }
        }
    }
}