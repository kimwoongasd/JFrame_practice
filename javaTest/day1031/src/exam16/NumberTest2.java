package exam16;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class NumberGame2 extends JFrame {
	JTextField jtf_num;
	JTextField jtf_txt;
	JButton btn_re;
	JButton btn_exit;
	Random r = new Random();
	int com = r.nextInt(100);
	
	public NumberGame2() {
		jtf_num = new JTextField(10);
		jtf_txt = new JTextField(12);
		
		btn_re = new JButton("다시 한번");
		btn_exit = new JButton("종료");
		
		// 기본이 FlowLayout()이다
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JPanel p3 = new JPanel();
		
		p2.add(jtf_txt);
		
		p1.add(new JLabel("숫자를 추측하시오 : "));
		p1.add(jtf_num);
		
		p3.add(btn_re);
		p3.add(btn_exit);
		
		setLayout(new GridLayout(3, 1)); 
		add(p1);
		add(p2);
		add(p3);
		
		jtf_num.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (Integer.parseInt(jtf_num.getText()) < com) {
					jtf_txt.setText(jtf_num.getText() + "는 너무 낮습니다");
					jtf_txt.setBackground(Color.red);
					jtf_txt.setForeground(Color.white);
				} else if (Integer.parseInt(jtf_num.getText()) > com) {
					jtf_txt.setText(jtf_num.getText() + "는 너무 높습니다");
					jtf_txt.setBackground(Color.blue);
					jtf_txt.setForeground(Color.white);
				} else {
					jtf_txt.setText("같습니다");
					jtf_txt.setBackground(Color.orange);
					jtf_txt.setForeground(Color.white);
				}
			}
		});
		
		btn_re.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jtf_num.setText("");
				jtf_txt.setText("");
				jtf_txt.setBackground(Color.white);
			}
		});
		
		btn_exit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		setSize(400, 200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

public class NumberTest2 {

	public static void main(String[] args) {
		new NumberGame2();
	}

}
