package pl.krakow.up;

public class Example3 {
    public static class MyApp {
        public void showArray(int[] arr) {
            for(int i = 0; i < arr.length; i++) {
                System.out.println( arr[i] );
            }
        }
    }
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        MyApp app = new MyApp();
        app.showArray(a);
    }
}
