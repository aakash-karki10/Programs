import java.util.Scanner;

/**
 * Write a description of class w5_T1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class w5_T1
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the nuymber.");
        int n = input.nextInt();
        int sum = 0;
        for(int i = 1; i<=n; i++)
        {
            sum = sum+i;
            System.out.println(sum);
            
        }
        System.out.println("Total"+ sum);
    }
    
    
}