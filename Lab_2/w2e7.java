import java.util.Scanner;

public class w2e7 {
 public static void printStars(int n) {
  String star =  "";

  while(n >= 0) {
    star += "*";
    n--;
  }

  System.out.println(star);
 }

 public static void main(String[] args) {
  Scanner reader = new Scanner(System.in);

  System.out.print("How many stars to print: ");
  int num = Integer.parseInt(reader.nextLine());

  printStars(num);
 }
}
