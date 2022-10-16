/*
Saurya Nannapaneni 1/29/2020
creating input frame with components
Lets the user choose their problem and input numbers in their equation
 */
package cpprobability;

//imports
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import static java.lang.Integer.parseInt;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Saurya21
 */
public class Input extends JFrame implements ActionListener, ItemListener //adds action and item listener
{
// declaring variables
    private String[] probArray =
    {
        "Permutation", "Combination"
    };
    private JComboBox<String> probBox;
    private JPanel infoPanel;
    private JLabel inSetLabel;
    private JTextField inSetField;
    private JLabel outSetLabel;
    private JTextField outSetField;
    private JLabel selectSetLabel;
    private JTextField selectSetField;
    private JButton calculateButton;
    private JButton calculateButton2;
    private JButton returnButton;
    private JButton exitButton;
   private JButton homeButton;
   private JButton helpButton;
    private JLabel outputLabel;
    private JLabel imageLabel;
    private final URL DON = getClass().getResource("deepfried.png");
    private final ImageIcon DEEP_IMAGE = new ImageIcon(new ImageIcon(DON).getImage().
           getScaledInstance(200, 200, Image.SCALE_DEFAULT)); //adds image
    public static final Font SMALL_FONT = new Font("Times New Roman",Font.BOLD|Font.ITALIC, 12); //adds font

    public Input()
    {
        //construct frame
        super("Input");
        this.setBounds(100, 200, 1000, 300);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setLayout(new BorderLayout());
        this.getContentPane().setBackground(Welcome.BACK_COLOR);

        //constructing buttons
        this.calculateButton = new JButton("Calculate");
        calculateButton.addActionListener(this);
        this.returnButton = new JButton("Return");
        returnButton.addActionListener(this);
        this.calculateButton2 = new JButton("Calculate ");
        calculateButton2.addActionListener(this);
        this.helpButton = new JButton("Help");
        helpButton.addActionListener(this);
        this.exitButton = new JButton("Exit");
        exitButton.addActionListener(this);
        this.homeButton = new JButton("Home");
        homeButton.addActionListener(this);

        // constructing Label
        this.outputLabel = new JLabel("Equation is : ");
        outputLabel.setBackground(Welcome.BACK_COLOR);
        outputLabel.setFont(Welcome.BIG_FONT);

        //creating components
        probBox = new JComboBox<>(probArray);
        //add Item Listener to color box
        probBox.addItemListener(this);

        //declaring image label
        imageLabel = new JLabel(DEEP_IMAGE);
    
        //construct Panel
        this.infoPanel = new JPanel(new FlowLayout());
        infoPanel.setBackground(Welcome.BACK_COLOR);
        this.inSetField = new JTextField(7);
        this.inSetLabel = new JLabel("Number in set : ");
        this.inSetLabel.setFont(SMALL_FONT);
        this.outSetField = new JTextField(7);
        this.outSetLabel = new JLabel("Number out of set : ");
        this.outSetLabel.setFont(SMALL_FONT);
        this.selectSetField = new JTextField(7);
        this.selectSetLabel = new JLabel("Number selected from set : ");
        this.selectSetLabel.setFont(SMALL_FONT);

        //add components to panel
        infoPanel.add(inSetLabel);
        infoPanel.add(inSetField);
        infoPanel.add(outSetLabel);
        infoPanel.add(outSetField);
        infoPanel.add(calculateButton);
        infoPanel.add(probBox);
        infoPanel.add(helpButton);
        infoPanel.add(homeButton);
        infoPanel.add(returnButton);
        infoPanel.add(exitButton);

        //add Panel
        this.add(infoPanel, BorderLayout.NORTH);
        this.add(outputLabel, BorderLayout.SOUTH);
        this.add(imageLabel, BorderLayout.CENTER);

        this.setVisible(true);

    }

    public static void main(String[] args)
    {
        Input objectInput = new Input();
    }

