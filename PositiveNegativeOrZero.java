import java.util.Scanner;

/**
 * Write a description of class PositiveNegativeOrZero here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PositiveNegativeOrZero
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the number.");
        int num = input.nextInt();
        if(num>0)
        {
            System.out.println("The given number is positive.");
        }
        else if(num<0)
        {
            System.out.println("The given number is negative.");
            
            
            
            
        }
        else 
        {
            System.out.println("The given number is Zero.");
        }
        
    }
}