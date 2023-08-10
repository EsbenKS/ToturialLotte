import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int xMin = 1;
        int xMax = 10;
        int yMin = 1;
        int yMax = 10;

        int xPos = 1;
        int yPos = 1;
        int move = 0;

        Random rnd = new Random();
        int bombX = rnd.nextInt(10)+1;
        int bombY = rnd.nextInt(10)+1;
        System.out.println("("+bombX+","+bombY+")");


        Scanner scn = new Scanner(System.in);

        System.out.println("Press y to begin game, and n to exit");
        char start = scn.next().toLowerCase().charAt(0);


            if (start == 'y') {
                System.out.println("Game started, press 5 to exit");
            }
            if (start == 'n') {
                System.out.println("Game ended");
            }

        while (start == 'y' && move != 5){
            move = scn.nextInt();
            if (move == 2 && yPos > yMin){
                yPos--;
            }

            if (move == 8 && yPos < yMax){
                yPos++;
            }

            if (move == 4 && xPos > xMin){
                xPos--;
            }

            if (move == 6 && xPos < xMax){
                xPos++;
            }

            if (xPos == bombX && yPos == bombY) {
                System.out.println("BOOM you're dead");
                break;
            }

            if(xPos == 10 && yPos == 10) {
                System.out.println("Your position: (" + xPos + "," + yPos + ")" );
                System.out.println("congratulation you win!");
                break;
            }
            System.out.println("Your pos: (" + xPos + "," + yPos + ")" );
        }



//





    }
}