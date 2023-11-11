import java.util.Random;
import java.util.Scanner;
/**
 * Write a description of class Random here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Books
{
    public static void main(String[]args)
    {
        System.out.println("\f");
        Random rand = new Random();
        int book;
        String reply;
        Scanner scan = new Scanner(System.in);
        do
        {
            System.out.print("Press A to spin");
            reply=scan.nextLine();
            if(reply.equalsIgnoreCase("A"))
            {
                book = rand.nextInt(259)+ 1;
                System.out.println(book);
            }
        }while(reply.equalsIgnoreCase("A"));
    }
}
