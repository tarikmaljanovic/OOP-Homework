import java.util.Scanner;

public class w1e6 {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    System.out.print("Enter for x: ");
    int x = Integer.parseInt(reader.nextLine());

    System.out.print("Enter for y: ");
    int y = Integer.parseInt(reader.nextLine());

    if(x > y) {
      System.out.println("Greater number: " + x);
    } else if (x < y) {
      System.out.println("Greater number: " + y);
    } else {
      System.out.println("The numbers are equal");
    }
  }
}
