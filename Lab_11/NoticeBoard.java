import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import java.awt.*;
import java.util.EventListener;

public class NoticeBoard implements Runnable {
  public NoticeBoard() {

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
    GridLayout layout = new GridLayout(3,1);
    container.setLayout(layout);

    JButton button =  new JButton("Copy");
    JTextArea board = new JTextArea();
    JTextField input = new JTextField();

    ActionEventListener eventListener = new ActionEventListener(board, input);
    button.addActionListener(eventListener);

    container.add(input);
    container.add(button);
    container.add(board);
  }

  public JFrame getJFrame() {
    return this.frame;
  }
}
