package exam10;

import java.awt.Button;
import java.awt.Frame;

public class FrameTest {

	public static void main(String[] args) {
		Frame f = new Frame("만세");
		Button bt = new Button("ok");
		
		f.add(bt);
		f.setSize(300, 200);
		f.setVisible(true);

	}

}
