import java.util.HashMap;

public class w7e1 {
  public static void main(String[] args) {
    HashMap<String,String> people = new HashMap<String,String>();

    people.put("matti", "mage");
    people.put("mikael", "mixu");
    people.put("arto", "arppa");

    System.out.println(people.get("matti"));
    System.out.println(people.get("mikael"));
    System.out.println(people.get("arto"));
  }
}