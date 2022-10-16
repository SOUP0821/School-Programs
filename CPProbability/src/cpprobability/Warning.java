/*
 Gives user a warning if an error occurs
 */
package cpprobability;

//imports
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Saurya21
 */
public class Warning extends JFrame implements ActionListener
{
    //declaring variables
   private JLabel warningLabel;
   private JLabel imageLabel;
   private JPanel buttonPanel;
   private JButton returnButton;
   private JButton exitButton;
   private JButton homeButton;
   private JButton helpButton;
   public static final Color WARNING_COLOR = new Color(23, 123, 119); // declaring color
   private final URL DON = getClass().getResource("angry.jpg"); // declaring image
   private final ImageIcon DON_IMAGE = new ImageIcon(new ImageIcon(DON).getImage().
           getScaledInstance(200, 200, Image.SCALE_DEFAULT));
   
   public Warning (String message)
    {
        // constructing frame
    super("Warning Frame");
    this.setBounds(100, 50, 600, 500);
    this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    this.getContentPane().setBackground(WARNING_COLOR);
    this.setLayout(new BorderLayout());
    
    //constructing label
    this.warningLabel = new JLabel(message);
    this.warningLabel.setFont(Welcome.BIG_FONT);
    this.warningLabel.setForeground(Welcome.TEXT_COLOR);
   
    //constructing Panel
    this.buttonPanel = new JPanel(new FlowLayout());
    
    // Constructing Button
    this.returnButton = new JButton("Return");
    this.returnButton.addActionListener(this);
    this.exitButton = new JButton("Exit");
    this.exitButton.addActionListener(this);
    this.helpButton = new JButton("Help");
    this.helpButton.addActionListener(this);
    this.homeButton = new JButton("Home");
    this.homeButton.addActionListener(this);
        
    //declaring image label
    //imageLabel = new JLabel(DON_IMAGE);
    
    //adding buttons to panel
    buttonPanel.add(helpButton);
    buttonPanel.add(homeButton);
    buttonPanel.add(returnButton);
    buttonPanel.add(exitButton);
    
    //adding components to frame
    this.add(warningLabel, BorderLayout.CENTER);
    this.add(imageLabel, BorderLayout.EAST);
    this.add(buttonPanel, BorderLayout.NORTH);
    
    this.setVisible(true);
    
    }
   
   // If the error occurs the warning pops up
   public static void main(String[] args)
   {
       new Warning("Please put in numbers");
   }
   //actions for buttons
    @Override
    public void actionPerformed(ActionEvent e)
    {
        String command = e.getActionCommand();
        
        if (command.equals("Return"))
        {
            Input objectInput = new Input();
            this.dispose(); //dispose of frame and create frame
        }
        if (command.equals("Exit"))
        {
            this.dispose();
        }
        if (command.equals("Help"))
        {
            Help objectHelp = new Help("Help"); //opens help frame
        }
        if (command.equals("Home"))
        {
            Welcome objectWelcome = new Welcome("Probability"); //opens welcome frame
            this.dispose();
        }
    }
}
