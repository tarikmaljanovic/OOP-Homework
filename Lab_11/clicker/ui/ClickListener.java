package clicker.ui;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import clicker.ApplicationLogic.Calculator;
import java.awt.event.ActionEvent;


public class ClickListener implements ActionListener { 
  private JLabel value;
  private Calculator calc;

  public ClickListener(Calculator calc, JLabel value) {
    this.calc = calc;
    this.value = value;
  }

  public void actionPerformed(ActionEvent event) {
    this.value.setText("" + this.calc.giveValue());
    this.calc.increase();
  }
}
