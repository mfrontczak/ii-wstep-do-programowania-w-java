import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class GenericListMethod {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);

        show(l);

        LinkedList<String> s = new LinkedList<>();
        s.add("Hello World #1");
        s.add("Hello World #2");
        s.add("Hello World #3");

        show(s);

        ArrayList<LinkedList<Integer>> al = new ArrayList<>();

        int[] ints = {1,2,3,4};
      
        List<Integer> ll = Arrays.asList(1,2,3,3,4);

        LinkedList<Integer> ll2 = new LinkedList<>();

        al.add(ll);
        al.add(ll2);

        ll.add(5);
        ll.add(5);
        ll.add(5);
        ll.add(5);

        ll2.add(6);
        ll2.add(6);
        ll2.add(6);
        ll2.add(6);
        ll2.add(6);

       for(LinkedList<Integer> row : al) {
           for(Integer i : row) {
               System.out.print(i + ", ");
           }
           System.out.println();
       }


        FileReader input = new FileReader("pg67098.txt");
        BufferedReader bfr = new BufferedReader(input);
        String row;
        while((row = bfr.readLine()) != null) {
            System.out.println(row);
        }

        input.close();


        Iterator<Integer> iter = ll2.iterator();
        int i= 0;
        while(iter.hasNext()) {
            iter.next();
            if(i % 2 == 0) {
                iter.remove();
            }
            i += 1;
        }

        Iterator<Integer> iter2 = ll2.iterator();
        while(iter2.hasNext()) {
            System.out.println(iter2.next());
        }
        showArray(ll);
    }

    public static void showArray(List<?> l) {
        for(Object o : l) {
            System.out.println(o);
        }
    }

    public static <T> void show(List<T> l) {
        for(T o : l) {
            System.out.println(o);
        }
    }

}
