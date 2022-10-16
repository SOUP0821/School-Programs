/*
 * To change this license header, choose License Headers in Project Properties
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testguid;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author Saurya21
 */
public class Start extends JFrame implements ActionListener
{
  // declating font
  public static final Font BIG_FONT = new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25);
  // declaring color
  private static final Color NICE_COLOR = new Color(5, 67, 129, 250);
  // declaring image
  private final URL PIC_PATH = getClass().getResource("DON.png");
  private final ImageIcon PIC_GUI = new ImageIcon(new ImageIcon(PIC_PATH).getImage().
            getScaledInstance(500, 200, Image.SCALE_DEFAULT));
  
  private JLabel message;
  private JLabel don;
  
  private JPanel buttonPanel;
  private JButton input;

  public Start()
  {
    // constructing/initalizing the frame
    super("Starting Frame");
    this.setBounds(75, 40, 500, 500);
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    this.getContentPane().setBackground(NICE_COLOR);
    this.setLayout(new BorderLayout());
    
    // constructing text message
    this.message = new JLabel("w  o  a  h", SwingConstants.CENTER);
    message.setFont(BIG_FONT);
    message.setForeground(Color.WHITE);
    
    this.don = new JLabel(PIC_GUI);
    input = new JButton("Input");
    input.addActionListener(this);
    
    this.buttonPanel = new JPanel(new FlowLayout());
    buttonPanel.setBackground(Color.MAGENTA);
    buttonPanel.add(input);
    
    this.add(don, BorderLayout.CENTER);
    this.add(message, BorderLayout.NORTH);
    this.add(buttonPanel, BorderLayout.SOUTH);

    this.setVisible(true);
    
  }
  public static void main(String[] args)
  {
    new Start();
  }

  @Override
  public void actionPerformed(ActionEvent e)
  {
    String command = e.getActionCommand();
    if (command.equals("Input"))
    {
      this.dispose();
      new Input();
      System.out.println("Button Clicked");
      //new Input();
    }
  }
}
