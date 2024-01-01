package exam04;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

public class OvalPanel extends JPanel{
	int x1, y1, x2, y2;
	
	public OvalPanel() {
		addMouseListener( new MouseListener() {
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				x2 = e.getX();
				y2 = e.getY();
				
				repaint();
				//다시 그려주세요!
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
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
	


	@Override
	protected void paintComponent(Graphics g) {
		int width = x2 - x1, height = y2 - y1;
		int x = x1, y = y1;
		
		if (x1 > x2) {
			x = x2;
			width = x1 - x2;
		}
		
		if (y1 > y2) {
			y = y2;
			height = y1 - y2;
		}
		
		// (시작x , 시작y, 가로, 높이)
		g.drawOval(x, y, width, height);
	}
}
