import java.util.Scanner;

public class w3e2 {
  public static int count(String name) {
    int counter = 0;

    for(int i = 0; i < name.length(); i++) {
      counter++;
    }
    return counter;
  }
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    
    System.out.print("Enter name: ");
    String name = reader.nextLine();

    System.out.println("Number of characters: " + count(name));
  }
}
