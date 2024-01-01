package exam03;

import javax.swing.JFrame;

class MyFrame extends JFrame {
	RectPanel lp;
	
	public MyFrame() {
		lp = new RectPanel();
		add(lp);
		
		setSize(600, 500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}


public class RectTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyFrame();
	}

}
