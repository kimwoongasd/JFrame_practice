package exam16;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class NumberGame extends JFrame {
	JTextField jtf_num; // 숫자 입력
	JTextField jtf_txt; // 결과
	JButton btn_re; 
	JButton btn_exit;
	Random r = new Random();
	int com = r.nextInt(100);
	
	public NumberGame() {
		jtf_num = new JTextField(10);
		jtf_txt = new JTextField(12);
		
		btn_re = new JButton("다시 한번");
		btn_exit = new JButton("종료");
		
		JPanel p_north = new JPanel();
		JPanel p_center = new JPanel();
		JPanel p_south = new JPanel();
		
		p_north.setLayout(new FlowLayout());
		p_north.add(new JLabel("숫자를 추측하시오 : "));
		p_north.add(jtf_num);
		
		p_center.add(jtf_txt);
		
		p_south.setLayout(new FlowLayout());
		p_south.add(btn_re);
		p_south.add(btn_exit);
		
		setLayout(new BorderLayout()); 
		add(p_north, BorderLayout.NORTH);
		add(p_center, BorderLayout.CENTER);
		add(p_south, BorderLayout.SOUTH);
		
		// txt필드 숫자를 입력하면 결과가 나온다
		jtf_num.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// txt 입력값이 랜덤 숫자보다 작을 경우
				if (Integer.parseInt(jtf_num.getText()) < com) {
					// 텍스트필드 값 설정
					jtf_txt.setText(jtf_num.getText() + "는 너무 낮습니다");
					// 텍스트필드 배경 설정
					jtf_txt.setBackground(Color.red);
					// 텍스트필드 글색 설정
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
		
		// 다시하기 버튼 : 초기화
		btn_re.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jtf_num.setText("");
				jtf_txt.setText("");
				jtf_txt.setBackground(Color.white);
			}
		});
		
		// 프로그램 종료
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

public class NumberTest {

	public static void main(String[] args) {
		new NumberGame();
	}

}
