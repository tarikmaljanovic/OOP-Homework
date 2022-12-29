package box;

public class OneThingBox extends Box {
  private Thing thing;

  public OneThingBox() {}

  public void add(Thing thing) {
    if(this.thing == null) {
      this.thing = thing;
    } else {
      throw new IllegalStateException();
    }
  }

  public void removeThing() {
    this.thing = null;
  }

  public boolean isInTheBox(Thing thing) {
    return thing.equals(thing);
  }
}