package hw12_1;

//***************************
// 파일명: ChicagoPepperoniPizza.java
// 작성자: 정준영
// 작성일: 2024-11-28
// 내용: 시카고 페페로니 피자를 구현한 클래스
//***************************

public class ChicagoPepperoniPizza extends Pizza {
	public ChicagoPepperoniPizza() {
		name = "Chicago Style Pepperoni Pizza";
		dough = "Extra Thick Crust Dough";
		sauce = "Plum Tomato Sauce";
 
	}
 
	@Override
	public void cut() {
		System.out.println("Cutting the pizza into square slices");
	}

}
