package com_stst_file;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.LinkedList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

//C:\data\student02.dat 으로 파일 출력
class StudentObjectInputdFrame extends JFrame {
	String[] str = {"이름", "국어", "영어", "수학", "총점", "평균"};
	JLabel[] jlb = new JLabel[str.length];
	JTextField[] jtf = new JTextField[str.length];
	JPanel[] p = new JPanel[str.length];
	FileReader file;
	ArrayList<Student> list; // 파일에서 읽어온 데이터를 저장
	int idx = 0; // 화면에 가져올 데이터의 idx번호
	
	public void printStudent(int index) {
		Student data = list.get(idx);
		jtf[0].setText(data.getName());
		jtf[1].setText(String.valueOf(data.getKor()));
		jtf[2].setText(String.valueOf(data.getEng()));
		jtf[3].setText(String.valueOf(data.getMath()));
		jtf[4].setText(String.valueOf(data.getTot()));
		jtf[5].setText(String.valueOf(data.getAvg()));
	}
	
	public StudentObjectInputdFrame() {
		try {
			ObjectInputStream ois =
					new ObjectInputStream(new FileInputStream("C:\\data\\student02.dat"));
			list = (ArrayList<Student>)ois.readObject();
			ois.close();
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

public class StudentTestObejctInputGUI {
	public static void main(String[] args) {
		new StudentObjectInputdFrame();
		
	}
}
