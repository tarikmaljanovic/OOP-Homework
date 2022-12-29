package people;

public class Student extends Person {
  private int credits;

  public Student(String fullName, String address) {
    super(fullName, address);
    this.credits = 0;
  }

  public void study() {
    this.credits++;
  }

  public int getCredits() {
    return this.credits;
  }

  public String toString() {
    return this.fullName + "\n" + this.address + "\n" + "Credits: " + this.credits;
  }
}
