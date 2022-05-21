import java.util.*;
import java.util.List;

public class PerfCollections {

    final static Integer N = 1_000_000;

    final static Integer L = 5 * N / 8;  // dolna granica
    final static Integer H = 6 * N / 8; // górna granica

    public static void main(String[] args) {
        List<Integer> al = new ArrayList<>();
        List<Integer> ll = new LinkedList<>();
        Vector<Integer> v = new Vector<>();

        System.out.println("Parametry: " +
                "N = " + N + "\n" +
                "L = " + L + "  H = " + H);

        final long start2 = System.currentTimeMillis();
        for(int i = 0; i < N; i++) {
            ll.add(i);
        }
        final long end2 = System.currentTimeMillis();
        System.out.println("Tworzenie LinkedList: " + (end2 - start2) + "ms");

        final long start = System.currentTimeMillis();
        for(int i = 0; i < N; i++) {
            al.add(i);
        }
        final long end = System.currentTimeMillis();
        System.out.println("Tworzenie ArrayList: " + (end - start) + "ms");

        final long start7 = System.currentTimeMillis();
        for(int i = 0; i < N; i++) {
            v.add(i);
        }
        final long end7 = System.currentTimeMillis();
        System.out.println("Tworzenie Vector: " + (end7 - start7) + "ms");
        final long start3 = System.currentTimeMillis();
        for(int i = L; i < H; i++) {
            al.get(i);
        }
        final long end3 = System.currentTimeMillis();
        System.out.println("Dostęp ArrayList: " + (end3 - start3) + "ms");

        final long start4 = System.currentTimeMillis();
        for(int i = L; i < H; i++) {
            ll.get(i);
        }
        final long end4 = System.currentTimeMillis();
        System.out.println("Dostęp LinkedList: " + (end4 - start4) + "ms");


        final long start8 = System.currentTimeMillis();
        for(int i = L; i < H; i++) {
            v.get(i);
        }
        final long end8 = System.currentTimeMillis();
        System.out.println("Dostęp Vector: " + (end8 - start8) + "ms");

        final long start5 = System.currentTimeMillis();
        for(int i = L; i < H; i++) {
            ll.remove(i);
        }
        final long end5 = System.currentTimeMillis();
        System.out.println("usuwanie z LinkedList: " + (end5 - start5) + "ms");

        final long start6 = System.currentTimeMillis();
        for(int i = L; i < H; i++) {
            al.remove(i);
        }
        final long end6 = System.currentTimeMillis();
        System.out.println("usuwanie z ArrayList: " + (end6 - start6) + "ms");

        final long start9 = System.currentTimeMillis();
        for(int i = L; i < H; i++) {
            v.remove(i);
        }
        final long end9 = System.currentTimeMillis();
        System.out.println("usuwanie Vector: " + (end9 - start9) + "ms");

        final long start11 = System.currentTimeMillis();
        for(int i = L; i < H; i++) {
            ll.contains(i);
        }
        final long end11 = System.currentTimeMillis();
        System.out.println("zawieranie LinkedList: " + (end11 - start11) + "ms");;


        final long start12 = System.currentTimeMillis();
        for(int i = L; i < H; i++) {
            al.contains(i);
        }
        final long end12 = System.currentTimeMillis();
        System.out.println("zawieranie ArrayList: " + (end12 - start12) + "ms");


        final long start10 = System.currentTimeMillis();
        for(int i = L; i < H; i++) {
            v.contains(i);
        }
        final long end10 = System.currentTimeMillis();
        System.out.println("zawieranie Vector: " + (end10 - start10) + "ms");

    }
}
