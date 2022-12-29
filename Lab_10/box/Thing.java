package box;

public class Thing {
  public String name;
  public double weight;

  public Thing(String name, double weight) {
    if(this.weight < 0) {
      throw new IllegalStateException();
    } else {
      this.name = name;
      this.weight = weight;
    }
  }

  public boolean equals(Thing thing) {
    if(this.name.equals(thing.name) && this.weight == thing.weight && this.getClass() == thing.getClass() && thing != null) {
      return true;
    } else {
      return false;
    }
  }

  public int hashCode() {
    if(this.name == null) {
      return 7;
    }
    return (int) this.weight + this.name.hashCode();
  }


}
