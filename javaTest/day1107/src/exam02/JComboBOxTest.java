package exam02;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class MyFrame extends JFrame {
	JComboBox<String> jcb;
	JPanel p;
	public MyFrame() {
		jcb = new JComboBox<String>();
		p = new JPanel();
		jcb.addItem("red");
		jcb.addItem("green");		
		jcb.addItem("yellow");
		jcb.addItem("blue");

		
		jcb.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int idx = jcb.getSelectedIndex();
				
				if (idx == 0) {
					p.setBackground(Color.red);
				} else if (idx == 1) {
					p.setBackground(Color.green);
				} else if (idx == 2) {
					p.setBackground(Color.yellow);
				} else if (idx == 3) {
					p.setBackground(Color.blue);
				}
			}
		});
		
		setLayout(new BorderLayout());
		add(jcb, BorderLayout.NORTH);
		add(p, BorderLayout.CENTER);
		
		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

public class JComboBOxTest {

	public static void main(String[] args) {
		new MyFrame();
	}

}
