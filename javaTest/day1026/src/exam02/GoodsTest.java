package exam02;

import java.util.ArrayList;

public class GoodsTest {
	public static void getInfo(ArrayList<Goods> list) {
		System.out.println("상품번호\t상품이름\t상품슈량\t단가");;
		for (Goods g : list) {
			System.out.printf("%s\t%s\t%d\t%d\n", g.getNumber(),
					g.getName(),g.getPrice(), g.getQty());
		}
	}
	
	public static int getTotal(ArrayList<Goods> list) {
		int sum = 0;
		
		for (Goods g : list) {
			sum += g.getPrice() * g.getQty();
		}
		return sum;
	}

	public static void main(String[] args) {
		ArrayList<Goods> list = new ArrayList<Goods>();
		
		list.add(new Goods("10", "딱플", 10, 700));
		list.add(new Goods("20", "삼각자", 20, 500));
		list.add(new Goods("30", "색종이", 20, 1000));
		list.add(new Goods("40", "딱지", 5, 500));
		list.add(new Goods("50", "콤파스", 10, 1500));
		
		getInfo(list);
		
		int total = getTotal(list);
		
		System.out.println("총 금액 : " + total);
	}
}
