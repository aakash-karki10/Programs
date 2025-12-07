import java.util.Scanner;

/**
 * Write a description of class QUESTION6 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class QUESTION6
{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the category.");
        char cat = input.next().charAt(0);
        float mp = 19000;
        double dis = 0;
        if(cat=='A')
        {
            dis = 0.6;
            
        }
        else if (cat=='B')
        {
            dis = 0.4;
        }
        else if (cat=='C')
        {
            dis = 0.2;
        }
        else if (cat=='D')
        {
            dis = 0.1;
        }
        double sp = mp-(mp*dis);
        System.out.println(sp);
        
        
        
    }
}