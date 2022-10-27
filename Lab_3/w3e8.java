import java.util.Scanner;

public class w3e8 {
  public static void palindrome(String word) {
    String word_reversed = "";

    for(int i = word.length() - 1; i >= 0; i--) {
      word_reversed += word.charAt(i);
    }

    if(word.equals(word_reversed)) {
      System.out.println("The word is a palindrome");
    } else {
      System.out.println("The word is not a palindrome");
    }
  }

  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    System.out.print("Enter a word: ");
    String word = reader.nextLine();

    palindrome(word);
  }
}
