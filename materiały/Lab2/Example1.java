public class Example1 {
    public static void main(String[] args) {
        int[] myArray = new int[10];

        myArray[0] = 1;
        myArray[1] = 3;

        for(int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }
    }
}