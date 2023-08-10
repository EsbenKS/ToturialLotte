import java.util.Arrays;
import java.util.Scanner;

public class ArrayWithScanner {
    public static void main(String[] args) {


        Scanner scn = new Scanner(System.in);
        int sum = 0;

        System.out.print("Enter length of list: ");
        int lenght = scn.nextInt();
        int [] test = new int[lenght];



        for(int i=0; i< test.length; i++ ){
            System.out.print("Enter a number: ");
            test[i] = scn.nextInt();
            sum += test[i];

        }
        int avg = sum/lenght;
        int above = 0;
        for(int i = 0; i <test.length; i++){
            if(test[i]>avg) {
                above++;
            }
        }



        System.out.println(sum);
        System.out.println(avg);
        System.out.println(above);
        System.out.println(Arrays.toString(test));
        System.out.println("middle: " + test[test.length/2]);


    }


}