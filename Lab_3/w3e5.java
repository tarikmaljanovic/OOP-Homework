import java.util.Scanner;

public class w3e5 {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    System.out.print("Word 1: ");
    String word1 = reader.nextLine();

    System.out.print("Word 2: ");
    String word2 = reader.nextLine();

    if(word1.indexOf(word2) != -1) {
      System.out.println(word2 + " is in the word " + word1);
    } else {
      System.out.println(word2 + " is not in the word " + word1);
    }    
  }
}
