//***************************
// 파일명: PepperoniToppingDecorator.java
// 작성자: 정준영
// 작성일: 2024-11-21
// 내용: 페퍼로니 토핑 데코레이터 클래스
//***************************

package hw10_1;

//ToppingDecorator(추상 클래스)를 상속 받는다.
class PepperoniToppingDecorator extends ToppingDecorator {
    public PepperoniToppingDecorator(AbstractPizza pizza) {
        super(pizza); // 기존 피자 객체 전달
    }

    @Override
    public String getName() {
        return "페퍼로니 " + super.getName();  // 페퍼로니 이름 추가
    }

    @Override
    public int getPrice() {
        return super.getPrice() + ToppingsPrice.PEPPERONI; // // 페퍼로니 가격 추가
    }
}
