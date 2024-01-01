package exam03;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

class Account extends JFrame implements ActionListener {
	JTextField jtf_printcipal; // 원금
	JTextField jtf_rate; // 이율
	JTextField jtf_interest; 
	
	JButton btn;
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		int a = Integer.parseInt(jtf_printcipal.getText());
		int b = Integer.parseInt(jtf_rate.getText());
		int pay = a * b / 100;
		jtf_interest.setText("이자는 연 " + pay + "만원 입니다"); 
		
	}

	public Account() {
		jtf_printcipal = new JTextField(10);
		jtf_rate = new JTextField(10);
		jtf_interest = new JTextField(20);
		
		btn = new JButton("변환");
		
		setLayout(new FlowLayout());
		add(new JLabel("원금을 입력하시오"));
		add(jtf_printcipal);
		add(new JLabel("이율을 입력하시오"));
		add(jtf_rate);
		add(btn);
		add(jtf_interest);
		
		setSize(600, 200);
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// 버튼에 이벤트 등록
		// 인터페이스 ActionListener를 구형한 객체
		btn.addActionListener(this);
	}
}

public class PayTest {

	public static void main(String[] args) {
		new Account();

	}

}
