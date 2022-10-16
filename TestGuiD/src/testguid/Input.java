/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testguid;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author Saurya21
 */
public class Input extends JFrame implements ActionListener
{

  private JLabel massLabel;
  private JTextField massField;
  private JLabel accelerationLabel;
  private JTextField accelerationField;
  private JPanel inputPanel;
  private JButton calculateButton;
  private JButton returnButton;
  private JButton exitButton;
  private JPanel navigationPanel;

  public Input()
  {
    super("Input Frame");
    this.setBounds(75, 250, 600, 500);
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    this.getContentPane().setBackground(Color.BLACK);
    this.setLayout(new BorderLayout());

    this.massLabel = new JLabel("Mass: ");
    this.accelerationLabel = new JLabel("Acceleration: ");

    this.massField = new JTextField(10);
    this.accelerationField = new JTextField(10);

    this.returnButton = new JButton("Return");
    returnButton.addActionListener(this);
    this.exitButton = new JButton("Exit");
    exitButton.addActionListener(this);
    this.calculateButton = new JButton("Calculate");
    calculateButton.addActionListener(this);

    this.inputPanel = new JPanel(new FlowLayout());
    inputPanel.setBackground(Color.MAGENTA);
    inputPanel.add(massLabel);
    inputPanel.add(accelerationField);
    inputPanel.add(accelerationLabel);
    inputPanel.add(massField);
    inputPanel.add(calculateButton);

    this.navigationPanel = new JPanel(new FlowLayout());
    navigationPanel.setBackground(Color.CYAN);
    navigationPanel.add(returnButton);
    navigationPanel.add(exitButton);

    this.add(inputPanel, BorderLayout.NORTH);
    this.add(navigationPanel, BorderLayout.SOUTH);
    this.setVisible(true);
  }

  public static void main(String[] args)
  {
    new Input();
  }

  @Override
  public void actionPerformed(ActionEvent e)
  {
    Object command = e.getSource();
    double mass;
    double acceleration;
    double force;
    String answer;

    if (command == exitButton)
    {
      System.exit(0);
    }
    else if (command == returnButton)
    {
      this.dispose();
      new Start();
    }
    else if (command == calculateButton)
    {
      try
      {
        mass = Double.parseDouble(massField.getText());
        acceleration = Double.parseDouble(accelerationField.getText());
        massField.setText("");
        accelerationField.setText("");
        Force forceObj = new Force();
        force = forceObj.calculateForce(mass, acceleration);
        answer = "Force is " + force;
        //new Output(answer);
        System.out.println(answer);
      }
      catch (NumberFormatException nfe)
      {
        new Warning("Invalid Entry! please enter a number!");
      }
      catch (Exception exp)
      {
        new Warning("Something went wrong please try again");
      }
    }
  }
}
  
