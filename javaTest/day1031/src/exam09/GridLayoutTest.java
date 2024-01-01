package exam09;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

class MyFrame2 extends JFrame {
	public MyFrame2() {
		setLayout(new GridLayout(3, 5));
		
		for (int i = 0; i < 15; i++) {
			add(new JButton("버튼" + (i + 1)));
		}
		
		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

public class GridLayoutTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyFrame2();
	}

}
