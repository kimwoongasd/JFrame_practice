package exam12;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

class MyFrame2 extends JFrame{
	
	//체크박스에 나타낼 문자열 배열을 만든다.
	String str[] = {"사과","포도","오렌지","수박","딸기"};
	
	//체크박스 배열을 선언한다.
	JCheckBox []jcb;
	
	//결과를 출력할 라벨을 맴버변수로 선언한다.
	JLabel jlb;
	
	//생성자를 만든다.
	public MyFrame2() {
		
		//체크박스 배열를 체크박스로 표시할 문자열 배열의 
		//길이 만큼 생성한다.
		jcb = new JCheckBox[str.length];
		
		//프레임의 레이아웃을 FlowLayout으로 설정한다.
		setLayout(new FlowLayout());
		
		//체크박스 배열의 길이 만큼 반복 실행한다.
		for(int i=0;i < jcb.length; i++  ) {
			
			//체크박스를 생성한다.
			jcb[i] = new JCheckBox(str[i]);
			
			//프레임에 체크박스를 담는다.
			add(jcb[i]);
			
			//체크박스에 이벤트를 연결한다.
			jcb[i].addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					
					//선택한 체크박스의 항목의 문자열을 
					//누적하기 위한 변수를 선언하고 
					//비어있는 문자열로 초기화 한다.
					String data =  "";
					
					//체크박스의 배열의 길이 만큼 반복실행한다.
					for(JCheckBox cb :jcb) {
						
						//체크박스가 선택되었는지 확인하여
						//만약 선택되었다면
						if(cb.isSelected()) {
							
							//그 체크박스의 문자열을 
							//누적한다.
							data += cb.getText()+",";
						}
					}
					
					//반복문을 탈출하였는데
					//data가 비어있는 문자열이라면
					if(data.equals("")) {	
						
						//라벨에 "아무것도 선택안함"이라고 출력한다.
						jlb.setText("아무것도 선택안함");
					}else {
						
						//data가 비어있는 문자열이 아니라면
						//맨마지막의 ,를 잘라내고
						data = data.substring(0, data.length()-1);
						
						//라벨에 출력한다.
						jlb.setText(data+"을(를) 선택하였습니다.");
					}					
				}
			});
		}
		
		//라벨을 생성한다.
		jlb = new JLabel("아무것도 선택안함");
		
		//프레임에 라벨를 추가한다.
		add(jlb);
		
		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

public class CheckBoxTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyFrame2();
	}

}
