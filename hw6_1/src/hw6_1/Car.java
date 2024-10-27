package hw6_1;

//***************************
//파일명: Car.java
//작성자: 정준영
//작성일: 2024-10-15
//내용: 자동차 클래스
//***************************

public class Car {
 private int carNum; // 자동차 번호, 문제 조건에 맞게(carNum) 필드만 구현)

 public Car(int carNum) {
     this.carNum = carNum; // 생성자에서 자동차 번호 초기화
 }

 public int getCarNum() {
     return carNum; // 자동차 번호 반환
 }
}

