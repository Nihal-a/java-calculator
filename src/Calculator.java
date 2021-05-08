import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;


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
		displayLabel.setBounds(30, 50, 540, 50);
		displayLabel.setBackground(Color.LIGHT_GRAY);
		displayLabel.setOpaque(true);
		displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		displayLabel.setForeground(Color.WHITE);
		displayLabel.setFont(new Font("Montserrat", Font.BOLD, 24));
		jf.add(displayLabel);
		
		//Buttons
		
		//Row 1
				JButton sevenButton=new JButton("7");
				sevenButton.setBounds(30,120,80,80);
				sevenButton.setFont(new Font("Montserrat", Font.PLAIN, 24));
				jf.add(sevenButton);
				
				JButton eightButton=new JButton("8");
				eightButton.setBounds(130,120,80,80);
				eightButton.setFont(new Font("Montserrat", Font.PLAIN, 24));
				jf.add(eightButton);
				
				JButton nineButton=new JButton("9");
				nineButton.setBounds(230,120,80,80);
				nineButton.setFont(new Font("Montserrat", Font.PLAIN, 24));
				jf.add(nineButton);
		
		//Row 2
				JButton fourButton=new JButton("4");
				fourButton.setBounds(30,230,80,80);
				fourButton.setFont(new Font("Montserrat", Font.PLAIN, 24));
				jf.add(fourButton);
				
				JButton fiveButton=new JButton("5");
				fiveButton.setBounds(130,230,80,80);
				fiveButton.setFont(new Font("Montserrat", Font.PLAIN, 24));
				jf.add(fiveButton);
				
				JButton sixButton=new JButton("6");
				sixButton.setBounds(230,230,80,80);
				sixButton.setFont(new Font("Montserrat", Font.PLAIN, 24));
				jf.add(sixButton);
		//Row 2
				JButton oneButton=new JButton("1");
				oneButton.setBounds(30,340,80,80);
				oneButton.setFont(new Font("Montserrat", Font.PLAIN, 24));
				jf.add(oneButton);
				
				JButton twoButton=new JButton("2");
				twoButton.setBounds(130,340,80,80);
				twoButton.setFont(new Font("Montserrat", Font.PLAIN, 24));
				jf.add(twoButton);
				
				JButton threeButton=new JButton("3");
				threeButton.setBounds(230,340,80,80);
				threeButton.setFont(new Font("Montserrat", Font.PLAIN, 24));
				jf.add(threeButton);
				
				
				
		
		
		

		
		
		
		
	}
	
	public static void main(String[] args) {
		new Calculator();
		
	}
	
}
