package clicker.ApplicationLogic;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

import clicker.ui.ClickListener;

import java.awt.*;

public class clickEffect implements Runnable {
  public clickEffect() {
  }

  private JFrame frame;

  public void run() {
    this.frame = new JFrame();
    frame.setPreferredSize(new Dimension(300, 150));
    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    createComponents(frame.getContentPane());
    frame.pack();
    frame.setVisible(true);
  }

  private void createComponents(Container container) {
    GridLayout layout = new GridLayout(2, 3);
    container.setLayout(layout);

    PersonalCalculator calc = new PersonalCalculator();

    JLabel value = new JLabel("0");

    ClickListener listener = new ClickListener(calc ,value);

    JButton button = new JButton("Click!");
    button.addActionListener(listener);

    container.add(value);
    container.add(button);
  }

  public JFrame getFrame() {
    return this.frame;
  }
}