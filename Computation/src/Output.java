package Welcome;


import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
/*
 * Saurya Nannapaneni 02/04/2020 Outputs info
 */
public class Output extends JFrame
{
    private JLabel outputLabel;
    
    public Output(String name, int result)
    {
        //construct frame
        super(name);
        this.setBounds(100, 50, 600, 500);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.getContentPane().setBackground(Color.YELLOW);
        this.setLayout(new BorderLayout());
        
        //construct components
        this.outputLabel = new JLabel("The output is : " + result);
        
        this.add(outputLabel, BorderLayout.CENTER);
        
        this.setVisible(true);
    }
    public static void main(String[] args)
    {
        Output objectOut = new Output("Output", 3);
    }
}