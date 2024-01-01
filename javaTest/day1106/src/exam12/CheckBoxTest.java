package exam12;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

class MyFrame extends JFrame {
	// 체크박스 배열 선언
	ArrayList<JCheckBox> jch;
	JLabel jlb;
	
	public String getSelect() {
		String str = "";
		// 반복문을 돌면서 체크된 것만 str에 추가하여 리턴
		for (JCheckBox j : jch) {
			if (j.isSelected()) {
				str += j.getText() + " ";
			}
		}
		
		if (str.equals("")) {
			str = "선택안함";
		} else {
			str += "선택";
		}
		
		return str;
		
	}
	
	public MyFrame() {
		jch = new ArrayList<JCheckBox>();
		jlb = new JLabel("아무것도 선택안함");
		
		//체크박스 배열에 데이터 추가
		jch.add(new JCheckBox("포도"));
		jch.add(new JCheckBox("사과"));
		jch.add(new JCheckBox("귤"));
		jch.add(new JCheckBox("감"));
		jch.add(new JCheckBox("수박"));
		
		setLayout(new FlowLayout());
		
		for (JCheckBox j : jch) {
			add(j);
			
			j.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					jlb.setText(getSelect());
				}
			});
		}
		add(jlb);
		
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
