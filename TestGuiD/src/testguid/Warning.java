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
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

/**
 *
 * @author Saurya21
 */
public class Warning extends JFrame implements ActionListener
{
// labels

  private JLabel messageLabel;
  private JButton exitButton;
  private JButton closeButton;
  private JPanel buttonPanel;

  public Warning(String message)
  {
// construct the frame
    super("Warning");
    this.setBounds(200, 200, 500, 500);
    this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    this.getContentPane().setBackground(Color.RED);
    this.setLayout(new BorderLayout());
// construct the message label
    this.messageLabel = new JLabel(message, SwingConstants.CENTER);
    messageLabel.setFont(Start.BIG_FONT);

// construct navigation button
    exitButton = new JButton("Exit the Program");
    exitButton.addActionListener(this);
    closeButton = new JButton("Close the window");
    closeButton.addActionListener(this);
    buttonPanel = new JPanel(new FlowLayout());
    buttonPanel.setBackground(Color.BLUE);
    buttonPanel.add(exitButton);
    buttonPanel.add(closeButton);
// add the components to the frame and make it visible
    this.add(messageLabel, BorderLayout.NORTH);
    this.add(buttonPanel, BorderLayout.SOUTH);
    this.setVisible(true);
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

  public static void main(String[] args)
  {
    new Warning("Dude! What is wrong with you?");
  }
}
