package box;

import java.util.Collection;

abstract public class Box {
  public abstract void add(Thing thing);

  public void add(Collection<Thing> things)  {
    for(Thing thing: things) {
      add(thing);
    }
  }

  public abstract boolean isInTheBox(Thing thing);
}