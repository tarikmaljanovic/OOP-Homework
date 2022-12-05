import java.util.Random;

public class NightSky {
  private double density;
  private int width;
  private int height;
  private Random random;

  public NightSky(double density) {
    this.density = density;
    this.width = 20;
    this.height = 10;
    this.random = new Random();
  }

  public NightSky(int width, int height) {
    this.density = 0.1;
    this.width = width;
    this.height = height;
    this.random = new Random();
  }

  public NightSky(double density, int width, int height) {
    this.density = density;
    this.width = width;
    this.height = height;
    this.random = new Random();
  }

  public void printLine() {
    int starCount = (int) (((double) this.width /100) * (this.density * 100));
    int counter = 0;

    for(int i = 0; i <= this.width; i++) {
      
      double p = random.nextDouble();
      double q = 1-p;
      

        if(p > q) {
          if(counter <= starCount) {
            System.out.print("*");
            counter++;
          }
        } else {
          System.out.print(" ");
        }
    }
  }

}
