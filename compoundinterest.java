import java.util.Scanner;

/**
 * Write a description of class compoundinterest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class compoundinterest
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter principal amount (>=1000): ");
            double P = sc.nextDouble();
            if (P < 1000) break;

            System.out.print("Enter annual interest rate (8–12): ");
            double annualRate = sc.nextDouble();
            if (annualRate < 8 || annualRate > 12) break;

            System.out.print("Enter duration in years (1–5): ");
            int years = sc.nextInt();
            if (years < 1 || years > 5) break;

            double monthlyRate = annualRate / 100 / 12;
            int months = years * 12;

            double maturityAmount = P * Math.pow((1 + monthlyRate), months);

            double feeRate = 0.005;
            double fee = maturityAmount * feeRate;

            double finalAmount = maturityAmount - fee;

            System.out.println("Maturity Amount: " + maturityAmount);
            System.out.println("Processing Fee: " + fee);
            System.out.println("Final Amount Received: " + finalAmount);
            System.out.println();
        }
        sc.close();
    }
}