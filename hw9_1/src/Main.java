//***************************
//파일명: Main.java
//작성자: 정준영
//작성일: 2024-11-12
//내용:  IncrementGenerator를 테스트
//***************************

public class Main {
    public static void main(String[] args) {
    	System.out.println("hw9_1: 정준영");
    	
    	// Subject generator = new RandomGenerator();

        // 과제 내용대로 주석 제거하고 초기값, 최종갑, 증가값 세개의 인자를 받는 generator 생성
        Subject generator = new IncrementGenerator(10, 40, 4);
 
        // 옵저버들 생성
        Observer observer1 = new DigitObserver();
        Observer observer2 = new GraphObserver();

        // 옵저버들을 generator에 등록
        generator.addObserver(observer1);
        generator.addObserver(observer2);

        // 숫자 생성 및 알림 실행해 과제 결과를 만족하게 만듦
        generator.execute();
    }
}
