import java.util.Scanner;
import java.util.Random;

public class BookPicker
{
  public static void main(String[] args) {
    Random rand = new Random();
    int book;
    String reply;
    Scanner scan = new Scanner(System.in);

    do{
      System.out.println("Press A to spin ");
      reply = scan.nextLine();
      if(reply.equalsIgnoreCase("A"))
      {
        book = rand.nextInt(272) +1;
        System.out.println(book);

      }

    }while(reply.equalsIgnoreCase("A"));
  
  }
}