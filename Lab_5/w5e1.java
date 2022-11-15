public class w5e1 {
  public static void main(String[] args) {
    Player p1 = new Player("P1", 9);
    Player p2 = new Player("P2", 1);
    
    Team t1 = new Team("T1");

    t1.addPlayer(p1);
    t1.addPlayer(p2);
    t1.printPlayers();
    t1.numberOfGoals();
  }
}
