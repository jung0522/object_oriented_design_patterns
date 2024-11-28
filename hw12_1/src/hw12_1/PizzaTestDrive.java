package hw12_1;

//***************************
//파일명: PizzaTestDrive.java
//작성자: 정준영
//작성일: 2024-11-28
//내용: Factory Method 패턴을 적용한 피자 가게 시뮬레이션
//***************************


public class PizzaTestDrive {

	public static void main(String[] args) {
	
//		PizzaStore store = new PizzaStore();
//
//		Pizza pizza = store.orderPizza("cheese");
//		System.out.println("We ordered a " + pizza.getName() + "\n");
//
// 
//		pizza = store.orderPizza("pepperoni");
//		System.out.println("We ordered a " + pizza.getName() + "\n");

		
		
		
		 // 뉴욕 스타일 피자 가게 생성
		PizzaStore nyStore = new NYPizzaStore();
		// 시카고 스타일 피자 가게 생성
		PizzaStore chicagoStore = new ChicagoPizzaStore();
 
		// 뉴욕 스타일 치즈 피자 주문 및 결과 출력
		Pizza pizza = nyStore.orderPizza("cheese");
		System.out.println("we ordered a " + pizza.getName() + "\n");
 
		// 시카고 스타일 치즈 피자 주문 및 결과 출력
		pizza = chicagoStore.orderPizza("cheese");
		System.out.println("we ordered a " + pizza.getName() + "\n");

		 // 뉴욕 스타일 페퍼로니 피자 주문 및 결과 출력
		pizza = nyStore.orderPizza("pepperoni");
		System.out.println("we ordered a " + pizza.getName() + "\n");
 
		// 시카고 스타일 페퍼로니 피자 주문 및 결과 출력
		pizza = chicagoStore.orderPizza("pepperoni");
		System.out.println("we ordered a " + pizza.getName() + "\n");

		
		 
		
	}

}

