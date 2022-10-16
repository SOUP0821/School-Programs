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
import javax.swing.SwingConstants;

/**
 *
 * @author Saurya21
 */
public class Output extends JFrame implements ActionListener
{

  private JLabel outputLabel;
  private JButton exitButton;
  private JButton closeButton;
  private JPanel buttonPanel;

  public Output(String message)
  {
    // construct the frame
    super("Output Frame");
    this.setBounds(100, 100, 500, 500);
    this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    this.getContentPane().setBackground(Color.PINK);
    this.setLayout(new BorderLayout());
//construct label to display message
    this.outputLabel = new JLabel(message, SwingConstants.CENTER);
    outputLabel.setFont(Start.BIG_FONT);
// construct navigation button
    exitButton = new JButton("Exit the Program");
    exitButton.addActionListener(this);
    closeButton = new JButton("Close the window");
    closeButton.addActionListener(this);
    buttonPanel = new JPanel(new FlowLayout());
    buttonPanel.setBackground(Color.BLUE);
    buttonPanel.add(exitButton);
    buttonPanel.add(closeButton);
    this.add(outputLabel, BorderLayout.NORTH);
    this.add(buttonPanel, BorderLayout.SOUTH);
    this.setVisible(true);
  }

  public static void main(String[] args)
  {
    new Output("HELLO OUTPUT!");
  }

  @Override
  public void actionPerformed(ActionEvent e)
  {
    Object command = e.getSource();

    if (command == exitButton)
    {
      System.exit(0);
    }
    else if (command == closeButton)
    {
      this.dispose();
    }
  }
}
