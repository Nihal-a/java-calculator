import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Calculator implements ActionListener {

	JFrame jf;
	JLabel displayLabel;
	JButton sevenButton;
	JButton eightButton;
	JButton nineButton;
	JButton fourButton;
	JButton fiveButton;
	JButton sixButton;
	JButton oneButton;
	JButton twoButton;
	JButton threeButton;
	JButton dotButton;
	JButton zeroButton;
	JButton equalButton;
	JButton divisionButton;
	JButton multiplyButton;
	JButton subtractButton;
	JButton additonButton;

	public Calculator() {

		// Frame:
		jf = new JFrame("Calculator");
		jf.setLayout(null);
		jf.setSize(440, 580);
		jf.setVisible(true);
		jf.setLocation(300, 150);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Label:
		displayLabel = new JLabel();
		displayLabel.setBorder(new EmptyBorder(0, 0, 0, 20));
		displayLabel.setBounds(30, 30, 380, 60);
		displayLabel.setBackground(Color.LIGHT_GRAY);
		displayLabel.setOpaque(true);
		displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		displayLabel.setForeground(Color.WHITE);
		displayLabel.setFont(new Font("Montserrat", Font.BOLD, 24));
		jf.add(displayLabel);

		// Buttons

		// Row 1
		sevenButton = new JButton("7");
		sevenButton.setBounds(30, 120, 80, 80);
		sevenButton.setFont(new Font("Montserrat", Font.PLAIN, 24));
		sevenButton.addActionListener(this);
		jf.add(sevenButton);

		eightButton = new JButton("8");
		eightButton.setBounds(130, 120, 80, 80);
		eightButton.setFont(new Font("Montserrat", Font.PLAIN, 24));
		eightButton.addActionListener(this);
		jf.add(eightButton);

		nineButton = new JButton("9");
		nineButton.setBounds(230, 120, 80, 80);
		nineButton.setFont(new Font("Montserrat", Font.PLAIN, 24));
		nineButton.addActionListener(this);
		jf.add(nineButton);

		// Row 2

		fourButton = new JButton("4");
		fourButton.setBounds(30, 230, 80, 80);
		fourButton.setFont(new Font("Montserrat", Font.PLAIN, 24));
		fourButton.addActionListener(this);
		jf.add(fourButton);

		fiveButton = new JButton("5");
		fiveButton.setBounds(130, 230, 80, 80);
		fiveButton.setFont(new Font("Montserrat", Font.PLAIN, 24));
		fiveButton.addActionListener(this);
		jf.add(fiveButton);

		sixButton = new JButton("6");
		sixButton.setBounds(230, 230, 80, 80);
		sixButton.setFont(new Font("Montserrat", Font.PLAIN, 24));
		sixButton.addActionListener(this);
		jf.add(sixButton);
		// Row 3
		oneButton = new JButton("1");
		oneButton.setBounds(30, 340, 80, 80);
		oneButton.setFont(new Font("Montserrat", Font.PLAIN, 24));
		oneButton.addActionListener(this);
		jf.add(oneButton);

		twoButton = new JButton("2");
		twoButton.setBounds(130, 340, 80, 80);
		twoButton.setFont(new Font("Montserrat", Font.PLAIN, 24));
		twoButton.addActionListener(this);
		jf.add(twoButton);

		threeButton = new JButton("3");
		threeButton.setBounds(230, 340, 80, 80);
		threeButton.setFont(new Font("Montserrat", Font.PLAIN, 24));
		threeButton.addActionListener(this);
		jf.add(threeButton);

		// Row 4
		dotButton = new JButton(".");
		dotButton.setBounds(30, 450, 80, 80);
		dotButton.setFont(new Font("Montserrat", Font.BOLD, 24));
		dotButton.addActionListener(this);
		jf.add(dotButton);

		zeroButton = new JButton("0");
		zeroButton.setBounds(130, 450, 80, 80);
		zeroButton.setFont(new Font("Montserrat", Font.PLAIN, 24));
		zeroButton.addActionListener(this);
		jf.add(zeroButton);

		equalButton = new JButton("=");
		equalButton.setBounds(230, 450, 80, 80);
		equalButton.setFont(new Font("Montserrat", Font.BOLD, 24));
		equalButton.addActionListener(this);
		jf.add(equalButton);
		// Operators
		divisionButton = new JButton("/");
		divisionButton.setBounds(330, 120, 80, 80);
		divisionButton.setFont(new Font("Montserrat", Font.BOLD, 24));
		divisionButton.addActionListener(this);
		jf.add(divisionButton);

		multiplyButton = new JButton("x");
		multiplyButton.setBounds(330, 230, 80, 80);
		multiplyButton.setFont(new Font("Montserrat", Font.BOLD, 24));
		multiplyButton.addActionListener(this);
		jf.add(multiplyButton);

		subtractButton = new JButton("-");
		subtractButton.setBounds(330, 340, 80, 80);
		subtractButton.setFont(new Font("Montserrat", Font.BOLD, 24));
		subtractButton.addActionListener(this);
		jf.add(subtractButton);

		additonButton = new JButton("+");
		additonButton.setBounds(330, 450, 80, 80);
		additonButton.setFont(new Font("Montserrat", Font.BOLD, 24));
		additonButton.addActionListener(this);
		jf.add(additonButton);

	}

	public static void main(String[] args) {
		new Calculator();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == sevenButton) {
			displayLabel.setText(displayLabel.getText()+"7");
		} else if (e.getSource() == eightButton) {
			displayLabel.setText(displayLabel.getText()+"8");
		} else if (e.getSource() == nineButton) {
			displayLabel.setText(displayLabel.getText()+"9");
		} else if (e.getSource() == fourButton) {
			displayLabel.setText(displayLabel.getText()+"4");
		} else if (e.getSource() == fiveButton) {
			displayLabel.setText(displayLabel.getText()+"5");
		} else if (e.getSource() == sixButton) {
			displayLabel.setText(displayLabel.getText()+"6");
		} else if (e.getSource() == oneButton) {
			displayLabel.setText(displayLabel.getText()+"1");
		} else if (e.getSource() == twoButton) {
			displayLabel.setText(displayLabel.getText()+"2");
		} else if (e.getSource() == threeButton) {
			displayLabel.setText(displayLabel.getText()+"3");
		} else if (e.getSource() == threeButton) {
			displayLabel.setText(displayLabel.getText()+"3");
		} else if (e.getSource() == zeroButton) {
			displayLabel.setText(displayLabel.getText()+"0");
		} else if (e.getSource() == dotButton) {

		} else if (e.getSource() == equalButton) {

		} else if (e.getSource() == divisionButton) {

		} else if (e.getSource() == multiplyButton) {

		} else if (e.getSource() == subtractButton) {

		} else if (e.getSource() == additonButton) {

		}
	}

}
