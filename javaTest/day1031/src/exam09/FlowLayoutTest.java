package exam09;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

class MyFrame  extends JFrame {
	
	public MyFrame() {
		setLayout(new FlowLayout());
		
		for (int i = 0; i < 15; i++) {
			add(new JButton("버튼" + (i + 1)));
		}
		
		setSize(400, 300);
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

public class FlowLayoutTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyFrame();
	}

}
