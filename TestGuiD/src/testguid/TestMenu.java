/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testguid;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author Saurya21
 */
public class TestMenu extends JFrame implements ActionListener
{

  private JMenuBar mainBar;
  private JMenu navigationMenu;
  private JMenu colorMenu;
  private JMenuItem redItem;
  private JMenuItem greenItem;
  private JMenuItem helpItem;
  private JMenuItem inputItem;

  public TestMenu()
  {
    this.setBounds(100, 100, 400, 400);
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    this.getContentPane().setBackground(Color.RED);
    this.setLayout(new BorderLayout());
// constructing menu bar
    this.mainBar = new JMenuBar();
// consructing menu
    this.navigationMenu = new JMenu("Navigation");
    this.colorMenu = new JMenu("Change Color");
// constructing menu items
    this.redItem = new JMenuItem("Red");
    redItem.addActionListener(this);
    this.greenItem = new JMenuItem("Green");
    greenItem.addActionListener(this);
    this.helpItem = new JMenuItem("Help");
    helpItem.addActionListener(this);
    this.inputItem = new JMenuItem("Input");
    inputItem.addActionListener(this);
// adding items to menu
    mainBar.add(navigationMenu);
    navigationMenu.add(helpItem);
    navigationMenu.add(inputItem);
    navigationMenu.add(colorMenu);
    colorMenu.add(redItem);
    colorMenu.add(greenItem);

    this.setJMenuBar(mainBar);

    this.setVisible(true);
  }

  public static void main(String[] args)
  {
    new TestMenu();
  }

  @Override
  public void actionPerformed(ActionEvent e)
  {
    Object command = e.getSource();
    if (command == redItem)
    {
      this.getContentPane().setBackground(Color.BLUE);
    }
    else if (command == greenItem)
    {
      this.getContentPane().setBackground(Color.YELLOW);
    }
    else if (command == helpItem)
    {
      new Help();
    }
    else if (command == helpItem)
    {
      new Help();
    }
    else if (command == inputItem)
    {
      new Input();
    }
    this.validate();
    this.repaint();
  }
}
