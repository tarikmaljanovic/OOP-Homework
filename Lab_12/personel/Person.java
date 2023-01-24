package personel;

public class Person {
  private String name;
  private Education title;

  public Person(String name, Education education) {
    this.name = name;
    this.title = title;
  }

  public Education getEducation() {
    return this.title;
  }

  public String toString() {
    return this.name + ", " + this.title;
  }

}