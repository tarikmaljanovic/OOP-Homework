package dairyFarms;

public class Barn {
  private BulkTank tank;
  private MilkingRobot robot;

  public Barn(BulkTank tank) {
    this.tank = tank;
  }

  public BulkTank getBulkTank() {
    return this.tank;
  }

  public void installMilkingRobot(MilkingRobot robot) {
    this.robot = new MilkingRobot();
  }

  public void takeCareOf(Cow cow) {
    if(robot == null) {
      throw new IllegalStateException();
    } else {
      this.robot.milk(cow);
    }
  }

  public String toString() {
    return tank.toString();
  }
}