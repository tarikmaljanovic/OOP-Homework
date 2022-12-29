package people;

public class Person {
  protected String fullName;
  protected String address;

  public Person(String fullName, String address) {
    this.fullName = fullName;
    this.address = address;
  }

  public String toString() {
    return this.fullName + "\n" + this.address;
  }
}