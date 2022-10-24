import java.util.Scanner;

public class w2e3 {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    int sum = 0;

    while(true) {
      System.out.print("Enter a number: ");
      int num = Integer.parseInt(reader.nextLine());

      if(num == 0) {
        break;
      } else {
        sum += num;
      }
    }

    System.out.println("The sum is: " + sum);
  }
  
}
