/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Airline;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author User
 */
//composite
public class BG extends Welcome{
 // Create one composite
   JMenuItem menu = new JMenu("Composite");
// Add leafs
JMenuItem exit = new JMenuItem("Exit");
JMenuItem next = new JMenuItem("Next");
    }
 //interface   

interface Hello {
  public void first(); // interface method (does not have a body)
  public void second(); // interface method (does not have a body)
}

class Msg implements Hello {
  public void first() {
    System.out.println("Please enter your information ");
  }
  public void second() {
    System.out.println("to continue...");
  }

//    @Override
//    public void animalSound() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

//    @Override
//    public void sleep() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
}

