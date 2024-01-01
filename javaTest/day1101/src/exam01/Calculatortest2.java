package exam01;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

// 계산기 만들기

class MyFrame2 extends JFrame {
	JTextField num;
	String operator = null; // 맴버변수
	int prv_num; // 이전 정수
	int next_num; // 다음 정수
	boolean eq = false; // =를 했는지 안했는지
	
		
	public MyFrame2() {
		num = new JTextField(20);
		// 글꼴과 사이즈 조절
		num.setFont(new Font("굴림", Font.BOLD, 20));
		
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(4, 4, 4, 4));
		String[] arr = {"7", "8", "9" , "/", "4", "5", "6",
				"-", "1", "2", "3", "x", "CE", "C", "=", "+"};
		
		// 배열로 버튼만들기
		JButton[] btn = new JButton[arr.length];
		
		for (int i = 0; i < btn.length; i++) {
			btn[i] = new JButton(arr[i]);
			// 글꼴과 사이즈 조절
			btn[i].setFont(new Font("굴림", Font.BOLD, 20));
			p.add(btn[i]);
			
			btn[i].addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					String cmd = e.getActionCommand();


					if (cmd.equals("+") || cmd.equals("-") ||
							cmd.equals("x") || cmd.equals("/")) {
						
						if (operator != null) operator = cmd;
						else {
						operator = cmd;
						prv_num = Integer.parseInt(num.getText());
						num.setText("");
						}
	
					} else if (cmd.equals("=")) {
						int res, next_num = Integer.parseInt(num.getText());
						if (operator.equals("+")) {
							res = prv_num + next_num;
						} else if (operator.equals("-")) {
							res = prv_num - next_num;
						} else if (operator.equals("/")) {
							res = prv_num / next_num;
						} else {
							res = prv_num * next_num;
						}
						
						num.setText(String.valueOf(res));
						operator = null;
						eq = true;
					} else if (cmd.equals("CE")) {
						num.setText("");
					} else if (cmd.equals("C")) {
						prv_num = 0;
						next_num = 0;
						num.setText("");
						operator = null;
						eq = false;
					} else if (Integer.parseInt(cmd) > 0 && Integer.parseInt(cmd) < 10) {						
						if (eq) {
							eq = false;
						}
						num.setText(num.getText() + cmd);
					}
				}
			});
		}
		
		
		setLayout(new BorderLayout());
		add(num, BorderLayout.NORTH);
		add(p, BorderLayout.CENTER);
		
		setSize(300, 200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}


public class Calculatortest2 {

	public static void main(String[] args) {
		new MyFrame2();
	}

}
