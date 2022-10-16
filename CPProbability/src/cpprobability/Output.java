/*
 * this program shows the user their result from the number they inputted.
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


/*
 * Saurya Nannapaneni 02/04/2020 Outputs info
 */
public class Output extends JFrame implements ActionListener
{
    // declaring variables
    private JLabel outputLabel;
    private JPanel buttonPanel;
    private JButton returnButton;
    private JButton exitButton;
    private JButton homeButton;
    private JButton helpButton;
    private JLabel imageLabel;
    private final URL JESUS_DON = getClass().getResource("jesus_don.jpg");
    private final ImageIcon DON_IMAGE = new ImageIcon(new ImageIcon(JESUS_DON).getImage().
           getScaledInstance(200, 200, Image.SCALE_DEFAULT));
    
    public Output(String name, int result)
    {
        //construct frame
        super(name);
        this.setBounds(100, 50, 600, 500);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.getContentPane().setBackground(Welcome.BACK_COLOR);
        this.setLayout(new BorderLayout());
        
        // adding image
        imageLabel = new JLabel(DON_IMAGE);
        
        
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
        
        //if statement displaying results
        if (result >= 0)
        {
            this.outputLabel = new JLabel("The output is : " + result +"%"); //displays if number is positive
            this.outputLabel.setFont(Input.SMALL_FONT); // sets the font
            this.outputLabel.setForeground(Welcome.TEXT_COLOR); // sets text color
        }
        else
        {
            this.outputLabel = new JLabel("Numbers incorrect negative result: " + result); // displays if number is negative
            this.outputLabel.setFont(Input.SMALL_FONT);
            this.outputLabel.setForeground(Welcome.TEXT_COLOR);
        }

        //adding components to button panel
        buttonPanel.add(helpButton);
        buttonPanel.add(homeButton);
        buttonPanel.add(returnButton);
        buttonPanel.add(exitButton);
        
        // Adding components
        this.add(outputLabel, BorderLayout.CENTER);
        this.add(buttonPanel, BorderLayout.NORTH);
        this.add(imageLabel, BorderLayout.EAST);
        
        
        this.setVisible(true);
    }
    public static void main(String[] args)
    {
        Output objectOut = new Output("Output", -3);
    }

    // Actions for buttons
    @Override
    public void actionPerformed(ActionEvent e)
    {
        String command = e.getActionCommand();
        
        if (command.equals("Return"))
        {
            this.dispose(); //disposes of frame
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

