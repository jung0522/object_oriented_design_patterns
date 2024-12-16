package hw12_1;

//***************************
// 파일명: PizzaStore.java
// 작성자: 정준영
// 작성일: 2024-11-28
// 내용: 피자 주문을 처리하는 기본 클래스. 
//      팩토리 메소드 패턴을 적용하여 피자의 제조 스타일에 따라
//      적합한 피자를 생성하는 메서드를 구현하는 추상 클래스
//***************************

public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type); // 팩토리 메소드
        System.out.println("--- Making a " + pizza.getName() + " ---");

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    // 각 Store에서 고유의 피자 객체를 생성하는 팩토리 메서드
    // 하위 클래스(ChicagoPizzaStore or NYPizzaStore)에서 이 팩토리 메서드를 구현
    abstract Pizza createPizza(String item);
}
