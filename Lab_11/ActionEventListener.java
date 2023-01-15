import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ActionEventListener implements ActionListener {
  private JTextArea text;
  private JTextField input;

  public ActionEventListener(JTextArea text, JTextField input) {
    this.text = text;
    this.input = input;
  }

  public void actionPerformed(ActionEvent event) {
    this.text.setText(this.input.getText());
  }
}
