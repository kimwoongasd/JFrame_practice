package exam01;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class LinePanel extends JPanel{

	@Override
	protected void paintComponent(Graphics g) {
		g.setColor(Color.red);
		
		// 가로선 (x 시작점, y 시작점, x끝점, y끝점)
		g.drawLine(100,  100,  200,  100);
	}
}