    //actions for buttons
    @Override
    public void actionPerformed(ActionEvent e)
    {
        String command = e.getActionCommand();
        String numberIn;
        String numberOut;
        String numberSelect;
        String message;
        int num1;
        int num2;
        int result;

        if (command.equals("Calculate")) // if they click calculate
        {
            try
            {
            //declare variables
            numberIn = inSetField.getText();
            numberOut = outSetField.getText();
            num1 = parseInt(inSetField.getText());
            num2 = parseInt(outSetField.getText());

            //define message
            message = "P(" + numberIn + "," + numberOut + ") = " + "" + numberIn + "!/(" + numberIn + "−" + numberOut + ")!";
            outputLabel.setText(message);
            
            Permutation objectAdd = new Permutation(num1, num2);
            objectAdd.setResult();
            result = objectAdd.getResult();
                
            Output calculateOutput = new Output("Output", result);
            inSetField.setText("");
            outSetField.setText("");
            }
            catch(NumberFormatException nfe)
            {
                Warning objWarning = new Warning("ENTER A NUMBER!");
            }
        }
        if (command.equals("Calculate ")) //if they click the calculate on combination
        {
            try
            {
            //declare variables
            numberIn = inSetField.getText();
            numberSelect = selectSetField.getText();
            num1 = parseInt(inSetField.getText());
            num2 = parseInt(selectSetField.getText());

            //define message
            message = "C(" + numberIn + "," + numberSelect + ") = " + "" + numberIn + "!/(" + numberIn + "−" + numberSelect + ")!" + numberSelect + "!";
            outputLabel.setText(message);

            Combination objectAdd = new Combination(num1, num2);
            objectAdd.setResult();
            result = objectAdd.getResult();
                
            Output calculateOutput = new Output("Output", result);
            inSetField.setText("");
            selectSetField.setText("");
            }
            catch (NumberFormatException nfe)
            {
                Warning objWarning = new Warning("ENTER A NUMBER!");
            }
        }
        // actions for all navigation buttons
        if (command.equals("Return"))
        {
            this.dispose();
            Welcome objectWelcome = new Welcome("Probability");
        }
        if (command.equals("Exit"))
        {
            this.dispose();
        }
        if (command.equals("Help"))
        {
            Help objectHelp = new Help("Help");
        }
        if (command.equals("Home"))
        {
            Welcome objectWelcome = new Welcome("Probability");
            this.dispose();
        }
    }

    
    //actions for selection box
    @Override
    public void itemStateChanged(ItemEvent e)
    {
        int index = probBox.getSelectedIndex();

        if (index == 0) // if permutation is selected
        {
            // gets rid of objects on frame
            infoPanel.remove(inSetLabel);
            infoPanel.remove(inSetField);
            infoPanel.remove(outSetLabel);
            infoPanel.remove(outSetField);
            infoPanel.remove(calculateButton);
            infoPanel.remove(probBox);
            infoPanel.remove(returnButton);
            infoPanel.remove(selectSetLabel);
            infoPanel.remove(selectSetField);
            infoPanel.remove(calculateButton2);
            infoPanel.remove(exitButton);
            infoPanel.remove(homeButton);
            infoPanel.remove(helpButton);
            
            //adds back whats needed for permutation
            infoPanel.add(inSetLabel);
            infoPanel.add(inSetField);
            infoPanel.add(outSetLabel);
            infoPanel.add(outSetField);
            infoPanel.add(calculateButton);
            infoPanel.add(probBox);
            infoPanel.add(helpButton);
            infoPanel.add(homeButton);
            infoPanel.add(returnButton);
            infoPanel.add(exitButton);

            this.add(infoPanel, BorderLayout.NORTH);

            this.setVisible(true); // makes frame visible
        }
        else if (index == 1) // if combination is selected
        {
            // removes everything from frame
            infoPanel.remove(inSetLabel);
            infoPanel.remove(inSetField);
            infoPanel.remove(outSetLabel);
            infoPanel.remove(outSetField);
            infoPanel.remove(calculateButton);
            infoPanel.remove(probBox);
            infoPanel.remove(returnButton);
            infoPanel.remove(exitButton);
            infoPanel.remove(homeButton);
            infoPanel.remove(helpButton);

            //adds whats neeeded for combination
            infoPanel.add(inSetLabel);
            infoPanel.add(inSetField);
            infoPanel.add(selectSetLabel);
            infoPanel.add(selectSetField);
            infoPanel.add(calculateButton2);
            infoPanel.add(probBox);
            infoPanel.add(helpButton);
            infoPanel.add(homeButton);
            infoPanel.add(returnButton);
            infoPanel.add(exitButton);

            this.add(infoPanel, BorderLayout.NORTH);

            this.setVisible(true); //makes frame visible
        }
        //repaints the frame
        this.validate();
        this.repaint();
    }

}

