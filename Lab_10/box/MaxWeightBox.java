package box;

import java.util.ArrayList;

public class MaxWeightBox extends Box {
  private int maxWight;
  private int weight;
  private ArrayList<Thing> things;

  public MaxWeightBox(int maxWight) {
    this.maxWight = maxWight;
    this.weight = 0;
    this.things = new ArrayList<Thing>();
  }

  public boolean isInTheBox(Thing thing) {
    return this.things.contains(thing);
  }

  public void add(Thing thing) {
    if(this.weight + thing.weight > this.maxWight) {
      throw new IllegalStateException();
    } else {
    this.things.add(thing);
    }
  }
}