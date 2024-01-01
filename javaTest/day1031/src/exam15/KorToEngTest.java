package exam15;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Iterator;
import java.util.StringTokenizer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

class MyFrame extends JFrame {
	JTextArea jta_kor;
	JTextArea jta_eng;
	HashMap<String, String> map;
			
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
				String kor = jta_kor.getText();
				String eng = kor;
				
				// map으로 부터 key를 모두 갖고온다
				Iterator iter = map.keySet().iterator();
				
				// Iterator에 데이터가 있는 만큼 반복실행
				while (iter.hasNext()) {
					String key = (String)iter.next();
					String value = map.get(key);
					// key를 value로 바꾼다
					eng = eng.replace(key, value);
				}
				
				jta_eng.setText(eng);
				
//				while (st.hasMoreTokens()) {
//					String key = st.nextToken();
//					if (map.get(key) != null) {
//						eng += map.get(key);
//					} else {
//						eng += key;
//					}
//					eng += "\n";
//				}
//				jta_eng.setText(eng);
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
