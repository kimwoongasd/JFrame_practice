package exam11;

import java.awt.Button;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

class AddFrame extends JFrame {
	JTextField jtf01;
	JTextField jtf02;
	JTextField jtf03;
	
	JButton btnAdd;
	JButton btnClear;
	
	public AddFrame() {
		jtf01  = new JTextField(10);
		jtf02  = new JTextField(10);
		jtf03  = new JTextField(10);

		btnAdd = new JButton("Add");
		btnClear = new JButton("Clear");

		setLayout(new FlowLayout());
		add(new JLabel("첫번째 정수"));
		add(jtf01);
		add(new JLabel("두번째 정수"));
		add(jtf02);
		add(new JLabel("세번째 정수"));
		add(jtf03);
		
		add(btnAdd);
		add(btnClear);
		
		setSize(600, 400);
		setVisible(true);
	}
}

public class AddTest {

	public static void main(String[] args) {
		new AddFrame();
	}

}
