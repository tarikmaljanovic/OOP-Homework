import java.util.Scanner;
import java.util.ArrayList;

public class w3e6 {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    ArrayList<String> words = new ArrayList<String>();

    while(true) {
      System.out.print("Enter a word: ");
      String word = reader.nextLine();

      if(words.contains(word)) {
        System.out.println("You already entered " + word);
        break;
      } else {
        words.add(word);
      }
    }
  }
}
