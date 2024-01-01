package exam08;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

class Click extends JFrame{
	JButton btn;
	JButton reset;
	JLabel cnt;
	int n = 0;
	
	public Click() {
		btn = new JButton("버튼을 눌러보세요");
		cnt = new JLabel("0");
		reset = new JButton("리셋");
		
		setLayout(new FlowLayout());
		add(btn);
		add(new JLabel("클릭 횟수 : "));
		add(cnt);
		add(reset);
		
		setSize(200, 100);
		setVisible(true);
		
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				n++;
				cnt.setText(String.valueOf(n));
				
			}
		});
		
		reset.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				n = 0;
				cnt.setText("0");
			}
		});
		
	}
}

public class ClickTest {

	public static void main(String[] args) {
		new Click();
	}

}
