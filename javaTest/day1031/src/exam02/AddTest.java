package exam02;

import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

// 이벤트를 모아둔 클래스 java.awt.event
// ActionListener --> 인터페이스, 버튼이 눌러졌을떄 기능추가
// 추상이기 때문에 오버라이딩 해야한다
class AddFrame extends JFrame implements ActionListener {
	JTextField jtf01;
	JTextField jtf02;
	
	JButton btn;
	
	@Override
	public void actionPerformed(ActionEvent e) {
		double km = Double.parseDouble(jtf01.getText()) * 1.609344;
		
		jtf02.setText(String.valueOf(km + " km"));
	}

	public AddFrame() {
		jtf01 = new JTextField(10);
		jtf02 = new JTextField(10);
		
		btn = new JButton("변환");
		
		setLayout(new FlowLayout());
		add(new JLabel("마일을 입력하시오"));
		add(jtf01);
		add(new JLabel(">"));
		add(jtf02);
		add(btn);
		
		setSize(500, 200);
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		btn.addActionListener(this);
	}
}

public class AddTest {
	public static void main(String[] agrs) {
		new AddFrame();
	}
}
