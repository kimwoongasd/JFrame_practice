package exam08;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

// 메뉴
//파일 : 새파일, 열기, 저장
//그리기 도구 : 선, 원, 사각형
// 색상 : 빨, 파, 초, 검

class MyFrame extends JFrame {
	GrimpanPanel lp;
	JFileChooser jfc;
	boolean isNew = false;
	
	public void saveFile() {
		// 저장 다이얼로그 불러오기
		// 저장 : 0, 취소 : 1 리턴
		int re = jfc.showSaveDialog(null);
		
		if (re == 0) {
			// 저장할 선택한 파일 정보 가져오기
			File file = jfc.getSelectedFile();
			
			// 객체단위로 출력하기 위하여 objectoutputstream를 이용
			// java.io이기 떄문에 에외처리 해야한다
			try {
				ObjectOutputStream oos = 
						new ObjectOutputStream(new FileOutputStream(file));
				
				// 객체를 출력
				// 객체를 파일로 내보내기 하려면 직렬화 즉 순서를 보장해줘야 한다
				// 우리가 파일로 기록하고자 하는 것은 list이다
				// list에 담긴 자료형은 GraphicInfo 인데
				// 내가 만든 자료형(클래스)를 파일로 기록하려면 기록하는 순서를 정햐여 한다
				// 이를 직렬화라고 한다
				
				oos.writeObject(lp.list);
				
				// 출력 후 닫아야한다
				oos.close();
			} catch (Exception error) {
				System.out.println("예외발생 : " + error.getMessage());
			}
		}
	}
	
	public MyFrame() {
		jfc = new JFileChooser("C:\\data");
		
		// 메뉴바 생성
		JMenuBar jmb = new JMenuBar();
		
		// 파일 메뉴 생성
		JMenu mn_file = new JMenu("파일");
		
		// 파일 부메뉴 생성
		JMenuItem jmt_new = new JMenuItem("새 파일");
		JMenuItem jmt_open = new JMenuItem("열기");
		JMenuItem jmt_save = new JMenuItem("저장");
		
		mn_file.add(jmt_new);
		mn_file.add(jmt_open);
		mn_file.add(jmt_save);
		
		// 그리기 도구 메뉴 생성
		JMenu mn_draw = new JMenu("그리기 도구");
		
		// 그리기 도구 부메뉴 생성
		JMenuItem jmt_line = new JMenuItem("선");
		JMenuItem jmt_circle = new JMenuItem("원");
		JMenuItem jmt_rect = new JMenuItem("사각형");

		mn_draw.add(jmt_line);
		mn_draw.add(jmt_circle);
		mn_draw.add(jmt_rect);
		
		// 색상 메뉴 생성
		JMenu mn_color = new JMenu("그리기 색상");
		
		// 색상 부메뉴 생성
		JMenuItem jmt_red = new JMenuItem("빨강");
		JMenuItem jmt_blue = new JMenuItem("파랑");
		JMenuItem jmt_green = new JMenuItem("초록");
		JMenuItem jmt_black = new JMenuItem("검정");
		
		mn_color.add(jmt_red);
		mn_color.add(jmt_blue);
		mn_color.add(jmt_green);
		mn_color.add(jmt_black);
		
		// 메누바에 메뉴 추가
		jmb.add(mn_file);
		jmb.add(mn_draw);
		jmb.add(mn_color);
		
		// 프레임에 메뉴바 넣기
		setJMenuBar(jmb);
		
		// 파일 메뉴 이벤트 설정
		jmt_new.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				if (lp.isNew) {
					int re = JOptionPane.showConfirmDialog(null, "저장하시겠습니까?");
					if (re == 0) {
						saveFile();
					} else if (re == 2) return;
				}
				lp.isNew = false;
				// 그래픽이 그려진 리스트를 비운다
				lp.list.clear();
				// 다시 그린다
				lp.repaint();
			}
		});
		
		// 파일 열기
		jmt_open.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				int re = jfc.showOpenDialog(null);
				
				// 다이얼로그에 열기 버트 눌면
				if (re == 0 ) {
					// 다이얼로그에서 선택한 파일 객체를 갖고돈다
					File file = jfc.getSelectedFile();
					try {
						//4. 객체단위로 파일을 읽어 들이기 위한
						//ObjectInputStream객체를 생성한다.
						ObjectInputStream ois = 
								new ObjectInputStream(new FileInputStream(file));
						//5. 파일로 부터 객체를 읽어 들여
						//		패널의 리스트에 저장한다.
						lp.list = (ArrayList<GraphicInfo>)ois.readObject();
						
						//6. 패널을 다시 그려줄것을 요청한다.
						lp.repaint();
						lp.isNew = false;
						// 사용한 파일을 닫아준다
						ois.close();
					} catch (Exception error) {
						System.out.println("예외발생:"+  error.getMessage());
					}
					
				}
			}
		});
		
		// 파일 저장
		jmt_save.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				saveFile();
			}
		});
		
		
		// drawType 정하기
		// 선 모양
		jmt_line.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				lp.drawType = 0;
			}
		});
		
		// 원 모양
		jmt_circle.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				lp.drawType = 1;
			}
		});
		
		// 사각형
		jmt_rect.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				lp.drawType = 2;
			}
		});
		
		// colorType 정하기
		jmt_red.addActionListener(new ActionListener() {		
			@Override
			public void actionPerformed(ActionEvent e) {
				lp.drawColor = Color.red;
			}
		});
		
		jmt_blue.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				lp.drawColor = Color.blue;
			}
		});
		
		jmt_green.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				lp.drawColor = Color.green;
			}
		});
		
		jmt_black.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				lp.drawColor = Color.black;
			}
		});
		
		
		// 그림판 판넬 생성
		lp = new GrimpanPanel();
		add(lp);
		
		setSize(600, 500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}


public class GrimpanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyFrame();
	}

}
