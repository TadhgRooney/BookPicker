import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;

public class BookPicker{

  Queue<String> bookQueue = new LinkedList<String>();



public BookPicker(){

  menu();
  
}

public void menu(){

  String reply;
  Scanner scan = new Scanner(System.in);

  System.out.println("Do you want to accsess a random book or add a book to the queue?");    
  reply = scan.nextLine();

  if(reply.equalsIgnoreCase("Random")){
    randomBook();
  }

  
}

public void randomBook(){

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
                book = rand.nextInt(272)+ 1;
                System.out.println(book);
            }
        }while(reply.equalsIgnoreCase("A"));
    }



public static void main(String[] args) {
   new BookPicker();
    
}

}