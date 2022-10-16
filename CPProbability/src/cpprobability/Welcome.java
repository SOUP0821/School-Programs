/*
Saurya Nannapaneni 02/20/2020 This program models Combination and Permutations and this is the 
welcome frame
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
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

/**
 *
 * @author Saurya21
 */
public class Welcome extends JFrame implements ActionListener
{
    // declares attributes
    private JPanel buttonPanel;
    private JButton inputButton;
    private JButton exitButton;
    private JLabel picLabel;
    private JMenuBar mainBar;
    private JMenu helpMenu;
    private JMenuItem helpItem;
    public static final Color BACK_COLOR = new Color(212,133,123);
    public static final Color TEXT_COLOR = new Color(70, 8, 194);
    private final URL PIC_PATH = getClass().getResource("DON.png");
    private final ImageIcon PIC_GUI = new ImageIcon(new ImageIcon(PIC_PATH).getImage().
            getScaledInstance(500, 200, Image.SCALE_DEFAULT));
    public static final Font BIG_FONT = new Font("Comic Sans MS",Font.BOLD|Font.ITALIC, 30);
    
    public Welcome (String name)
    {
        //constructs frame
        super(name);
        this.setBounds(100, 50, 600, 500);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.getContentPane().setBackground(BACK_COLOR);
        this.setLayout(new BorderLayout());
        
        //constructing image
        picLabel = new JLabel(PIC_GUI);
        
        //constructs components
        this.buttonPanel = new JPanel(new FlowLayout());
        this.inputButton = new JButton("Calculate");
        this.inputButton.addActionListener(this);
        this.exitButton = new JButton("Exit");
        this.exitButton.addActionListener(this);
        mainBar = new JMenuBar();
        helpMenu = new JMenu("Probability");
        helpItem = new JMenuItem("Help");
        this.helpItem.addActionListener(this);
        
        //add components to frame
        buttonPanel.add(inputButton);
        buttonPanel.add(exitButton);
        
        //adding components to menu
        helpMenu.add(helpItem);
        
        mainBar.add(helpMenu);
        this.setJMenuBar(mainBar);
        
        //add Panel
        this.add(buttonPanel, BorderLayout.NORTH);
        this.add(picLabel, BorderLayout.CENTER); 
        
        this.setVisible(true); // sets frame visible
        
    }
    public static void main(String[] args)
    {
        Welcome objectWelcome = new Welcome("Probability"); //defines frame
    }

    
    //actions for buttons 
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        String command = e.getActionCommand();
        
       
        if (command.equals("Calculate"))
        {
            Input objectInput = new Input(); //opens input frame if calculate is clicked
            this.dispose();
        }
        if (command.equals("Exit"))
        {
            this.dispose(); // disposes frame
        }
        if(command.equals("Help"))
        {
            Help objectHelp = new Help("Help"); //opens help frame if help is clicked
        }
    }
}

