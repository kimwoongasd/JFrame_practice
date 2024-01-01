package exam15;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

class MyFrame extends JFrame {
	HashMap<JCheckBox, Integer> map;
	JLabel jlb;
	int total = 0;
	
	public MyFrame() {
		map = new HashMap<JCheckBox, Integer>();
		map.put(new JCheckBox("언젠 오일 교환"), 45000);
		map.put(new JCheckBox("자동 변속기 오일 교환"), 80000);
		map.put(new JCheckBox("에어컨 필터 교환"), 30000);
		map.put(new JCheckBox("타이어 교환"), 100000);
		
		jlb = new JLabel("0원");
		setLayout(new FlowLayout());
		
		for (JCheckBox j : map.keySet()) {
			add(j);
			
			j.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					if (j.isSelected()) {
						total += map.get(j);
					} else {
						total -= map.get(j);
					}
					jlb.setText(total + "원");
				}
			});
		}
		
		add(jlb);
		
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
