package exam06;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Arrays;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class MyFrame extends JFrame {
	JTextArea jta;
	JTextField jtf;
	JScrollPane jsp;
	JPanel p;
	
	Socket socket;
	OutputStream os;
	InputStream is;
	
	public MyFrame() {
		jta = new JTextArea();
		jtf = new JTextField(20);
		jsp = new JScrollPane(jta);
		p = new JPanel();
		
		
		p.setLayout(new FlowLayout());
		JButton btn = new JButton("전송");
		p.add(jtf);
		p.add(btn);

		setLayout(new BorderLayout());
		add(jsp, BorderLayout.CENTER);
		add(p, BorderLayout.SOUTH);
		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		try {
			// 서버와 연결
			socket = new Socket("192.168.0.59", 9005);
			System.out.println("서버와 연결되었습니다");
			// 데이터 읽어들인다
			is = socket.getInputStream();
			
			// 데이터를 보낸다
			os = socket.getOutputStream();
			
			class ClientThread extends Thread {
				public void run() {
					byte[] arr = new byte[100];
					while (true) {
						try {
							is.read(arr);
							
							System.out.println((new String(arr)).trim());
							jta.append((new String(arr)).trim() + "\n");
							
							Arrays.fill(arr, (byte)0);
						} catch (IOException e) {
							System.out.println("예외 발생 : " + e.getMessage());
						}
					}
				}
			} // end ClientThread
			
			ClientThread ct = new ClientThread();
			ct.start();
		} catch (Exception e) {
			System.out.println("예외 발생 : " + e.getMessage());
		}

		
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String msg = jtf.getText();
				// 보낼 데이터를 바이트 배열로 바꿔서 저장
				byte[] data = msg.getBytes();
				try {
					os.write(data);
					
					if (msg.equals("q!")) {
						System.exit(0);
					}
					
					jtf.setText("");
					Arrays.fill(data, (byte)0);
				} catch (IOException e1) {
					System.out.println("예외 발생 : " + e1.getMessage());
				}
				
			}
		});
	}
}


public class TCPClientEchoGUIMultiCast {

	public static void main(String[] args) {
		new MyFrame();	
	}

}
