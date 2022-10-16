/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Saurya21
 */
public class Welcome extends JFrame implements ActionListener
{
    public static final Font BIG_FONT = new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25);
    public static final Color MY_COLOR = new Color(0,0,0);
    private final URL PIC_PATH = getClass().getResource("venn.jpeg");
    private final ImageIcon PIC_GUI = new ImageIcon(new ImageIcon(PIC_PATH).getImage().
            getScaledInstance(500, 200, Image.SCALE_DEFAULT));
    
    private JLabel picLabel;
    private JLabel messageLabel;
    private JPanel buttonPanel;
    private JButton changeButton;

    public Welcome(String name)
    {
        // construct the frame
        super(name);
        this.setBounds(100,50,800,600);
        this.getContentPane().setBackground(Color.DARK_GRAY);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());
        
        //construct the label
        messageLabel = new JLabel("Conditional probability");
        messageLabel.setFont(BIG_FONT);
        messageLabel.setForeground(MY_COLOR);
        
        picLabel = new JLabel(PIC_GUI);
        
        this.changeButton = new JButton("Input");
        changeButton.addActionListener(this);
                
        this.buttonPanel = new JPanel(new FlowLayout());
        buttonPanel.setBackground(Color.BLUE);
        buttonPanel.add(changeButton);
        
        //place the components into frame
        this.add(messageLabel,BorderLayout.NORTH);
        this.add(picLabel,BorderLayout.CENTER);
        this.add(buttonPanel, BorderLayout.SOUTH);
        
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
         if(command.equals("Input"))
      {
          Probability objectInput = new Probability("Input Frame");
      }
    }
}

