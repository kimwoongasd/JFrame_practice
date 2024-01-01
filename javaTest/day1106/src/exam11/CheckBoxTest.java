package exam11;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

class MyFrame extends JFrame {
	JCheckBox jcb01;
	JCheckBox jcb02;
	JLabel jlb;
	
	public void getSelect() {
		if (jcb01.isSelected() && jcb02.isSelected()) {
			jlb.setText(jcb01.getText() + ", " + jcb02.getText() + " 선택");
		} else if (jcb01.isSelected() == true && jcb02.isSelected() == false) {
			jlb.setText(jcb01.getText() + " 선택");
		} else if (jcb01.isSelected() == false && jcb02.isSelected() == true) {
			jlb.setText(jcb02.getText() + " 선택");
		} else if (jcb01.isSelected() == false && jcb02.isSelected() == false) {
			jlb.setText("아무것도 선택안함");
		} 
	}
	
	public MyFrame() {
		jcb01 = new JCheckBox("사과");
		jcb02 = new JCheckBox("포도");
		jlb = new JLabel("아무것도 선택안함");
		
		setLayout(new FlowLayout());
		add(jcb01);
		add(jcb02);
		add(jlb);

			
		jcb01.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				getSelect();
			}
		});
		
		jcb02.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				getSelect();
			}
		});
		
		
		
		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

public class CheckBoxTest {

	public static void main(String[] args) {
		new MyFrame();
	}

}
