package exam13;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

class MyFrame extends JFrame {
	public MyFrame() {
		setLayout(new BorderLayout());
		add(new JButton("위쪽"), BorderLayout.NORTH);
		add(new JButton("가운데"), BorderLayout.CENTER);
//		add(new JButton("오른쪽"), BorderLayout.EAST);
//		add(new JButton("왼쪽"), BorderLayout.WEST);
//		add(new JButton("아래"), BorderLayout.SOUTH);
		
		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

public class BorderLayoutTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyFrame();
	}

}
