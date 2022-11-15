public class Player {
  private String name;
  private int numberOfGoals;

  public Player(String name, int numberOfGoals) {
    this.name = name;
    this.numberOfGoals = numberOfGoals;
  }

  public Player(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public int goals() {
    return this.numberOfGoals;
  }

  public String toString() {
    return "Player: " + this.name + ", number of goals: " + this.numberOfGoals;
  }
}
