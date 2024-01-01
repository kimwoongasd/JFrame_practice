package exam16;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

class MyFrame extends JFrame {
	String[] name = {"Small", "Medium", "Large"};
	int[] price = {3000, 4000, 5000};
	JRadioButton[] jb;
	JLabel jlb = new JLabel("0원");
	ButtonGroup bg;
	
	public MyFrame() {
		jb = new JRadioButton[3];
		
		JPanel p_center = new JPanel();
		JPanel p_south = new JPanel();
		
		p_center.setLayout(new GridLayout(4,  2));
		p_center.add(new JLabel("커피 크기"));
		p_center.add(new JLabel("가격(원)"));
		
		bg = new ButtonGroup();
		
		for (int i = 0; i < jb.length; i++) {
			jb[i] = new JRadioButton(name[i]);
			bg.add(jb[i]);
			p_center.add(jb[i]);
			p_center.add(new JLabel(price[i] + ""));
		}
		
		JButton btn = new JButton("확인");
		
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < jb.length; i++) {
					if (jb[i].isSelected()) {
						jlb.setText(price[i] + "");
					}
				}
			}
		});
		
		p_south.add(btn);
		p_south.add(jlb);
		
		setLayout(new BorderLayout());
		add(p_center, BorderLayout.CENTER);
		add(p_south, BorderLayout.SOUTH);
		
		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

public class Test {

	public static void main(String[] args) {
		new MyFrame();
	}

}
