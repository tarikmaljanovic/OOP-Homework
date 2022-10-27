import java.util.Scanner;

public class w3e3 {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    System.out.print("Enter name: ");
    String name = reader.nextLine();

    for(int i = 0; i < name.length(); i++) {
      System.out.println(name.charAt(i));
    }
  }
}
