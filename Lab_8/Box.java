import java.util.ArrayList;

public class Box implements ToBeStored{
  private double maxWeight;
  private ArrayList<ToBeStored> things;
  private double weight;

  public Box(double maxWeight) {
    this.maxWeight = maxWeight;
    this.things = new ArrayList<ToBeStored>();
  }

  public void add(ToBeStored thing) {
    if((this.weight + thing.weight()) > this.maxWeight) {
      System.out.println("Not enough space!");  
    } else {
    this.things.add(thing);
    this.weight += thing.weight();
    }
  }

  public String toString() {
    return "Box: " + this.things.size() + " ,things " + this.weight;
  }

  public double weight() {
    return this.weight;
  }
}
