import java.util.Scanner;

/**
 * Write a description of class QUESTION7 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class QUESTION7
{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the category.");
        char cat = input.next().charAt(0);
        float mp = 19000;
        double dis = 0;
        switch (cat){
            case 'A':
                dis = 0.6; break;
            case 'B':
                dis = 0.4; break;
            case 'C':
                dis = 0.2; break;
            case 'D':
                dis = 0.1; break;
            }
        double sp = mp-(mp*dis);
        System.out.println(sp);
        
        
        
    }
}