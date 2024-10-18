/*
* Aim : WAP implement calculator using Action listener.
* Name: SAGARIKA SRIVASTAVA
* Roll No:44
* UIN : 231P047
* Div : A
*/
package Experiments_applet;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator implements ActionListener 
{
	JFrame frame;
	JTextField display;
	JButton[] numberButtons;
	JButton addButton, subButton, mulButton, divButton, equButton, delButton, clrButton;
	JPanel panel;
	double num1 = 0, num2 = 0, result = 0;
	char operator;
	public Calculator() 
	{
		frame = new JFrame("Calculator");
		frame.setSize(400, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);

		display = new JTextField();
		display.setBounds(50, 25, 300, 50);
		display.setFont(new Font("Arial", Font.BOLD, 24));
		display.setBackground(Color.LIGHT_GRAY);
		display.setEditable(false);
		
		frame.add(display);

		numberButtons = new JButton[10];
		for (int i = 0; i < 10; i++) 
		{
			numberButtons[i] = new JButton(String.valueOf(i));
			numberButtons[i].setFont(new Font("Arial", Font.BOLD, 24));
			numberButtons[i].addActionListener(this);
		}

		addButton = new JButton("+");
		subButton = new JButton("-");
		mulButton = new JButton("*");
		divButton = new JButton("/");
		equButton = new JButton("=");
		delButton = new JButton("Delete");
		clrButton = new JButton("Clear");

		addButton.setFont(new Font("Arial", Font.BOLD, 24));
		subButton.setFont(new Font("Arial", Font.BOLD, 24));
		mulButton.setFont(new Font("Arial", Font.BOLD, 24));
		divButton.setFont(new Font("Arial", Font.BOLD, 24));
		equButton.setFont(new Font("Arial", Font.BOLD, 24));
		delButton.setFont(new Font("Arial", Font.BOLD, 24));
		clrButton.setFont(new Font("Arial", Font.BOLD, 24));

		addButton.addActionListener(this);
		subButton.addActionListener(this);
		mulButton.addActionListener(this);
		divButton.addActionListener(this);
		equButton.addActionListener(this);
		delButton.addActionListener(this);
		clrButton.addActionListener(this);

		panel = new JPanel();
		panel.setBounds(50, 100, 300, 400);
		panel.setLayout(new GridLayout(4, 4, 10, 10));
		panel.add(numberButtons[1]);
		panel.add(numberButtons[2]);
		panel.add(numberButtons[3]);
		panel.add(addButton);
		panel.add(numberButtons[4]);
		panel.add(numberButtons[5]);
		panel.add(numberButtons[6]);
		panel.add(subButton);
		panel.add(numberButtons[7]);
		panel.add(numberButtons[8]);
		panel.add(numberButtons[9]);
		panel.add(mulButton);
		panel.add(clrButton);
		panel.add(numberButtons[0]);
		panel.add(delButton);
		panel.add(equButton);
		panel.add(divButton);
		
		frame.add(panel);
		frame.setVisible(true);
	}
public void actionPerformed(ActionEvent e) 
	{
		for (int i = 0; i < 10; i++) 
		{
			if (e.getSource() == numberButtons[i]) 
			{
				display.setText(display.getText().concat(String.valueOf(i)));
			}
		}
		if (e.getSource() == addButton)
		{
			if (!display.getText().isEmpty()) 
			{
				num1 = Double.parseDouble(display.getText());
				operator = '+';
				display.setText("");
			}
		}
		if (e.getSource() == subButton) 
		{
			if (!display.getText().isEmpty())
			{
				num1 = Double.parseDouble(display.getText());
				operator = '-';
				display.setText("");
			}
		}
		if (e.getSource() == mulButton)
		{
			if (!display.getText().isEmpty()) 
			{
				num1 = Double.parseDouble(display.getText());
				operator = '*';
				display.setText("");
			}
		}
		if (e.getSource() == divButton)
		{
			if (!display.getText().isEmpty()) 
			{
				num1 = Double.parseDouble(display.getText());
				operator = '/';
				display.setText("");
			}
		}
		if (e.getSource() == equButton)
		{
			if (!display.getText().isEmpty()) 
			{
				num2 = Double.parseDouble(display.getText());
				switch (operator) 
				{
				case '+':
							result = num1 + num2;
							break;
				case '-':
							result = num1 - num2;
							break;
				case '*':
							result = num1 * num2;
							break;
				case '/':
							if (num2 != 0)
							{
								result = num1 / num2;
							} 
							else
							{
								display.setText("Error");
								return;
							}
							break;
				}
				display.setText(String.valueOf(result));
				num1 = result;
			}
		}
		if (e.getSource() == delButton)
		{
			String str = display.getText();
			display.setText(str.length() > 0 ? str.substring(0, str.length() - 1) : "");
		}
		if (e.getSource() == clrButton)
		{
			display.setText("");
			num1 = num2 = result = 0;
		}
	}
public static void main(String[] args) 
 {
	new Calculator();
 }
}