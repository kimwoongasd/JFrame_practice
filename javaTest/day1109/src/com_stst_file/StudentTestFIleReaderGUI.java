package com_stst_file;

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

// 1. 모든 학생의 정보를 담아둘 ArrayList 맴버로 선언 자료형 String
// 2. 이전 다음 버튼을 누를 떄마다 리스트의 인덱스에 접근하기 위한 정수형 맴버변수 0으로 ㅊ초기화
// 3. 프로그램 실행과 동시에 리스트에 담는다 맨첫번째 리스트 내용을 가져와서 각 데이터를 알맞은
// 텍스트필드에 출력한다
// 4. 다음 누르면 idx 1증가, 다음 리스트 데이터 가져오기
// 5. 이전 누르면 idx 1감소 이전 리스트 데이터 가져오기
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
		
		for (int i = 0; i < data.length; i++) {
			jtf[i].setText(data[i]);
		}
	}
	
	public StudentReadFrame() {
		try {
			file = new FileReader("C:\\data\\student.txt");
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