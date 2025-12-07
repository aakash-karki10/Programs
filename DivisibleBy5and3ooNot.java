import java.util.Scanner;

/**
 * Write a description of class DivisibleBy5and3ooNot here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DivisibleBy5and3ooNot
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the number.");
        int num = input.nextInt();
        if(num%3==0 && num%5==0) 
     {
         System.out.println("The number is divisible by both 3 and 5");
         
     }
     else
     {
         System.out.println("The number is not divisible by both");
     }
        
    }
}