package day0927;

public class ChangeValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cup_kim = 8, cup_park = 5;
		
		System.out.println("지수님의 컵에 담긴 젤리: " + cup_kim);
		System.out.println("세연님의 컵에 담긴 젤리: " + cup_park);
		
		int tem;
		tem = cup_kim;
		cup_kim = cup_park;
		cup_park = tem;
		
		System.out.println("---------------------------");
		System.out.println("두사람의 컵 내용물을 바꾸었습니다");
		System.out.println("지수님의 컵에 담긴 젤리: " + cup_kim);
		System.out.println("세연님의 컵에 담긴 젤리: " + cup_park);
		
	}

}
