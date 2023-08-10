import java.awt.*;
import java.util.Arrays;

public class ArrAdvTec {
    public static void main(String[] args) {

        //Shifting values
        int[] values = {3,8,9,7,5};
        int[] val = { 1,2,3,4,5};
        System.out.println("Values before shifting: "+Arrays.toString(values));

        for (int i=0; i<values.length-1; i++){
            values[i]= values[i+1];
        }
        System.out.println("Values after shifting: "+ Arrays.toString(values));

        System.out.println("before shifting with method: " +Arrays.toString(val));
        rotateLeft(val);

        Arrays.sort(values);
        System.out.println("Sorted Array: " +Arrays.toString(values));


        //Arrays of Objects
        Point[] points = new Point[3];
        System.out.println(Arrays.toString(points));

        points[0] = new Point(3,7);
        points[1] = new Point(4,5);
        points[2] = new Point(6,2);

        System.out.println(Arrays.toString(points));
    }


    public static void rotateLeft(int[] list){
        int first = list[0];
        for(int i=0; i<list.length-1; i++){
            list[i] = list[i+1];
        }
        list[list.length-1] = first;
        System.out.println("After: "+Arrays.toString(list));
    }
}