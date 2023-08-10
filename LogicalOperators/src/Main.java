import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Boolean highIncome = true;
        Boolean hasGoodCredit = true;
        Boolean hasCriminalRecord = false;

        Boolean isEligible = (highIncome || hasGoodCredit) && !hasCriminalRecord;
        System.out.println(isEligible);


        int temp = 45;
        if(temp > 30)
            System.out.println("It is hot");
        else if(temp > 20)
            System.out.println("it is nice");
        else
            System.out.println("it is cold");

        Scanner scn = new Scanner(System.in);
        System.out.print("Enter role: ");
        String role = scn.next();


        switch (role) {
            case "admin":
                System.out.println("You are Administrator");
                break;
            case "dev":
                System.out.println("You are a Developer");
                break;
            default:
                System.out.println("You are a guest");
        }

        System.out.println("1: admin");
        System.out.println("2: developer");
        System.out.println("3: guest");

        int nRole = scn.nextInt();

        switch (nRole){
            case 1:
                System.out.println("You are Administrator");
                break;
            case 2:
                System.out.println("You are a Developer");
                break;
            default:
                System.out.println("You are a guest");
        }

    }



}