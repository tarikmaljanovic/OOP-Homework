package box;

import java.util.ArrayList;

public class BlackHoleBox extends Box {
  private ArrayList<Thing> things;

  public BlackHoleBox() {
    this.things = new ArrayList<Thing>();
  }

  public void add(Thing thing) {
    this.things.add(thing);
  }

  public boolean isInTheBox(Thing thing) {
    return false;
  }  

}