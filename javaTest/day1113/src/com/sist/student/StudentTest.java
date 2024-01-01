package com.sist.student;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import com.sist.dao.studentDao;
import com.sist.vo.StudentVo;

class StudentFrame extends JFrame {
	JTable table;
	JTextField jtf_name;
	JTextField jtf_kor;
	JTextField jtf_eng;
	JTextField jtf_math;
	
	Vector<String> colNames;
	Vector<Vector<String>> rowData;
	
	ArrayList<StudentVo> list;
	
	// 모든 학생의 정보를 조회하여 rowData에 담는다
	public void loadStudent() {
		// 전체 테이블이 복사 후 추가되기 때문에 vector를 비우고 추가한다
		rowData.clear();
		studentDao dao = new studentDao();
		list = dao.listStudent();
		
		for (StudentVo s : list) {
			Vector<String> v = new Vector<String>();
			v.add(s.getName());
			v.add(s.getKor() + "");
			v.add(s.getEng() + "");
			v.add(s.getMath() + "");
			v.add(s.getTot() + "");
			v.add(s.getAvg() + "");
			
			rowData.add(v);
		}
		// rowData의 변경된 데이터를 테이블에 반영
		table.updateUI();
	}
	
	public StudentFrame() {
		colNames = new Vector<String>();
		colNames.add("이름");
		colNames.add("국어");
		colNames.add("영어");
		colNames.add("수핫");
		colNames.add("총점");
		colNames.add("평균");
		
		rowData = new Vector<Vector<String>>();
		table = new JTable(rowData, colNames);
		JScrollPane jsp = new JScrollPane(table);
		
		jtf_name = new JTextField(10);
		jtf_kor = new JTextField(10);
		jtf_eng = new JTextField(10);
		jtf_math = new JTextField(10);
		
		JPanel p_input = new JPanel();
		p_input.setLayout(new GridLayout(4, 2));
		p_input.add(new JLabel("이름"));
		p_input.add(jtf_name);
		p_input.add(new JLabel("국어"));
		p_input.add(jtf_kor);
		p_input.add(new JLabel("영어"));
		p_input.add(jtf_eng);
		p_input.add(new JLabel("수학"));
		p_input.add(jtf_math);
		
		JButton btn_new = new JButton("새로운 학생");
		JButton btn_add = new JButton("등록");
		JButton btn_update = new JButton("수정");
		JButton btn_delete = new JButton("삭제");
		JPanel p_btn = new JPanel();
		p_btn.add(btn_new);
		p_btn.add(btn_add);
		p_btn.add(btn_update);
		p_btn.add(btn_delete);
		
		JPanel p_south = new JPanel();
		p_south.setLayout(new BorderLayout());
		p_south.add(p_input, BorderLayout.CENTER);
		p_south.add(p_btn, BorderLayout.SOUTH);
		
		add(jsp, BorderLayout.CENTER);
		add(p_south, BorderLayout.SOUTH);
				
		btn_new.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jtf_name.setText("");		
				jtf_kor.setText("");
				jtf_eng.setText("");		
				jtf_math.setText("");		
			}
		});
		
		btn_add.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				StudentVo vo = 
						new StudentVo(
								jtf_name.getText(), 
								Integer.parseInt(jtf_kor.getText()), 
								Integer.parseInt(jtf_eng.getText()), 
								Integer.parseInt(jtf_math.getText()));
				studentDao dao = new studentDao();
				int re = dao.insertStudent(vo);
				
				list = dao.listStudent();
				
				if (re == 1) {
					JOptionPane.showMessageDialog(null, "테이블 생성 완료");
				} else {
					JOptionPane.showMessageDialog(null, "테이블 생성 실패");
				}
				
				loadStudent();
			}
		});
		
		table.addMouseListener(new MouseListener() {			
			@Override
			public void mouseReleased(MouseEvent e) {
				// 테이블 클릭시 rowdata의 idx값을 가져온다
				int idx = table.getSelectedRow();
				Vector<String> v = rowData.get(idx);
				jtf_name.setText(v.get(0));
				jtf_kor.setText(v.get(1));
				jtf_eng.setText(v.get(2));
				jtf_math.setText(v.get(3));
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		
		btn_update.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				StudentVo vo = new StudentVo(
						jtf_name.getText(),
						Integer.parseInt(jtf_kor.getText()),
						Integer.parseInt(jtf_eng.getText()),
						Integer.parseInt(jtf_math.getText()));
				
				studentDao update = new studentDao();
				int re = update.updateStudent(vo);
				
				if (re == 1) {
					JOptionPane.showMessageDialog(null, "수정 완료");
				} else {
					JOptionPane.showMessageDialog(null, "수정 실패");
				}
				
				loadStudent();
			}
		});
		
		btn_delete.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				studentDao del = new studentDao();
				int re = del.deleteStudent(jtf_name.getText());
				
				if (re == 1) {
					JOptionPane.showMessageDialog(null, "삭제 성공");
				} else {
					JOptionPane.showMessageDialog(null, "삭제 실패");
				}
				
				loadStudent();
			}
		});
		
		loadStudent();
		setSize(600, 400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}


public class StudentTest {

	public static void main(String[] args) {
		new StudentFrame();
	}

}
