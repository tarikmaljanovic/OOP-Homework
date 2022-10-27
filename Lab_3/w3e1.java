import java.util.Scanner;

public class w3e1 {
  public static double average(int a, int b, int c, int d) {
    int sum = Integer.sum(a, b) + Integer.sum(c, d);
    double avg = sum / 4.01;
    return avg;
  }

  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    System.out.print("a: ");

    int a = Integer.parseInt(reader.nextLine());

    System.out.print("b: ");
    int b = Integer.parseInt(reader.nextLine());

    System.out.print("c: ");
    int c = Integer.parseInt(reader.nextLine());

    System.out.print("d: ");
    int d = Integer.parseInt(reader.nextLine());

    System.out.println("The average is: " + average(a, b, c, d));
  }
}
