import java.util.ArrayList;

public class Team {
  private String teamName;
  private ArrayList<Player> players;
  private int maxSize;
  private int size;

  public Team(String teamName) {
    this.teamName = teamName;
    this.players = new ArrayList<Player>();
    this.maxSize = 16;
    this.size = 0;
  }

  public String geTeamName() {
    return this.teamName;
  }

  public void addPlayer(Player player) {
   if(this.size < this.maxSize) {
    this.players.add(player);
    this.size += 1;
   }
  }

  public void printPlayers() {
    for(int i = 0; i < players.size(); i++) {
      System.out.println((players.get(i)).getName());
    }
    System.out.println("Team size: " + this.size);
  }

  public void setMaxSize(int maxSize) {
    this.maxSize = maxSize;
  }

  public void numberOfGoals() {
    int sumOfGoals = 0;

    for(int i = 0; i < players.size(); i++) {
      sumOfGoals += (players.get(i)).goals();
    }

    System.out.println(this.teamName + " Total goals: " + sumOfGoals);
  }
}