package dairyFarms;

public class BulkTank {
  private double capacity = 2000.0;
  private double volume = 2000.0;
  private double amount = 0.0;

  public BulkTank() {}

  public BulkTank(double capacity) {
    this.capacity = capacity;
    this.volume = capacity;
  }

  public double getCapacity() {
    return this.capacity;
  }

  public double getVolume() {
    return this.volume;
  }

  public double howMuchFreeSpace() {
    return this.capacity - this.amount;
  }

  public void addToTank(double amount) {
    if(this.amount + amount > this.capacity) {
      System.out.println("Not enough space!");
    } else {
      this.amount += amount;
    }
  }

  public double getFromTank(double amount) {
    if(this.amount < amount) {
      this.amount = 0.0;
      return this.amount;
    } else {
      this.amount -= amount;
      return amount;
    }
  }
}
