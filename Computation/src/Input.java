
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Saurya21
 */
public class Input extends JFrame implements ActionListener
{
    private JPanel inputPanel;
    private JPanel buttonPanel;
    private JLabel num1Label;
    private JTextField num1TextField;
    private JLabel num2Label;
    private JTextField num2TextField;
    
    private JButton calculateButton;
    
    public Input(String name)
    {
        //constructs frame
        super(name);
        this.setBounds(100, 200, 900, 300);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setLayout(new BorderLayout());
        this.getContentPane().setBackground(Color.DARK_GRAY);
        
        this.calculateButton = new JButton("read");
        calculateButton.addActionListener(this);
       
        this.inputPanel = new JPanel(new BorderLayout());
        inputPanel.setBackground(Color.RED);
        this.buttonPanel = new JPanel(new FlowLayout());
        buttonPanel.setBackground(Color.BLUE);
        this.num1TextField = new JTextField(3);
        this.num1Label = new JLabel("Number is : ");
        this.num2TextField = new JTextField(3);
        this.num2Label = new JLabel("Second Number is : ");
        
        inputPanel.add(num1Label);
        inputPanel.add(num1TextField);
        inputPanel.add(num2Label);
        inputPanel.add(num2TextField);
        
        buttonPanel.add(calculateButton);
        
        this.add(inputPanel,BorderLayout.NORTH);
        this.add(buttonPanel, BorderLayout.SOUTH); 
        
        this.setVisible(true);
    }

    public static void main(String[] args)
    {
        Input objectInput = new Input("Input Frame");
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
         String command = e.getActionCommand();
         int num1;
         int num2;
         int result;
         
         if (command.equals("read"))
         {
             try
             {
             num1 = Integer.parseInt(num1TextField.getText());
             num2 = Integer.parseInt(num2TextField.getText());
             
             Addition objectAdd = new Addition(num1, num2);
             objectAdd.setResult();
             result = objectAdd.getResult();
             
             num1TextField.setText("");
             
             Output objectOut = new Output("Output", result);
         }
         catch(NumberFormatException nfo)
         {
             Warning warningObject = new Warning("Enter a number");
         }
             }
         }
    }
    
