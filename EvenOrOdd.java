import java.util.Scanner;

/**
 * Write a description of class EvenOrOdd here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class EvenOrOdd
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the number.");
        int num = input.nextInt();
        if(num%2==0)
        {
            System.out.println("The given number is even.");
            
        }
        else
        {
            System.out.println("The given number is odd.");
        }
        
        
        
        
    }
}