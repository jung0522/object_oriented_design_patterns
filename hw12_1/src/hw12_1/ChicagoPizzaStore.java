package hw12_1;

//***************************
// 파일명: ChicagoPizzaStore.java
// 작성자: 정준영
// 작성일: 2024-11-28
// 내용: Chicago 스타일 피자 매장을 구현한 클래스
//      이 클래스는 팩토리 메서드를 오버라이드하여 
//		Chicago 스타일 피자를 생성한다
//***************************

public class ChicagoPizzaStore extends PizzaStore {
	
    // ChicagoPizzaStore에서 고유한 피자 객체를 생성하는 팩토리 메소드
    // Chicago 스타일의 치즈와 페페로니 피자만 만들 수 있도록 오버라이딩해서 구현
    @Override
    Pizza createPizza(String item) {
    	// 피자의 종류에 따라 Chicago 스타일 피자를 생성
        if (item.equals("cheese")) { 
            return new ChicagoCheesePizza();  // Chicago 치즈 피자
        } else if (item.equals("pepperoni")) {
            return new ChicagoPepperoniPizza();  // Chicago 페페로니 피자
        } else {
            return null; // 잘못된 주문 처리
        }
    }
}
