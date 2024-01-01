package multi.frame;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.LayoutManager;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MainFrame extends JFrame {
	JLabel jlb;
	// 생성자는 name을 파라미터를 필요로 한다
	public MainFrame(String name) {
		setTitle("메인화면");
		jlb = new JLabel(name);
		setLayout(new FlowLayout());
		
		add(jlb);
		setSize(400, 300);
		setVisible(true);
	}
}
