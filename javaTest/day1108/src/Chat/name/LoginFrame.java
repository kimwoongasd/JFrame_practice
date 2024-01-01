package Chat.name;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;


public class LoginFrame extends JFrame {
	JTextField jtf;
	
	public LoginFrame() {
		jtf = new JTextField(10);
		JButton btn = new JButton("로그인");
		
		setLayout(new FlowLayout());
		add(jtf);
		add(btn);
		
		btn.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				new MyFrame(jtf.getText());
				setVisible(false);
			}
		});
		
		setSize(200, 100);
		setVisible(true);
	}
}
