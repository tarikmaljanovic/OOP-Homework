import java.util.ArrayList;
import java.util.Scanner;

public class w7e3 {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    Dictionary dictionary = new Dictionary();
    TextUserInterface tui = new TextUserInterface(reader, dictionary);

    dictionary.add("apina", "moneky");
    dictionary.add("banaai", "banana");
    dictionary.add("cembalo", "harpsichord");

    System.out.println(dictionary.translate("apina"));
    System.out.println(dictionary.translate("prokkana"));
    System.out.println(dictionary.amountOfWords());

    ArrayList<String> translationList = new ArrayList<String>();
    translationList = dictionary.translationList();

    for(int i = 0; i < translationList.size(); i++) {
      System.out.println(translationList.get(i));
    }

    tui.start();
  }
}
