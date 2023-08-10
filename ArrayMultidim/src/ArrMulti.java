import java.util.Arrays;

public class ArrMulti {
    public static void main(String[] args) {

    int[][] jagged = new int[3][];

        jagged[0] = new int[2];
        jagged[1] = new int[]{1,2,3,4};
        jagged[2] = new int[3];

        System.out.println(Arrays.deepToString(jagged));


    }
}