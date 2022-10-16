package Welcome;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/*
 *Saurya Nannapaneni 02/04/2020
 */

/**
 *
 * @author Saurya21
 */
public class Welcome extends JFrame implements ActionListener
{
    public static final Font BIG_FONT = new Font("Comic Sans MS",Font.BOLD|Font.ITALIC, 30);
    
    private JPanel buttonPanel;
    private JButton inputButton;
    
    public Welcome(String name)
    {
        
        //construct frame
        super(name);
        this.setBounds(100, 50, 600, 500);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.getContentPane().setBackground(Color.red);
        this.setLayout(new BorderLayout());
        
        this.buttonPanel = new JPanel(new FlowLayout());
        this.inputButton = new JButton("Input");
        inputButton.addActionListener(this);
        this.inputButton.addActionListener(this);
        
        //add components to frame
        buttonPanel.add(inputButton);
        
        //add panel
        this.add(buttonPanel, BorderLayout.NORTH);
        
        this.setVisible(true);
    }
    
    public static void main (String[] args)
    {
        Welcome objectWelcome = new Welcome("Frame 1");
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        String command = e.getActionCommand();
      
      if(command.equals("Input"))
      {
          Input objectInput = new Input("Input Frame");
      }
    }
}
