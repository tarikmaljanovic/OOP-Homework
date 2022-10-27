import java.util.Scanner;
import java.util.ArrayList;

public class w3e7 {

  public static ArrayList<Integer> lengths(ArrayList<String> list) {
    ArrayList<Integer> lens = new ArrayList<Integer>();

    for(int i = 0; i < list.size(); i++) {
      lens.add((list.get(i)).length());
    }
    return lens;
  }
  

  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    ArrayList<String> words = new ArrayList<String>();

    words.add("Hallo");
    words.add("Moi");
    words.add("Benvenuto!");
    words.add("badger badger badger badger");

    ArrayList<Integer> lens = lengths(words);
    System.out.println(lens);
  }
}
