package com_stst_file2;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.LinkedList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

// student01 파일을 읽어 들여서 총점과 평균을 계산하여 출력
class StudentReadFrame extends JFrame {
	String[] str = {"이름", "국어", "영어", "수학", "총점", "평균"};
	JLabel[] jlb = new JLabel[str.length];
	JTextField[] jtf = new JTextField[str.length];
	JPanel[] p = new JPanel[str.length];
	FileReader file;
	ArrayList<String> list; // 파일에서 읽어온 데이터를 저장
	String[] data; // list에서 split를 통해 얻은 데이터를 저장
	int idx = 0; // 화면에 가져올 데이터의 idx번호
	
	// 화면에 idx번호에 맞는 데이터를 출력한다
	public void printStudent(int index) {
		// split를 통해 " "로 구분한다, split은 배열을 반환한다
		data = list.get(idx).split(" ");
		int total = 0, avg;
		for (int i = 0; i < data.length; i++) {
			jtf[i].setText(data[i]);
			if (i >= 1 && i <= 3) {
				total += Integer.parseInt(data[i]);
			}
		}
		avg = total / 3;
		jtf[4].setText(String.valueOf(total));
		jtf[5].setText(String.valueOf(avg));
	}
	
	public StudentReadFrame() {
		try {
			file = new FileReader("C:\\data\\student01.txt");
			BufferedReader bf = new BufferedReader(file);
			list = new ArrayList<String>();
			String str = "";
			// readLine()은 한줄씩 데이터를 가져온다
			// 가져올 데이터가 없으면 null을 반환한다
			while ((str = bf.readLine()) != null) {
				System.out.println(str);
				list.add(str);
			}
			bf.close();
			
		} catch (Exception e) {
			System.out.println("예외 발생 : " + e.getMessage());
		}
		
		setLayout(new GridLayout(7, 2));
		for (int i = 0; i < jlb.length; i++) {
			jlb[i] = new JLabel(str[i]);
			jtf[i] = new JTextField(10);
			p[i] = new JPanel();
			p[i].add(jlb[i]);
			p[i].add(jtf[i]);
			add(p[i]);
		}
		
		printStudent(idx);
		
		JPanel p_btn = new JPanel();
		JButton btn_prev = new JButton("이전");
		JButton btn_next = new JButton("다음");
		p_btn.add(btn_prev);
		p_btn.add(btn_next);
		add(p_btn);

		
		btn_next.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (idx == list.size() - 1) {
					JOptionPane.showMessageDialog(null, "맨 마지막학생입니다");
					return;
				}
				idx++;
				printStudent(idx);
			}
		});
		
		btn_prev.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (idx == 0) {
					JOptionPane.showMessageDialog(null, "처음 학생입니다");
					return;
				}
				idx--;
				printStudent(idx);
			}
		});
		
		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

// 문자열 파일을 한줄씩 읽어 들인다
// BufferReader 이용

public class StudentTestFIleReaderGUI {
	public static void main(String[] args) {
		new StudentReadFrame();
		
	}
}
