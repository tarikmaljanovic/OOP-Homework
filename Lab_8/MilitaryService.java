public class MilitaryService implements NatioanlService {
  private int daysLeft;

  public MilitaryService(int days) {
    this.daysLeft = days;
  }

  public int getDaysLeft() {
    return this.daysLeft;
  }

  public void work() {
    this.daysLeft = this.daysLeft--;
  }
}
