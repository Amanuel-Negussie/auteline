/**
 * SMTI06, 54411850, M Haidar Hanif
 * Task Five: Automated Teller Machine
 * Auteline | Simple ATM simulator with basic features
 */

// AutelineApp.java
// GUI driver program to test ATM program


package main.frame;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AutelineApp implements ActionListener {
  // main method creates and runs the ATM in GUI mode

  private static JLabel accountLabel;
  private static JTextField accountText;
  private static JLabel passwordLabel;
  private static JPasswordField passwordText;
  private static JButton button;
  private static JLabel success;
  public static void main(String[] args) {
    JPanel panel = new JPanel();
    JFrame frame = new JFrame();
    frame.setSize(600,500);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.add(panel);

    panel.setLayout(null);

    accountLabel = new JLabel("Account Number: ");
    accountLabel.setBounds(10,20,190,25);
    panel.add(accountLabel);

    accountText = new JTextField();
    accountText.setBounds(120,20,165,25);
    panel.add(accountText);

    passwordLabel = new JLabel("Pin: ");
    passwordLabel.setBounds(10,50,80,25);
    panel.add(passwordLabel);

    passwordText = new JPasswordField();
    passwordText.setBounds(120, 50,165,25);
    panel.add(passwordText);

    button = new JButton("Login");
    button.setBounds(10, 80, 80, 25);
    button.addActionListener(new AutelineApp());
    panel.add(button);

    success = new JLabel("");
    success.setBounds(10, 110, 300, 25);
    panel.add(success);


    frame.setVisible(true);
    //UnitFrame realATM = new UnitFrame();
    //realATM.run();
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    String user = accountText.getText();
    String password = passwordText.getText();

    if (user.equals("12345") && password.equals("54321")){
      success.setText("Login successful!");
      homepage hp = new homepage();
      hp.setVisible(true);
    }
    else{
      success.setText("Invalid Account Number or Pin");
    }
  }
}
