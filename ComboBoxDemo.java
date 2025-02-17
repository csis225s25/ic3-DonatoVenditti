/**
*  @version Spring 2010 
*/

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

class ComboBoxDemo extends JFrame implements ItemListener {

// frame
static JFrame frame;

// label
static JLabel label, label1;

// combobox
static JComboBox cBox1;

// main class
public static void main(String[] args)
{
// create a new frame
frame = new JFrame("Combo Box Demo");

// tell the JFrame that when someone closes the
// window, the application should terminate
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		

// create a object
ComboBoxDemo s = new ComboBoxDemo();
