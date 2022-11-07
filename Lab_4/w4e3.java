public class w4e3 {
  public static void main(String[] args) {
    LyyraCard card = new LyyraCard(25.0);

    System.out.println(card.toString()); //25.0

    card.payEconomical();
    System.out.println(card.toString()); //22.5

    card.payGourmet();
    System.out.println(card.toString()); //18.5

    card.loadMoney(-10);
    System.out.println(card.toString());
  }
}
