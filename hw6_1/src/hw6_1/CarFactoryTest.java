package hw6_1;

//***************************
//파일명: CarFactoryTest.java
//작성자: 정준영
//작성일: 2024-10-15
//내용: CarFactory와 Car 클래스 테스트
//***************************

public class CarFactoryTest {

 public static void main(String[] args) {
	 System.out.println("hw6_1: 정준영"); // 문제 조건에 맞게 첫 줄에 과제이름과 이름 출력

     CarFactory factory = CarFactory.getInstance(); // 싱글턴 패턴 사용

     Car myCar = factory.createCar(); // 메서드에서 Car 생성
     Car yourCar = factory.createCar();

     System.out.println(myCar.getCarNum()); // 10001 출력
     System.out.println(yourCar.getCarNum()); // 10002 출력
 }
}
