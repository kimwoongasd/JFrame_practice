package exam07;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class MyFrame extends JFrame{
	JButton btn;
	JTextField jtx;
	JTextArea jta;
	JPanel p;
	URL url;
	JScrollPane jsp;
	
	public MyFrame() {
		btn = new JButton("읽어오기");
		jtx = new JTextField(20);
		jta = new JTextArea();
		p = new JPanel();
		
		// 스크롤바 생성
		jsp = new JScrollPane(jta);
		
		
		btn.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				String str = jtx.getText();
				try {
					url = new URL(str);
					InputStream is = url.openStream();

					byte[] data = new byte[100];
					
					while (is.read(data) != -1) {
//						String new_str = new String(data);
//						jta.setText(jta.getText() + new_str);
						jta.append(new String(data));
						
						Arrays.fill(data, (byte)0);
					}
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
			}
		});
		
		p.setLayout(new FlowLayout());
		p.add(jtx);
		p.add(btn);
		setLayout(new BorderLayout());
		add(p, BorderLayout.NORTH);
		add(jsp, BorderLayout.CENTER);
		
		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}


public class URLTestGUI {

	public static void main(String[] args) {
		new MyFrame();
	}

}
