package exam01;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileReader;
import java.io.FileWriter;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

// 메모장 만들기

class NoteFrame extends JFrame {
	JTextArea jta;
	
	public NoteFrame() {
		jta = new JTextArea(30, 80);
		
		JScrollPane jsp = new JScrollPane(jta);
		add(jsp);
		
		// JTextArea는 스크롤바를 붙이고 JTextArea를 화면에 붙이는게 아니라
		// JScrollPane를 화면에 붙인다
//		add(jta);
		
		// 메뉴바 생성 - 컨테이너의 역할 (담을 수 있는)
		JMenuBar jmb = new JMenuBar();
		
		// 주 메뉴 생성
		JMenu mn_file = new JMenu("파일");
		
		// 부메뉴 생성
		JMenuItem file_new = new JMenuItem("새 파일");
		JMenuItem file_open = new JMenuItem("열기");
		JMenuItem file_save = new JMenuItem("저장");
		
		// 주메뉴에 부메뉴 담기
		mn_file.add(file_new);
		mn_file.add(file_open);
		mn_file.add(file_save);
		
		// 메뉴바에 주메뉴 담기
		jmb.add(mn_file);
		
		// 프레임에 메뉴바 설정
		setJMenuBar(jmb);
		
		// 부메뉴 새 파일 이벤트
		file_new.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("새파일 선택");
			}
		});
		
		// 부메뉴 열기 이벤트
		file_open.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				// file를 사용할 때 try를 써야한다
				try {
					FileReader fr = new FileReader("C://data//메모.txt");
					int ch;
					String str = "";
					// 그 다음 값이 없다면 -1
					// 한 글자씩 가져온다
					while ((ch = fr.read()) != - 1) {
						str += (char)ch;
					}
					
					jta.setText(str);
					fr.close();
				} catch (Exception err) {
					System.out.println("에외 발생 : " + err.getMessage());
				}
			}
		});
		
		// 부메뉴 저장 이벤트
		file_save.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String str = jta.getText();
				try {
					// c드라이브 data폴더에 메모.txt 파일을 생성
					FileWriter fw = new FileWriter("C:\\data\\메모.txt");
					
					// 위의 생성한 파일 객체에 사용자가 입력한 내용을 쓴다
					fw.write(str);
					// 파일 사용이 끝나면 닫기
					fw.close();
					System.out.println("파일을 생성함");
					
				} catch (Exception error) {
					System.out.println("에외 발생 : " + error.getMessage());
				}
			}
		});
		
		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

public class NotePadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new NoteFrame();
	}

}
