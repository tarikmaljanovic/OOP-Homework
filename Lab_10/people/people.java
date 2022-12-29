package people;
import java.util.ArrayList;

public class people {

  public static void printDepartment(ArrayList<Person> people) {
    for(int i = 0; i < people.size(); i++) {
      System.out.println(people.get(i));
      System.out.println("");
    }
  }
  public static void main(String[] args) {
    Person p1 = new Person("Pekka Rollins", "Street 701");
    Student s1 = new Student("Esko Ukkonen", "Cesta 1");
    Teacher t1 = new Teacher("Adnan Miljkovic", "Sarajevska", 500000);

    s1.study();

    ArrayList<Person> people = new ArrayList<Person>();

    people.add(p1);
    people.add(s1);
    people.add(t1);

    printDepartment(people);
  }
}
