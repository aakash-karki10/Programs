import java.util.Scanner;

/**
 * Write a description of class Question4Bynestedif here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Question4Bynestedif
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the number.");
        int num = input.nextInt();
        if(num%3==0)
        {
            if(num%5==0)
        {
        System.out.println("Divisible by both.");
        
    }
}
else {
    System.out.println("Divisible by 3 not by 5.");
    if(num%5==0){
        System.out.println("Divisible by both.");
    }
    else{
        System.out.println("Divisible by 5 not by 3");
    }
}
}
}
