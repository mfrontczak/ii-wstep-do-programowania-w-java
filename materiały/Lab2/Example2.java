package pl.krakow.up;
public class Example2 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        showArray(a);
    }

    public static void showArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
