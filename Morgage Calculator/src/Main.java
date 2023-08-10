import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        final byte MONTH_IN_A_YEAR = 12;
        final byte PERCENT = 100;

        int principal;
        float monthIntRate;
        int sumPeriodes;

        Scanner scn = new Scanner(System.in);

        while (true) {
            System.out.println("Principal: ");
            principal = scn.nextInt();
            if (principal >= 10000 && principal <= 1000000)
                break;
            System.out.println("Enter principal between 10.000 and 1.000.000");
        }

        while (true) {
            System.out.println("Annual Interest Rate: ");
            float annualInterest = scn.nextInt();
            if (annualInterest >= 1 && annualInterest <= 30){
                monthIntRate = annualInterest / PERCENT / MONTH_IN_A_YEAR;
                break;
            }
            System.out.println("Enter a Annual Interest Rate between 1 and 30");
        }

        while (true) {
            System.out.println("Periods (Years): ");
            int periodes = scn.nextInt();
            if (periodes >= 1 && periodes <= 30) {
                sumPeriodes = periodes * MONTH_IN_A_YEAR;
                break;
            }
            System.out.println("Enter years between 1 and 30");
        }
        double mortgage = principal * (monthIntRate * Math.pow(1+monthIntRate, sumPeriodes)) / (Math.pow(1+monthIntRate, sumPeriodes)-1);

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);
    }
}