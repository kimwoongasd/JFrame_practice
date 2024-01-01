package exam02;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

public class LinePanel extends JPanel{
	int x1, y1, x2, y2;
	
	public LinePanel() {
		this.x1 = 100;
		this.y1 = 100;
		this.x2 = 300;
		this.y2 = 100;
	
		addMouseListener(new MouseListener() {
			
			// 마우스를 뗄떄
			@Override
			public void mouseReleased(MouseEvent e) {
				x2 = e.getX();
				y2 = e.getY();
				repaint(); // 다시 그리기
			}
			
			// 마우스 누를떄
			@Override
			public void mousePressed(MouseEvent e) {
				x1 = e.getX();
				y1 = e.getY();
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
	}
	


	// 자동으로 동작
	// 그려야할 상황이 있을 경우
	@Override
	protected void paintComponent(Graphics g) {
		// 가로선 (x 시작점, y 시작점, x끝점, y끝점)
		g.drawLine(x1,  y1, x2, y2);
	}
}
