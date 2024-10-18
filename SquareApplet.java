/* Aim : WAP to find square of a given number using applet.
* Name : SAGARIKA SRIVASTAVA
*  UIN : 231P047
*ROLLno: 44
*  Div : A
*/

package Experiments_applet;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SquareApplet extends JApplet implements ActionListener 
{
	private Label label;
	private TextField inputField;
	private Button squareButton;
	private String result = "";
@Override
	public void init() 
    {
	setLayout(new FlowLayout());
	label = new Label("Enter a number: ");
	add(label);
	inputField = new TextField(10);
	add(inputField);
	squareButton = new Button("Find Square");
	add(squareButton);
	squareButton.addActionListener(this);
    }
@Override
	public void actionPerformed(ActionEvent e) 
	{
	try 
	  {
		int number = Integer.parseInt(inputField.getText());
		int square = number * number;
		result = "Square of " + number + " is " + square;
	  } 
	catch (NumberFormatException ex) 
	{
		result = "Please enter a valid number.";
	}
	repaint();
	}
@Override
	public void paint(Graphics g) 
	{
		g.drawString(result, 50, 150);
	}
	public static void main(String[] args) 
	{
		JFrame frame = new JFrame("Square Applet");
		SquareApplet applet = new SquareApplet();
		applet.init();
		applet.start();

		frame.add(applet);
		frame.setSize(400, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}