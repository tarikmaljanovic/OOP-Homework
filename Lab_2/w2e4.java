import java.util.Scanner;

public class w2e4 {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    System.out.print("Enter for a: ");
    int a = Integer.parseInt(reader.nextLine());

    System.out.print("Enter for b: ");
    int b = Integer.parseInt(reader.nextLine());

    if(a < b) {
      while(a <= b) {
        System.out.println(a);
        a++;
      }
    }
  }
}
