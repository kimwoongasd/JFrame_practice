package exam17;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class MyFrame extends JFrame {
	JTextField jtf_weight; // 몸무게
	JTextField jtf_height; // 키
	JButton btn; 
	JLabel res; // BMI 결과값
	
	public MyFrame() {
		jtf_weight = new JTextField(10);
		jtf_height = new JTextField(10);
		
		btn = new JButton("BMI 확인하기");
		
		res = new JLabel();
		
		// JPanel 기본은 FlowLayout
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JPanel p3 = new JPanel();
		JPanel p4 = new JPanel();
		
		p1.add(new JLabel("나의 BMI 지수는 얼마나 될까?"));
		p2.add(new JLabel("나의 체중(kg)"));
		p2.add(jtf_weight);
		p3.add(new JLabel("나의 키(cm)"));
		p3.add(jtf_height);
		p4.add(btn);
		p4.add(res);
		
		setLayout(new GridLayout(4, 1));
		add(p1);
		add(p2);
		add(p3);
		add(p4);
		
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// BMI 계산
				double h = Double.parseDouble(jtf_height.getText());
				double w = Double.parseDouble(jtf_weight.getText());
				double bmi = w / ((h * h) / 10000);
				res.setText("BMI 수치 : " + bmi);

			}
		});
		
		setSize(400, 200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

public class BMITest {

	public static void main(String[] args) {
		new MyFrame();
	}

}
