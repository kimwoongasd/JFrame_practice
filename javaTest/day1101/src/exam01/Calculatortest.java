package exam01;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

class MyFrame extends JFrame {
	JButton btn1;
	JButton btn2;
	JButton btn3;
	JButton btn4;
	JButton btn5;
	JButton btn6;
	JButton btn7;
	JButton btn8;
	JButton btn9;
	JButton btnCE;
	JButton btnC;
	JButton btnEqual;
	JButton btnPlus;
	JButton btnDiv;
	JButton btnMulti;
	JButton btnSub;
	
	JTextField num;
	
		
	public MyFrame() {
		btn1 = new JButton("1");
		btn2 = new JButton("2");
		btn3 = new JButton("3");
		btn4 = new JButton("4");
		btn5 = new JButton("5");
		btn6 = new JButton("6");
		btn7 = new JButton("7");
		btn8 = new JButton("8");
		btn9 = new JButton("9");
		btnDiv = new JButton("/");
		btnMulti = new JButton("x");
		btnSub = new JButton("-");
		btnCE = new JButton("CE");
		btnC = new JButton("C");
		btnEqual = new JButton("=");
		btnPlus = new JButton("+");
		
		num = new JTextField(30);
		num.setSize(200, 200);
		Font font = new Font("궁서체", 1, 40);
		
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JPanel p3 = new JPanel();
		JPanel p4 = new JPanel();
		JPanel p5 = new JPanel();
		
		p1.add(num);
		p1.setFont(font);
		
		p2.setLayout(new GridLayout(1, 4, 5, 5));
		p2.add(btn1);
		p2.add(btn2);
		p2.add(btn3);
		p2.add(btnDiv);
		
		p3.setLayout(new GridLayout(1, 4, 5, 5));
		p3.add(btn4);
		p3.add(btn5);
		p3.add(btn6);
		p3.add(btnMulti);
		
		p4.setLayout(new GridLayout(1, 4, 5, 5));
		p4.add(btn7);
		p4.add(btn8);
		p4.add(btn9);
		p4.add(btnSub);
		
		p5.setLayout(new GridLayout(1, 4, 5, 5));
		p5.add(btnCE);
		p5.add(btnC);
		p5.add(btnEqual);
		p5.add(btnPlus);
		
		setLayout(new GridLayout(5, 1, 5, 5));
		
		add(p1);
		add(p2);
		add(p3);
		add(p4);
		add(p5);
		
		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}


public class Calculatortest {

	public static void main(String[] args) {
		new MyFrame();
	}

}
