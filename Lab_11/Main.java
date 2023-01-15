import javax.swing.SwingUtilities;

import clicker.ApplicationLogic.clickEffect;

public class Main {
  public static void main(String args[]) {
    clickEffect io = new clickEffect();
    SwingUtilities.invokeLater(io);
  }
}
