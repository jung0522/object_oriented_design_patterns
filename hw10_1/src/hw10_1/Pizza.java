//***************************
// 파일명: Pizza.java
// 작성자: 정준영
// 작성일: 2024-11-21
// 내용: 기본 피자를 나타내는 클래스
//***************************

package hw10_1;

// AbstractPizza(추상 클래스)를 상속 받는다
class Pizza extends AbstractPizza {
	
	// 기존과 동일
    private int size;
    private String name;
    private int price;
    
    public Pizza(int size) {
        this.size = size;
        name = "피자";
        price = 20000;
    }
    
    public String getName() {
        return name;
    }
    
    public int getSize() {
        return size;
    }
    
    public int getPrice() {
        return price;
    }
}