public class CD implements ToBeStored {
  private String artist;
  private String title;
  private int yearOfPublishing;
  private double weight;

  public CD(String artist, String title, int yearOfPublishing) {
    this.artist = artist;
    this.title = title;
    this.yearOfPublishing = yearOfPublishing;
    this.weight = 0.1;
  }

  public double weight() {
    return this.weight;
  }
}
