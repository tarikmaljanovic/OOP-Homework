import java.util.Random;

public class Dice {
  private int numberOfSides;
  private Random random;

  public Dice(int numberOfSides) {
    this.numberOfSides = numberOfSides;
    this.random = new Random();
  }

  public int roll() {
    return random.nextInt(1,6);
  }
}
