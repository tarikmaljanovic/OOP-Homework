import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.WindowConstants;
import java.awt.Container;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;

import java.awt.Dimension;

public class Survey implements Runnable {
  public Survey() {}

  JFrame frame = new JFrame();

  public void run() {
    this.frame = new JFrame();
    frame.setPreferredSize(new Dimension(200, 300));
    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    createComponents(frame.getContentPane());
    frame.pack();
    frame.setVisible(true);
  }

  private void createComponents(Container container) {
    BoxLayout layout = new BoxLayout(container, BoxLayout.Y_AXIS);
    container.setLayout(layout);

    container.add(new JLabel("Are you?"));
    container.add(new JCheckBox("Yes!"));
    container.add(new JCheckBox("No!"));
    container.add(new JLabel("Why?"));
    
    JRadioButton noReason = new JRadioButton("No reason.");
    JRadioButton fun = new JRadioButton("Because it is fun.");
    ButtonGroup group = new ButtonGroup();
    group.add(noReason);
    group.add(fun);

    container.add(noReason);
    container.add(fun);
  }
}
