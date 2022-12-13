public class CivilService implements NatioanlService {
  private int daysLeft;

  public CivilService() {
    this.daysLeft = 362;
  }

  public int getDaysLeft() {
    return this.daysLeft;
  }

  public void work() {
    this.daysLeft = this.daysLeft--;
  }
}
