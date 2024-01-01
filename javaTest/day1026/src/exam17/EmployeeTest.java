package exam17;

import java.util.ArrayList;

public class EmployeeTest {

	public static void main(String[] args) {
		ArrayList<Employee> list = new ArrayList<Employee>();
		list.add(new SalariedEmployee("초코", "A1234", 1));
		list.add(new SalariedEmployee("바나나", "A1254", 3));
		list.add(new HourlyEmployee("딸기", "B1234", 35000, 8));
		
		for (Employee e : list) {
			e.computeSalary();
			
			if (e instanceof SalariedEmployee) {
				System.out.printf("이름 %s, 사번 %s, 호봉 %d, "
						+ "기본금 %d, 수당 %d, 실수령액 %d\n",
						e.getName(), e.getNo(), ((SalariedEmployee)e).getLevel(), 
						((SalariedEmployee)e).getBase(), ((SalariedEmployee)e).getPay(), ((SalariedEmployee)e).getSalary());
			} else {
				System.out.printf("이름 %s, 사번 %s, 시간당 임금 %d, "
						+ "시간 %d , 실수령액 %d\n",
						((HourlyEmployee)e).getName(), 
						((HourlyEmployee)e).getNo(), ((HourlyEmployee)e).getPay(), 
						((HourlyEmployee)e).getTime(), ((HourlyEmployee)e).getTotal());
			}
		}
		
//		// 월급제 사원
//		SalariedEmployee e1 = new SalariedEmployee("초코", "A1234", 1);
//		SalariedEmployee e2 = new SalariedEmployee("바나나", "A1254", 3);
//		
//		// 시간제 사원
//		HourlyEmployee h1 = new HourlyEmployee("딸기", "B1234", 35000, 8);
//		
//		e1.computeSalary();
//		e2.computeSalary();
//		h1.computeSalary();
		
//		System.out.printf("이름 %s, 사번 %s, 호봉 %d, "
//				+ "기본금 %d, 수당 %d, 실수령액 %d\n",
//				e1.getName(), e1.getNo(), e1.getLevel(), 
//				e1.getBase(), e1.getPay(), e1.getSalary());
//		
//		System.out.printf("이름 %s, 사번 %s, 호봉 %d, "
//				+ "기본금 %d, 수당 %d, 실수령액 %d\n",
//				e2.getName(), e2.getNo(), e2.getLevel(), 
//				e2.getBase(), e2.getPay(), e1.getSalary());
//		
//		System.out.printf("이름 %s, 사번 %s, 시간당 임금 %d, "
//				+ "시간 %d , 실수령액 %d\n",
//				h1.getName(), h1.getNo(), h1.getPay(), 
//				h1.getTime(), h1.getTotal());

	}

}
