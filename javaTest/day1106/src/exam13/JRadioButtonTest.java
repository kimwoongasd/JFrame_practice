package exam13;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

class MyFrame extends JFrame {
	JRadioButton jrb01;
	JRadioButton jrb02;
	JLabel jlb;
	ButtonGroup bg;
	
	public MyFrame() {
		// 버튼 그룹 생성
		bg = new ButtonGroup();
		jrb01 = new JRadioButton("사과");
		jrb02 = new JRadioButton("포도");
		// 라디오버튼은 하나 선택되면 다른게 선택되지 않아야하기 떄문에 그룹으로 묶는다
		bg.add(jrb01);
		bg.add(jrb02);
		
		jlb = new JLabel("아무것도 선택안됨");
		setLayout(new FlowLayout());
		
		add(jrb01);
		add(jrb02);
		add(jlb);
		
		jrb01.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jlb.setText(jrb01.getText());
			}
		});
		
		jrb02.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				jlb.setText(jrb02.getText());
			}
		});
		
		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

public class JRadioButtonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyFrame();
	}

}
