import java.util.Scanner;

public class w1e4 {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    System.out.print("Enter for x: ");
    int x = Integer.parseInt(reader.nextLine());

    System.out.print("Enter for y: ");
    int y = Integer.parseInt(reader.nextLine());

    System.out.println("The sum is: " + (x + y));
  }
}
