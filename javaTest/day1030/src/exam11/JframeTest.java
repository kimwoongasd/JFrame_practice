package exam11;

import java.awt.Button;
import java.awt.FlowLayout;

import javax.swing.JFrame;

public class JframeTest {

	public static void main(String[] args) {
		JFrame jf = new JFrame("자바");
		jf.setLayout(new FlowLayout());
		Button btn = new Button("ok");
		Button btn2 = new Button("cancle");
		

		jf.add(btn);
		jf.add(btn2);
		jf.setSize(500, 400);
		jf.setVisible(true);
	}

}
