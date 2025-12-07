
/**
 * Write a description of class week05_WC3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class week05_WC3
{
    public static void main(String[] args){
        int i=1;
        int sum = 0;
        do{
            sum = sum + (i*i);
            i++;
        }
        while(i<=10);
        System.out.println("Sum of the square of the first 10 natural numbers is"+ sum);
        
        
    }
}