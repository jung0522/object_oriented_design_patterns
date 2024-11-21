//***************************
// 파일명: AbstractPizza.java
// 작성자: 정준영
// 작성일: 2024-11-21
// 내용: 피자의 추상 클래스로 모든 피자가 구현해야 하는 메서드를 정의
//***************************

package hw10_1;

abstract class AbstractPizza {
    public abstract String getName(); 
    public abstract int getPrice();   
    public abstract int getSize();    
}
