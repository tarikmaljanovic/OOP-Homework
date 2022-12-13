public class sotoreh {
 public static void main(String[] args) {
  Storehouse storehouse = new Storehouse();

  storehouse.addProduct("Milk", 2, 40);
  storehouse.addProduct("Sugar", 3, 35);
  storehouse.addProduct("Flour", 6, 60);

  ShoppingBasket basket = new ShoppingBasket();
  basket.add("Milk", 2, 4);
  basket.add("Sugar", 3, 5);
  basket.add("Flour", 1, 4);
  basket.add("Eggs", 3, 1);

  basket.print();
 } 
}
