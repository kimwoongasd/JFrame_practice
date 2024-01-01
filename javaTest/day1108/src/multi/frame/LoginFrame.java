package multi.frame;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class LoginFrame extends JFrame {
	JTextField jtf_name;
	public LoginFrame() {
		
		setLayout(new FlowLayout());
		jtf_name = new JTextField(10);
		JButton btn = new JButton("확인");
		
		add(jtf_name);
		add(btn);
		
		// 확인 버튼을 누르면 입력한 값이 MainFrame에 넘어가고 
		// MainFrame창을 띄운다
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// MainFrame 생성자에 라벨에 넣을 이름을 추가해 객체를 생성
				new MainFrame(jtf_name.getText());
				// LoginFrame를 닫는다
				setVisible(false);
			}
		});
		
		setSize(200, 150);
		setVisible(true);
		
	}
}
