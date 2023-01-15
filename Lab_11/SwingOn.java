import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

import java.awt.Dimension;
import java.awt.Container;
import java.awt.BorderLayout;

public class SwingOn implements Runnable {

  public SwingOn() {

  }

  private JFrame frame;

  public void run() {
    this.frame = new JFrame();
    frame.setPreferredSize(new Dimension(400,200));
    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    createComponents(frame.getContentPane());
    frame.pack();
    frame.setVisible(true);
  }
  
  private void createComponents(Container container) {
    container.setLayout(new BorderLayout());

    container.add(new JLabel("hi"), BorderLayout.CENTER);
  }

  public JFrame getJFrame() {
    return this.frame;
  }

}

