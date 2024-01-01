package exam03;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

// 메모장 만들기

class NoteFrame extends JFrame {
	
	// 메모 내용을 작성하기 위한 텍스트
	JTextArea jta;
	// 파일 저장이나 열기할 때 사용(다이얼그램)
	JFileChooser jfc;
	
	// 파일에 저장 안 된것이 있는지 판별할 변수
	boolean isNew;
	
	// 파일이 열어 있는지 확인
	File file = null;
	
	// 파일 저장 메소드
	public void saveFile() {
		String str = jta.getText();
		try {
			// 오픈된 파일이 없으면 파일 제목 저장하게 물어본다
			int re = 0;
			if (file == null) {
				// 파일에 어디에 어떤이름으로 저장할 것이지 물어보기위한 다이얼로그
				// 저장을 눌렀을 떄 int값을 반환한다
				// 저장 : 0, 취소 : 1
				re = jfc.showSaveDialog(null);
				}
			
			// re가 0이면 파일 저장처리
			if (re == 0) {
				// 파일의 저장한 정보 객체를 가져온다
				file = jfc.getSelectedFile();

				//  파일의 내용을 출력하기 위한 FileWriter 객체를 생성
				FileWriter fw = new FileWriter(file);
				
				// 위의 생성한 파일 객체에 사용자가 입력한 내용을 쓴다
				fw.write(str);
				// 파일 사용이 끝나면 닫기
				fw.close();
				// 파일 변경이 없음을 표시
				isNew = false;
			}
		} catch (Exception error) {
			System.out.println("에외 발생 : " + error.getMessage());
		}
	}
	
	// 생성자
	public NoteFrame() {
		jta = new JTextArea(30, 80);
		// 파일 저장, 열기에 사용될 파일을 선택하기 위한 JFileChooser 객체 생성
		// 기본 폴더를 C:\\data로 설정
		jfc = new JFileChooser("C:\\data");
		
		// 텍스트에리어에 스크롤바 표시를 위한 JScrollPane 객체 생성
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
		
		// 텍스트에리어에 키보드 이벤트 등록
		// 텍스트에리어의 저장할 떄 변화가 있느지 확인을 위한 이벤트
		jta.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				// 텍스트에리어에 변화가 있을 경우
				isNew = true;
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
			}
		});
		
		// 부메뉴 새 파일 이벤트
		file_new.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// 변경된 내용이 있는지 확인(저장이 안된 상태)
				
				if (isNew) {
					// 사용자에게 저장할 것인지 물어보기 위하여
					// JOptionPane.showConfirmDialog를 사용
					int re = JOptionPane.showConfirmDialog(null, "저장하시겠습니까?");
					// 예 : 0, 아니오 : 1, 취소 :2
					// re의 결과에 따라 저장할지 말지 정한다
					if (re == 0) {
						saveFile();
						// 저장 후 텍스트에리어, 변경사항 초기화
						jta.setText("");
						isNew = false;
						// 저장하지 않으면 전부 초기화
					} else if (re == 1) {
						jta.setText("");
						isNew = false;
					}
				} else {
					jta.setText("");
				}
				
				// 파일 초기화
				file = null;
			}
		});
		
		// 부메뉴 열기 이벤트
		file_open.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				// file를 사용할 때 try를 써야한다
				try {
					// 열어올 파일을 선택
					// 열기 : 0, 취소 : 1
					int re = jfc.showOpenDialog(null);
					
					if (re == 0) {
						// 열어올 파일 정보
						file = jfc.getSelectedFile();
						
						// 파일을 읽기위한 FileReader 객체 생성
						FileReader fr = new FileReader(file);
						// read로 가져올 데이터를 저장할 ch
						// read는 int를 반환한다
						int ch;
						String str = "";
						// 그 다음 값이 없다면 -1
						// 한 글자씩 가져온다
						while ((ch = fr.read()) != - 1) {
							str += (char)ch;
						}
						
						jta.setText(str);
						fr.close();
					}
					// 파일이 열었으니 변경된 정보가 없기 때문에 false로 저장
					isNew = false;
				} catch (Exception err) {
					System.out.println("에외 발생 : " + err.getMessage());
				}
			}
		});
		
		// 부메뉴 저장 이벤트
		file_save.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				saveFile();
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
