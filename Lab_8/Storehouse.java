import java.util.HashMap;

public class Storehouse {
  private HashMap<String, Integer> productPrices;
  private HashMap<String, Integer> productStocks;

  public Storehouse() {
    this.productPrices = new HashMap<String, Integer>();
    this.productStocks = new HashMap<String, Integer>();
  }

  public void addProduct(String product, int price, int stock) {
    this.productPrices.put(product, price);
    this.productStocks.put(product, stock);
  }

  public int price(String product) {
    if((this.productPrices.get(product)) == null) {
      return -99;
    } else {
      return this.productPrices.get(product);
    }
  }

  public int stock(String product) {
    if((this.productStocks.get(product)) == null) {
      return -99;
    } else {
      return this.productStocks.get(product);
    }
  }

  public boolean take(String product) {
    if((this.productStocks.get(product)) != null && (this.productStocks.get(product)) != 0) {
      this.productStocks.put(product, (this.productStocks.get(product))-1);
      return true;
    } else {
      return false;
    }
  }

  public void products() {
    for(String product: this.productPrices.keySet()) {
      System.out.println(product);
    }
  }
}
