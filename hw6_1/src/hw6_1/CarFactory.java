package hw6_1;

//***************************
// 파일명: CarFactory.java
// 작성자: 정준영
// 작성일: 2024-10-15
// 내용: 자동차 공장 클래스 (싱글턴 패턴)
//***************************

public class CarFactory {
    private static CarFactory instance; // 정적 싱글턴 인스턴스 선언
    private int carCount = 10000; // 자동차 번호 초기값 
                                  // createCar() 자동차를 만들 때 
                                  // 자동차 번호가 10001부터 시작된다 하였으므로


    // 싱글턴 인스턴스를 반환하는 메서드 
    // synchronized를 통해 동시에 여러 스레드가 접근하더라도 인스턴스가 한 번만 생성되도록 보장한다
    public static synchronized CarFactory getInstance() {
        if (instance == null) {
            instance = new CarFactory(); // 인스턴스가 없을 경우 생성
            
        }
        return instance;
    }

    // 자동차를 생성하는 메서드
    public Car createCar() {
        carCount++; // 자동차 번호 증가
        return new Car(carCount); // 새로운 자동차 객체 반환
    }
}
