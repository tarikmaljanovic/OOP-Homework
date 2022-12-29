package people;

public class Teacher extends Person {
  private int salary;

  public Teacher(String fullName, String address, int salary) {
    super(fullName, address);
    this.salary = salary;
  }

  public String toString() {
    return this.fullName + "\n" + this.address + "\n" + this.salary;
  }
}
