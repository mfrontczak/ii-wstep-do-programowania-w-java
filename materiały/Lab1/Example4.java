package pl.krakow.up;

public class InstrukcjeWarunkowe {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            System.out.println("i = " + i);
            i = i + 1;
        }

        for(int j = 0; j < 10; j++) {
            System.out.println(j);
        }


        for (String arg: args) {
            System.out.println(arg);
        }
    }
}