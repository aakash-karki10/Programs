import java.util.Scanner;

/**
 * Write a description of class week05_WC07 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class week05_WC07
{
    public static void main(String[] args){
        char choice='y';
        Scanner input = new Scanner(System.in);
        int calculation=0;
        while(choice=='y' || choice=='Y')
    {
        System.out.println("Enter the two number you want to perform calculation on");
        System.out.println("Enter the greater number");
        int a=input.nextInt();
        System.out.println("Enter the lower number");
        int b=input.nextInt();
        System.out.println("Enter +,-,* or / ");
        char c=input.next().charAt(0);
        switch(c)
        {
            case '+':
                {
                    calculation=a+b;
                    System.out.println("The sum of two num is"+calculation);
                    break;             
                }
            case '-':
                {
                    calculation=a-b;
                    System.out.println("The diff of two num is"+calculation);
                    break;
                }
            case '*':
                {
                    calculation=a*b;
                    System.out.println("The multiplication of two num is"+calculation);
                    break;
                }
            case '/':
                {
                    
                }
        }
    }
}