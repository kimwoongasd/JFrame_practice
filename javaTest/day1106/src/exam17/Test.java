package exam17;

import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;

class MyFrame extends JFrame {
	String[][] arr = new String[3][3];
	ArrayList<JButton> btn = new ArrayList<JButton>();
	boolean ox = false;
	
	
	
	public MyFrame() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				arr[i][j] = "";
			}
		}
		
		for (int i = 0; i < 9; i++) {
			btn.add(new JButton(""));
		}
		
		setLayout(new GridLayout(3, 3));
		
		for (JButton j : btn) {
			add(j);
			j.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					if (j.getText().equals("")) {
						if (ox) {
							j.setText("O");
							ox = false;
						} else {
							j.setText("X");
							ox = true;
						}
						System.out.println(j.getX());
						System.out.println(j.getY());
						
						for (int i = 0; i < 3; i++) {
							int res = 0;
							String tem = arr[i][0];
							// 가로줄 완성 확인
							for (int j = i + 1; j < 3; j++) {
								if (!tem.equals(arr[i][j])) {
									break;
								}
								res++;
							}
							
							if (res == 3) {
								System.out.println(tem + "승리");
								System.exit(0);
							}
							
							res = 0;
							// 세로줄 완성 확인
							for (int j = i + 1; j < 3; j++) {
								if (!tem.equals(arr[j][i])) {
									break;
								}
								res++;
							}
							
							if (res == 3) {
								System.out.println(tem + "승리");
								System.exit(0);
							}
							
							
						}
					}
				}
			});
		}
		
		setSize(300, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

public class Test {

	public static void main(String[] args) {
		new MyFrame();
	}

}
