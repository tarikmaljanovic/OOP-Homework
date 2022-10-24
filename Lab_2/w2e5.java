import java.util.Scanner;

public class w2e5 {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    System.out.print("Enter an exponent: ");
    int exponent = Integer.parseInt(reader.nextLine());

    int sum = 0;

    while(exponent >= 0) {
      sum += (int)Math.pow(2, exponent);
      exponent--;
    }

    System.out.println("The sum is: " + sum);
  }
}
