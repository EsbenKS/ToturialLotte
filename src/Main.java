import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] numbers = {{1,2,3},{4,5,6}};

        System.out.println(Arrays.deepToString(numbers));

        double result = (double)10/(double) 3;
        System.out.println(result);

        //Casting double -> int (Explicit casting) da jeg tvinger, Implicit casting er indbygget i Java.
        //Implicit casting: byte -> short -> int -> long -> float -> double
        double x = 1.8;
        int y = (int) ((x) + 2);
        System.out.println(y);

        // casting med wrapperclas Interger for int
        String s = "1";
        int t = Integer.parseInt(s) + 2;
        System.out.println(t);

        // Random number
        double res = (int) Math.round(Math.random() * 100);
        System.out.println(res);

        int h = 1;
        int i = 1;
        System.out.println(h==i);
        System.out.println(h!=i);
    }
}