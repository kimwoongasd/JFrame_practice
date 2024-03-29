package exam01;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

class MyFrame extends JFrame {
	JComboBox<String> jcb;
	JLabel jlb;
	public MyFrame() {
		jlb = new JLabel();
		jcb = new JComboBox<String>();
		jcb.addItem("사과");
		jcb.addItem("포도");
		jcb.addItem("딸기");
		jcb.addItem("감");
		jcb.addItem("귤");
		
		jcb.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(jcb.getSelectedItem());
				String item = (String)jcb.getSelectedItem();		
				jlb.setText(item + "을 선택하였습니다");
			}
		});
		
		setLayout(new BorderLayout());
		add(jcb, BorderLayout.NORTH);
		add(jlb, BorderLayout.CENTER);
		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

public class JComboBoxTest {

	public static void main(String[] args) {
		new MyFrame();
	}

}
