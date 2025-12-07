import java.util.Scanner;

/**
 * Write a description of class w5T2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class w5T2
{
    public static void main(String[] args)    
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number.");
        int n = input.nextInt();
        int factorial = 1;
        
        for(int i = 1; i<=3; i++)
        {
            factorial = factorial * i;
            
        }
        System.out.println("Factorial is"+ factorial);
    }
    
}