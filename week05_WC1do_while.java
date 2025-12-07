
/**
 * Write a description of class week05_WC1do_while here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class week05_WC1do_while
{
    public static void main(String[] args){
        System.out.println("Series of first 10 even numbers are given below:");
        int i= 1;
        int term=2;
        do {
            System.out.println(term+"");
            term = term + 2;
            i++;
        }
        while(i<=10);
    }
}