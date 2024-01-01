package exam05;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.lang.runtime.SwitchBootstraps;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class GrimpanPanel extends JPanel{
	int x1, y1, x2, y2;
	int drawType; // 선 : 0, 원 : 1, 사각혐 : 2
	
	public GrimpanPanel() {
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
		
		switch (drawType) {
			case 0: g.drawLine(x1, y1, x2, y2); break;
			case 1: g.drawOval(x, y, width, height); break;
			case 2: g.drawRect(x, y, width, height); break;
		}
	}
}
