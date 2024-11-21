
//***************************
// 파일명: MainUsingPizza.java
// 작성자: 정준영
// 작성일: 2024-11-21
// 내용: 데코레이터 패턴을 활용한 피자 프로그램 실행
//***************************

package hw10_1;

 
import java.util.ArrayList;
import java.util.List;

class MainUsingPizza {
    public static void main(String[] args) {
    	// 과제명과 본인의 이름을 맨 처음 출력
    	System.out.println("hw10_1 : 정준영");
    	
    	ArrayList<String> list = new ArrayList<String>();
    	// 출력: 피자: 페퍼로니 치즈 피자, 크기: 15, 가격: 28000을 위해 add 순서 변경
        list.add("Cheese");
        list.add("Pepperoni");
    
        // SelectToppingPizza pizza = new SelectToppingPizza(15); 주석 처리
        AbstractPizza pizza = new Pizza(15); // 주석 해제

        // 페페로니와 치츠만 구현
        
        for (String topping : list) {
//            pizza.addTopping(topping);  // 주석 처리
        	
            // 주석 해제
            if (topping.equals("Cheese")) {
                pizza = new CheeseToppingDecorator(pizza);
            }
            else if (topping.equals("Pepperoni")) {
                pizza = new PepperoniToppingDecorator(pizza);
            }
            
        	

        }
        System.out.printf("피자: %s, 크기: %d, 가격: %d\n", pizza.getName(), pizza.getSize(), pizza.getPrice());
    }
}
