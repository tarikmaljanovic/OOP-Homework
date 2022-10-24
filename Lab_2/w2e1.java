import java.util.Scanner;

public class w2e1 {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    String secret = "secret";
    
    while(true) {
      System.out.print("Enter password: ");
      String password = reader.nextLine();

      if(password.equals(secret)) {
        System.out.println("Correct");
        break;
      } else {
        System.out.println("Wrong!");
      }

    
    }
    System.out.println("The secret is: " + secret);

  }
}
