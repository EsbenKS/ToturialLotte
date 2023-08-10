import java.util.Random;
import java.util.Scanner;
import java.util.WeakHashMap;

public class Main {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        Random rnd = new Random();

        System.out.println("Pick a number between 1 and 10");
        int number = scn.nextInt();

        int result = -1;
        int count = 0;

        while (result != number){
            result = rnd.nextInt(10)+1;
            System.out.println("Next number: " + result);
            count++;
        }
        System.out.println("Your number came up after: " + count + " times");

        //Gæt et nummer.

        System.out.println("Guess a number!");
        Scanner scn1 = new Scanner(System.in);
        Random rnd1 = new Random();

        int result1 = rnd1.nextInt(10)+1;
        int count1 = 0;
        while (result1 != number){
            System.out.print("Type a number 1-10 to guess random picked number: ");
            number = scn1.nextInt();
            count1++;
        }
        System.out.println("You guessed the number after: " + count1 + " times");


        //Roll the dice

        System.out.println("While loop");
        Random rnd2 = new Random();
        int sum = 0;
        while(sum != 7){
            int roll1 = rnd2.nextInt(6)+1;
            int roll2 = rnd2.nextInt(6)+1;
            sum = roll1+roll2;

            System.out.println(roll1 +" + "+ roll2 +" = "+ sum);
        }


        System.out.println("Do while loop");
        do {
            int roll1 = rnd2.nextInt(6)+1;
            int roll2 = rnd2.nextInt(6)+1;
            sum = roll1+roll2;
            System.out.println(roll1 +" + "+ roll2 +" = "+ sum);
        } while (sum != 7);


        int sum1 = 0;
        System.out.print("Enter next int (-1 to guit): ");
        int num = scn.nextInt();
        while (num != -1){
            sum1 += num;
            System.out.print("Enter next int (-1 to guit): ");
            num = scn.nextInt();
        }
        System.out.println("sum: " + sum1);

    }
}