import java.util.HashMap;

public class PromissoryNote {
  private HashMap<String, Double> people;

  public PromissoryNote() {
    this.people = new HashMap<String, Double>();
  }

  public void setLoan(String toWhom, double value) {
    people.put(toWhom, value);
  }

  public double howMuchIsDept(String whose) {
    if(people.get(whose) != null) {
      return people.get(whose);
    } else {
      return 0;
    }
  }
}