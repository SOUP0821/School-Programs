package Welcome;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Saurya21
 */
public class Warning extends JFrame implements ActionListener
{
   private JLabel warningLabel;
   private JLabel imageLabel;
   private final URL DON = getClass().getResource("DON.png");
   private final ImageIcon DON_IMAGE = new ImageIcon(new ImageIcon(DON).getImage().
           getScaledInstance(200, 200, Image.SCALE_DEFAULT));
   
   public Warning (String message)
    {
    super("Warning Frame");
    this.setBounds(100, 50, 600, 500);
    this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    this.getContentPane().setBackground(Color.YELLOW);
    this.setLayout(new BorderLayout());
    
    this.warningLabel = new JLabel(message);
    this.warningLabel.setFont(Welcome.BIG_FONT);
    this.warningLabel.setForeground(Color.GREEN);
   
    imageLabel = new JLabel(DON_IMAGE);
    
    //adding components to frame
    this.add(warningLabel, BorderLayout.CENTER);
    this.add(imageLabel, BorderLayout.EAST);
    
    this.setVisible(true);
    
    }
   
   public static void main(String[] args)
   {
       new Warning("Testing");
   }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
