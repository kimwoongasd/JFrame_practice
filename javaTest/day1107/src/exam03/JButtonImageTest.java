package exam03;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

class MyFrame extends JFrame {
	JButton btn;
	ImageIcon img;
	public MyFrame() {
		img = new ImageIcon("apple.gif");
		btn = new JButton(img);
		
		btn.setRolloverIcon(new ImageIcon("banana.gif"));
		btn.setPressedIcon(new ImageIcon("grape.gif"));
		


		setLayout(new FlowLayout());
		add(btn);

		
		setSize(800, 500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

public class JButtonImageTest {

	public static void main(String[] args) {
		new MyFrame();
	}

}
