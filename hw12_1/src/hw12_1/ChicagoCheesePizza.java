package hw12_1;

//***************************
// 파일명: ChicagoCheesePizza.java
// 작성자: 정준영
// 작성일: 2024-11-28
// 내용: 시카고 치즈 피자를 구현한 클래스
//***************************

public class ChicagoCheesePizza extends Pizza {
	public ChicagoCheesePizza() { 
		name = "Chicago Style Deep Dish Cheese Pizza";
		dough = "Extra Thick Crust Dough";
		sauce = "Plum Tomato Sauce";
	}
 
	@Override
	public void cut() {
		System.out.println("Cutting the pizza into square slices");
	}

}
