package exam06;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


//Add버튼이 눌러졌을때 이벤트 처리 담당 클래스
class AddEvent implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Add가 눌러짐");
	}
	
}

//Clear버튼이 눌러졌을때 이벤트 처리 담당 클래스
class ClearEvent implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Clear가 눌러짐");
	}
	
}



// 이벤트를 모아둔 클래스 java.awt.event
// ActionListener --> 인터페이스, 버튼이 눌러졌을떄 기능추가
// 추상이기 때문에 오버라이딩 해야한다
class AddFrame extends JFrame{
	
	JTextField jtf01;
	JTextField jtf02;
	JTextField jtf03;
	
	JButton btnAdd;
	JButton btnClear;

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
		// this 자리는 이벤트 처리 담당 객체 -- 인터페이스 ActionListener를 구현한 객체
				
		btnAdd.addActionListener(new AddEvent());
		btnClear.addActionListener(new ClearEvent());
		
	}
}

public class AddTest {
	public static void main(String[] agrs) {
	
		new AddFrame();
	}
}
