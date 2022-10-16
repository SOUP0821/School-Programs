
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
public class Info extends JFrame implements ActionListener
{
    private JLabel prob1Label;
    private JTextField prob1Field;
    private JTextField prob2Field;
    private JLabel prob2Label;
    private JPanel infoPanel;
    
    private JLabel outputLabel;
    private JButton readButton;
    
    public Info(String name)
    {
        //construct frame
        super("Probability");
        this.setBounds(400, 400, 300, 300);
        this.setLayout(new BorderLayout());
        //this.getContentPane().setBackground(Color.RED);
        //this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
        //construct Labels
        this.prob1Label = new JLabel("A|B : ");
        this.prob2Label = new JLabel("Probability : ");
        
        //construct textfields
        this.prob1Field = new JTextField(5);
        this.prob2Field = new JTextField(5);
        
        //construct button
        this.readButton = new JButton("Read!");
        readButton.addActionListener(this);
        
        //construct Panel
        this.infoPanel = new JPanel(new FlowLayout());
        infoPanel.setBackground(Color.DARK_GRAY);
        
        //place the components on info Panel
        infoPanel.add(prob1Label);
        infoPanel.add(prob1Field);
        infoPanel.add(prob1Label);
        infoPanel.add(prob2Field);
        infoPanel.add(readButton);
        
        //add Panel to Frame
        this.add(infoPanel, BorderLayout.CENTER);
        this.add(outputLabel, BorderLayout.SOUTH);
        
        
        //add button
        //this.readButton = new JButton("change");
        
        
        this.setVisible(true);
    }
public static void main(String[] args)
    {
        Info objectInfo2 = new Info("Probability");
    }
    
    //@Override
    public void actionPerformed(ActionEvent e)
    {
        String command = e.getActionCommand();
        
        int probSide;
        int aIntersectB;
        String message;
        
        if(command.equals("Read!"))
        {
            probSide = Integer.parseInt(prob1Field.getText());
            aIntersectB = Integer.parseInt(prob2Field.getText());
            
            // System.out.println("Name entered is : " + name
            //                            + "age is : " 
            //                            + "course is : ");
            message = " probability is  : " + probSide/aIntersectB;
            outputLabel.setText(message);
        }
        this.validate();
        this.repaint();
    }
}
