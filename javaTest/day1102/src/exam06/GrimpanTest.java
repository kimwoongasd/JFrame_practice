package exam06;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

//파일 : 새파일, 열기, 저장
//그리기 도구 : 선, 원, 사각형

class MyFrame extends JFrame {
	GrimpanPanel lp;
	
	public MyFrame() {
		// 메뉴바 생성
		JMenuBar jmb = new JMenuBar();
		
		// 메뉴 생성
		JMenu mn_file = new JMenu("파일");
		
		// 부메뉴 생성
		JMenuItem jmt_new = new JMenuItem("새 파일");
		JMenuItem jmt_open = new JMenuItem("열기");
		JMenuItem jmt_save = new JMenuItem("저장");
		
		mn_file.add(jmt_new);
		mn_file.add(jmt_open);
		mn_file.add(jmt_save);
		
		// 메뉴 생성
		JMenu mn_draw = new JMenu("그리기 도구");
		
		// 부메뉴 생성
		JMenuItem jmt_line = new JMenuItem("선");
		JMenuItem jmt_circle = new JMenuItem("원");
		JMenuItem jmt_rect = new JMenuItem("사각형");

		mn_draw.add(jmt_line);
		mn_draw.add(jmt_circle);
		mn_draw.add(jmt_rect);
		
		jmb.add(mn_file);
		jmb.add(mn_draw);
		
		// 프레임에 메뉴바 넣기
		setJMenuBar(jmb);
		
		// 그림판 판넬 생성
		
		
		// drawType 정하기
		jmt_line.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				lp.drawType = 0;
			}
		});
		
		jmt_circle.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				lp.drawType = 1;
			}
		});
		
		jmt_rect.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				lp.drawType = 2;
			}
		});
		
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
