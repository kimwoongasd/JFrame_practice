package ecam12;

import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


class BMI extends JFrame {
	public BMI() {
		JTextField jtf01 = new JTextField(8);
		JTextField jtf02 = new JTextField(8);
		
		JButton btn = new JButton("BMI 확인하기");
		
		setLayout(new FlowLayout());
		add(new JLabel("나의 BMI지누는 얼마나 될까?"));
		add(new JLabel("나의 체중(kg):"));
		add(jtf01);
		add(new JLabel("나의 키(m)"));
		add(jtf02);
		
		add(btn);
		
		setSize(500, 400);
		setVisible(true);
	}
}

public class JFrameTest {
	public static void main(String[] args) {
		new BMI();
	}
}
