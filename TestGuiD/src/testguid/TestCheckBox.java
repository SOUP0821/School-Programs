/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testguid;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author Saurya21
 */
public class TestCheckBox extends JFrame implements ActionListener
{

  private JCheckBox pineappleBox;
  private JCheckBox pepperoniBox;
  private JCheckBox chillisBox;

  private JRadioButton sauceButton;
  private JRadioButton noSauceButton;
  private ButtonGroup sauceGroup;

  private JButton orderButton;
  private JPanel orderPanel;
  private JLabel orderLabel;

  public TestCheckBox()
  {
    super("Pizza Order Form");
    this.setBounds(100, 100, 500, 300);
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    this.getContentPane().setBackground(Color.RED);
    this.setLayout(new BorderLayout());
// constructing checkboxes
    this.pineappleBox = new JCheckBox("Pineapple");
    this.pepperoniBox = new JCheckBox("Pepperoni");
    this.chillisBox = new JCheckBox("Chillies");
// constructing radio buttons
    this.sauceButton = new JRadioButton("Sauce");
    this.noSauceButton = new JRadioButton("No Sauce");
    this.sauceGroup = new ButtonGroup();
    sauceGroup.add(sauceButton);
    sauceGroup.add(noSauceButton);
// constructing Button
    this.orderButton = new JButton("Order");
    orderButton.addActionListener(this);
// constructing label
    this.orderLabel = new JLabel("");
// constructing panel
    this.orderPanel = new JPanel(new FlowLayout());
    orderPanel.setBackground(Color.ORANGE);
    orderPanel.add(pineappleBox);
    orderPanel.add(pepperoniBox);
    orderPanel.add(chillisBox);
    orderPanel.add(sauceButton);
    orderPanel.add(noSauceButton);
    orderPanel.add(orderButton);
    this.add(orderPanel, BorderLayout.CENTER);
    this.setVisible(true);
  }

  public static void main(String[] args)
  {
    new TestCheckBox();
  }

  @Override
  public void actionPerformed(ActionEvent e)
  {
    String command = e.getActionCommand();
    String order = "The order is:";

    if (command.equals("Order"))
    {
      if (pineappleBox.isSelected())
      {
        order = order + " Pineapple";
      }
      if (pepperoniBox.isSelected())
      {
        order = order + " Pepperoni";
      }
      if (chillisBox.isSelected())
      {
        order = order + " Chillis";
      }
      if (sauceButton.isSelected())
      {
        order = order + " With Sauce";
      }
      else if (noSauceButton.isSelected())
      {
        order = order + " With No Sauce";
      }
      orderLabel.setText(order);
      this.add(orderLabel, BorderLayout.NORTH);

      this.validate();
      this.repaint();
    }
  }
}
