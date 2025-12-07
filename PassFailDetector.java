import java.util.Scanner;

/**
 * Write a description of class PassFailDetector here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PassFailDetector
{
  public static void main(String[] args)
  {
      Scanner input = new Scanner (System.in);
      System.out.println("Enter your marks.");
      double marks = input.nextDouble();
      if (marks>=40)
      {
          System.out.println("You are Pass.");
          
      }
         else 
      {
          System.out.println("You are fail.");
      }
          
      
      
      
  }
}