package exam03;

import java.util.ArrayList;
import java.util.Scanner;

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
	
	public static void insertGoods(ArrayList<Goods> list) {
		String number, name;
		int price, qty, n;
		Scanner sc = new Scanner(System.in);
		
		
		while (true) {
			do {
				try {
					System.out.println("상품 입력 == 1, 종료 == 0");
					n = sc.nextInt();
					
					if (n == 0 || n ==1) break;
				} catch (Exception e) {
					System.out.println("메뉴를 잘못 선택했씁니다");
					sc.next();
				}
			} while (true);
			
			
			if (n == 0) break;
			
			System.out.println("상품번호를 입력하시오");
			number = sc.next();
			
			System.out.println("상품명를 입력하시오");
			name = sc.next();
			
			System.out.println("상품 수량를 입력하시오");
			qty = sc.nextInt();
			
			System.out.println("상품 금액를 입력하시오");
			price = sc.nextInt();
			

			list.add(new Goods(number, name, qty, price));
		}
		
	}

	public static void main(String[] args) {
		ArrayList<Goods> list = new ArrayList<Goods>();
		
		insertGoods(list);
//		list.add(new Goods("10", "딱플", 10, 700));
//		list.add(new Goods("20", "삼각자", 20, 500));
//		list.add(new Goods("30", "색종이", 20, 1000));
//		list.add(new Goods("40", "딱지", 5, 500));
//		list.add(new Goods("50", "콤파스", 10, 1500));
		
		getInfo(list);
		
		int total = getTotal(list);
		
		System.out.println("총 금액 : " + total);
	}
}
