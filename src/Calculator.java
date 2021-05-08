import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Calculator {
	public Calculator() {
		
		//Frame:
		JFrame jf=new JFrame("Calculator");
		jf.setLayout(null);
		jf.setSize(600,500);
		jf.setVisible(true);
		jf.setLocation(300,150);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Label:
		JLabel displayLabel=new JLabel("ON  ");
		displayLabel.setBounds(30, 50, 540, 40);
		displayLabel.setBackground(Color.LIGHT_GRAY);
		displayLabel.setOpaque(true);
		displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		displayLabel.setForeground(Color.WHITE);
		displayLabel.setFont(new Font("Montserrat", Font.BOLD, 24));
		jf.add(displayLabel);
		

		
		
		
		
	}
	
	public static void main(String[] args) {
		new Calculator();
		
	}
	
}
