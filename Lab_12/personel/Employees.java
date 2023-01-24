package personel;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class Employees {
  private ArrayList<Person> employees;

  public Employees() {
    this.employees = new ArrayList<Person>();
  }

  public void add(Person person) {
    this.employees.add(person);
  }

  public void add(List<Person> people) {
    for(Person peorson: people) {
      this.employees.add(peorson);
    }
  }

  public void print() {
    Iterator<Person> iterator = employees.iterator();
  
    while(iterator.hasNext()) {
      System.out.println(iterator.next());
    }
  }

  public void print(Education education) {
    Iterator<Person> iterator = employees.iterator();
    
    while(iterator.hasNext()) {
      Person nextPerson = iterator.next();

      if(nextPerson.getEducation() == education) {
        System.out.println(iterator.next());
      }
    }
  }

  public void fire(Education education) {
    Iterator<Person> iterator = employees.iterator();

    while(iterator.hasNext()) {
      Person nextPerson = iterator.next();

      if(nextPerson.getEducation() == education) {
        employees.remove(iterator.next());
      }
    }
  }
}