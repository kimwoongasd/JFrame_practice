package exam15;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class MyFrame2 extends JFrame {
	String[] name = {"언젠 오일 교환", "자동 변속기 오일 교환", "에어컨 필터 교환", "타이어 교환"};
	int[] price = {45000, 80000, 30000, 100000};
	JCheckBox[] jcb;
	JLabel jlb;
	
	// 생성자 생성
	public MyFrame2() {
		// 체크박스 배열 생성
		jcb = new JCheckBox[4];
		// 프레임의 가운데에 보여줄 패널을 생성
		JPanel p_center = new JPanel();
		// 확인 버튼과 총 금액을 나타낼 패널
		JPanel p_south = new JPanel();
		
		// 아래쪽 배치할 패널의 레이아웃을 왼쪽 정렬하도록하여 레이아웃을 설정
		p_south.setLayout(new FlowLayout(FlowLayout.LEFT));
		// 프레임의 가운데에 배치할 패널의 레이아웃을 그리드레이아웃으로 설정
		p_center.setLayout(new GridLayout(5, 2));
		p_center.add(new JLabel("수리"));
		p_center.add(new JLabel("가격(원)"));
		
		jlb = new JLabel("0원");
		
		//반복문을 이용하여
		for (int i = 0; i < name.length; i++) {
			//자동차 수리항목 4개를 체크박스로 생성한다.
			jcb[i] = new JCheckBox(name[i]);
			//생성한 체크박스를 패널에 담는다.
			p_center.add(jcb[i]);
			//그 체크박스 없에 가격을 라벨로 생성하여  패널에 담는다.
			p_center.add(new JLabel(price[i] + ""));
		}
		
		//총금액 계산을 위한 버튼을 생성한다.
		JButton btn = new JButton("확인");
		
		//프레임의 아래쪽에 배치될 패널에 
		//버튼과 총가격을 출력할 라벨을 담는다.
		p_south.add(btn);
		p_south.add(jlb);
		
		//버튼에 이벤트를 연결한다.
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//총 수리 금액을 누적하기 위한 변수를 
				//선언하고 0으로 초기화 한다.
				int total = 0;
				
				for (int i = 0; i < jcb.length; i++) {
					if (jcb[i].isSelected()) {
						total += price[i];
					}
				}
				
				jlb.setText(total + "");
			}
		});
		 
		
		setLayout(new BorderLayout());
		
		add(p_center, BorderLayout.CENTER);
		add(p_south, BorderLayout.SOUTH);
		
		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}

public class Test2 {

	public static void main(String[] args) {
		new MyFrame2();
	}

}
