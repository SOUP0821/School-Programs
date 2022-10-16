/*
 * This program gives the user any help they need to get to know the program or how 
the equations work
 */
package cpprobability;

//imports
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Saurya21
 */
public class Help extends JFrame implements ActionListener
{
// declaring variables
    private JButton returnButton;
    private Box boxLabel;
    private JLabel helpLabel;
    private JLabel imageLabel;
    private final URL PIC_PATH = getClass().getResource("k.png");
    private final ImageIcon PIC_GUI = new ImageIcon(new ImageIcon(PIC_PATH).getImage().
            getScaledInstance(500, 400, Image.SCALE_DEFAULT));
    public static final Font BIG_FONT = new Font("Comic Sans MS",Font.BOLD|Font.ITALIC, 30);
    

    public Help(String name)
    {
        // construct the frame
        super(name);
        this.setBounds(100, 50, 800, 600);
        this.getContentPane().setBackground(Welcome.BACK_COLOR);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setLayout(new BorderLayout());
        //constructing image
        imageLabel = new JLabel(PIC_GUI);
        
        this.returnButton = new JButton("Return");
        returnButton.addActionListener(this);

        //constructing Label
        this.helpLabel = new JLabel("<html>Click the calculate button to start <br>calculating permutation or combination.<br>"
                + " All the buttons are on the top to go back and navigate.</html>");
        this.helpLabel.setFont(Welcome.BIG_FONT);
        this.helpLabel.setForeground(Welcome.TEXT_COLOR);
        boxLabel = Box.createVerticalBox();

        //adding to box
        boxLabel.add(helpLabel);

        //add Label
        this.add(boxLabel);
        this.add(imageLabel, BorderLayout.SOUTH);

        this.setVisible(true);
    }

    public static void main(String[] args)
    {
        Help objectHelp = new Help("Help");
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        String command = e.getActionCommand();
    }
}
