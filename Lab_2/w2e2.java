import java.util.Scanner;

public class w2e2 {
    public static void main(String[] args) {
      Scanner reader = new Scanner(System.in);
      int i = 0;
      int sum = 0;

      while(i < 3) {
        System.out.print("Enter number: ");
        int num = Integer.parseInt(reader.nextLine());
        sum += num;
        i++;
      }
      System.out.println("The sum is: " + sum);

    }
}
