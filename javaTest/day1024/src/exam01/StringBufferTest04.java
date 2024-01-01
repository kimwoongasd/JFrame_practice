package exam01;

class MemberDAO {
	public void insert(String sql) {
		System.out.println("다음 명령을 동작하였씁니다");
		System.out.println(sql);
	}
}

public class StringBufferTest04 {

	public static void main(String[] args) {
		StringBuffer str = new StringBuffer("insert  ");
		
		str.append("into ");
		str.append("member ");
		str.append("values ");
		str.append("('tiger' , 20 )");
		System.out.println(str);
		
		MemberDAO m = new MemberDAO();
		m.insert(str.toString());
	}
}
