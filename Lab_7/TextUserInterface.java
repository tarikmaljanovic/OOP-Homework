import java.util.Scanner;

import javax.print.attribute.standard.Finishings;

public class TextUserInterface {
  private Scanner reader;
  private Dictionary dictionary;

  public TextUserInterface(Scanner reader, Dictionary dictionary) {
    this.reader = reader;
    this.dictionary = dictionary;
  }

  public void start() {
    String statement;

    System.out.println("Statements: ");
    System.out.println("add-adds a word pair to the dictionary");
    System.out.println("translate-asks for a word and translates it");
    System.out.println("quit-quits the text user interface");

    System.out.print("Enter statement: ");
    statement = reader.nextLine();

    if(statement.equals("add")) {
      String finsih;
      String translation;

      System.out.println("Statement: add");

      System.out.print("In Finish: ");
      finsih = reader.nextLine();

      System.out.print("Translation: ");
      translation = reader.nextLine();

      dictionary.add(finsih, translation);
      start();
    } else if(statement.equals("translate")) {
      String word;

      System.out.println("Statement: translate");

      System.out.print("Give a word: ");
      word = reader.nextLine();

      System.out.println("Translation: " + dictionary.translate(word));
      start();
    } else if(statement.equals("quit")) {
      System.out.println("Bye!");
    }
  }
}
