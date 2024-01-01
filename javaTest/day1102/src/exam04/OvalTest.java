package exam04;

import javax.swing.JFrame;

class MyFrame extends JFrame {
	OvalPanel lp;
	
	public MyFrame() {
		lp = new OvalPanel();
		add(lp);
		
		setSize(600, 500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}


public class OvalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyFrame();
	}

}
