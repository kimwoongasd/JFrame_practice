package exam02;

import javax.swing.JFrame;

class MyFrame extends JFrame {
	LinePanel lp;
	
	public MyFrame() {
		lp = new LinePanel();
		add(lp);
		
		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

public class LineTest {

	public static void main(String[] args) {
		new MyFrame(); 
	}

}
