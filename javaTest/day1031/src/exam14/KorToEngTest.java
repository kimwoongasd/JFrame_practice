package exam14;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.StringTokenizer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

class MyFrame extends JFrame {
	JTextArea jta_kor;
	JTextArea jta_eng;
	HashMap<String, String> map;
	String[] suffix = {"은", "는", "이", "가", "로"};
			
	public MyFrame() {
		map = new HashMap<String, String>();
		map.put("텍스트", "Test");
		map.put("영어", "English");
		
		jta_kor = new JTextArea(10, 30);
		jta_eng = new JTextArea(10, 30);

		JButton btnOk = new JButton("변화");
		JButton btnCancle = new JButton("최소");
		
		JPanel p_center = new JPanel();
		JPanel p_south = new JPanel();
		
		// GridLayout(가로, 세로, 가로 여백, 세로여백)
		p_center.setLayout(new GridLayout(1, 2, 10, 10));
		p_south.setLayout(new FlowLayout());
		
		p_center.add(jta_kor);
		p_center.add(jta_eng);
		
		p_south.add(btnOk);
		p_south.add(btnCancle);
		
		btnOk.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// 문자열 자르기 : split, StringTokenizer
				String kor = jta_kor.getText();
				StringTokenizer st = new StringTokenizer(kor);
				String eng = "", suf = "";
				while (st.hasMoreTokens()) {
					String key = st.nextToken();
					for (String end : suffix) {
						if (key.endsWith(end)) {
							key = key.substring(0, key.length() - end.length());
							suf = end;
						}
					}
					if (map.get(key) != null) {
						eng += map.get(key) + suf;
					} else {
						eng += key;
					}
				}
				jta_eng.setText(eng);
			}
		});
		
		btnCancle.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jta_kor.setText("");
				jta_eng.setText("");
			}
		});
		
		setLayout(new BorderLayout());
		add(p_center, BorderLayout.CENTER);
		add(p_south, BorderLayout.SOUTH);
		
		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}

public class KorToEngTest {

	public static void main(String[] args) {
		new MyFrame();
	}

}
