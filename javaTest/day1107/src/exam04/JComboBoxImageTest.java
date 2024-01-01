package exam04;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

class MyFrame extends JFrame{
	String[] arr  = {"사과", "바나나", "포도", "복숭아", "감"};
	String[] fname = {"apple.gif", "banana.gif", "grape.gif", "peach.gif", "persimmon.gif"};
	JComboBox<String> jcb;
	JLabel jlb;
	HashMap<String, ImageIcon> map = new HashMap<String, ImageIcon>(); 
	public MyFrame() {
		jcb = new JComboBox<String>();
		jlb = new JLabel();
		
		for (int i = 0; i < 5; i++) {
			jcb.addItem(arr[i]);
			map.put(arr[i], new ImageIcon(fname[i]));
		}
		
		jcb.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String key = (String)jcb.getSelectedItem();
				ImageIcon icon = map.get(key);
				jlb.setIcon(icon);
			}
		});
		
		setLayout(new BorderLayout());
		add(jcb, BorderLayout.NORTH);
		add(jlb, BorderLayout.CENTER);
		
		setSize(300, 800);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

public class JComboBoxImageTest {
	
	public static void main(String[] args) {
		new MyFrame();
	}

}
