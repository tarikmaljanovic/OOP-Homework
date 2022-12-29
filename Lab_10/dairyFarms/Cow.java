package dairyFarms;
import java.util.Random;

public class Cow implements Milkable, Alive {
  private String name;
  private double capacity;
  private double amount;
  private Random random;
  private boolean milkable;
  private boolean liveHour;
  private int hour = 0;
  private String[] names = { "Anu", "Arpa", "Essi", "Heluna", "Hely",  "Hento", "Hilke", "Hilsu", "Hymy", "Ihq", "Ilme", "Ilo",  "Jaana", "Jami", "Jatta", "Laku", "Liekki",  "Mainikki", "Mella", "Mimmi", "Naatti", "Nina", "Nyytti", "Papu", "Pullukka", "Pulu", "Rima", "Soma", "Sylkki", "Valpu", "Virpi"};

  public Cow() {
    this.random = new Random();
    this.capacity =  15.0 + random.nextDouble();
    this.amount = 25.0  + random.nextDouble();
    this.name = names[random.nextInt(names.length)];
  }

  public Cow(String name) {
    Random random = new Random();
    this.name = name;
    this.capacity = 15 + random.nextDouble();
  }

  public String getName() {
    return this.name;
  }

  public double getCapacity() {
    return this.capacity;
  }

  public double getAmount() {
    return this.amount;
  }

  public boolean milkable() {
    if(this.amount > 0) {
      this.milkable = true;
      return this.milkable;
    } else {
      this.milkable = false;
      return this.milkable;
    }
  }

  public boolean liveHour() {
    if(this.hour > 0) {
      this.liveHour = true;
      return this.liveHour;
    } else {
      this.liveHour = false;
      return this.liveHour;
    }
  }

  public double milk() {
    double amountMilked;
    if(milkable() && liveHour() && this.amount >= 0.7) {
      amountMilked = this.amount - (0.7 + random.nextDouble());
      this.liveHour = false;
      this.amount -= (0.7 + random.nextDouble());
    } else {
      amountMilked = 0.0;
    }
     return amountMilked;
  }

  public void passHour() {
    this.hour += 1;
  }
}