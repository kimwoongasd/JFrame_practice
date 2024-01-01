package exam01;

import java.awt.FlowLayout;
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
	JTextField jtf03;
	
	JButton btnAdd;
	JButton btnClear;
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// 눌러진 버튼의 글자를 보여줌
		String cmd = e.getActionCommand();
		System.out.println(cmd + " 버튼이 눌러짐");
		
		if (cmd.equals("Add")) {
			// 텍스트필드에 적힌 글자 가져오기
//			String str2 = jtf02.getText();
			int num1 = Integer.parseInt(jtf01.getText());
			int num2 = Integer.parseInt(jtf02.getText());
			int r = num1 + num2;
			System.out.println(r);
			
			// 텍스트필드에 값 설정'
			String str = String.valueOf(r);
			jtf03.setText(str);
			
		} else {
			jtf01.setText("");
			jtf02.setText("");
			jtf03.setText("");
		}
	}

	public AddFrame() {
		jtf01 = new JTextField(10);
		jtf02 = new JTextField(10);
		jtf03 = new JTextField(10);
		
		btnAdd = new JButton("Add");
		btnClear = new JButton("Clear");
		
		setLayout(new FlowLayout());
		
		add(new JLabel("첫 번째 정수"));
		add(jtf01);
		add(new JLabel("두 번째 정수"));
		add(jtf02);
		add(new JLabel("세 번째 정수"));
		add(jtf03);
		add(btnAdd);
		add(btnClear);
		
		setSize(250, 200);
		setVisible(true);
		
		// 창을 닫을 떄 프로그램 종료
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// this는 자기자신
		// btnAdd.addActionListener(this)
		// - 이 버튼을 눌렀을 떄 실행할 이벤트 객체
		btnAdd.addActionListener(this);
		btnClear.addActionListener(this);
	}
}

public class AddTest {
	public static void main(String[] agrs) {
		new AddFrame();
	}
}
