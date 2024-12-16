//***************************
// 파일명: ToppingDecorator.java
// 작성자: 정준영
// 작성일: 2024-11-21
// 내용: 데코레이터 패턴을 위한 추상 클래스
//***************************
package hw10_1;

// AbstractPizza(추상 클래스)를 상속 받는다.
class ToppingDecorator extends AbstractPizza {
    
	// 데코레이팅할 피자 객체
    protected AbstractPizza pizza;
    
    // 생성자: 기존 피자 객체를 받음
    public ToppingDecorator(AbstractPizza pizza) {
        this.pizza = pizza;
    }

    public String getName() {
        return pizza.getName();
    }
    
    public int getSize() {
        return pizza.getSize();
    }
    
    public int getPrice() {
        return pizza.getPrice();
    }
}