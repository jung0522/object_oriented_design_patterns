//***************************
//파일명: IncrementGenerator.java
//작성자: 정준영
//작성일: 2024-11-12
//내용:  Subject의 하위 클래스 IncrementGenerator 생성 
//***************************


// Random 숫자를 생성하는 RandomGenerator 대신에
// Subject 클래스를 상속받아 수가 점점 증가하는 기능이 있는 IncrementGenerator를 생성

public class IncrementGenerator extends Subject {
	// 초기값, 최종값, 증가값
    private int number;
    private int end;
    private int increment;

    // 생성자: 초기값, 최종값, 증가값을 받아서 필드의 값에 저장
    public IncrementGenerator(int start, int end, int increment) {
   
        this.number = start;
        this.end = end;
        this.increment = increment;
    }

    // 숫자를 반환하는 메소드
    public int getNumber() {
        return number;
    }

    // 숫자를 증가시키며 Observer들에게 알림
    public void execute() {
        while (number <= end) {
            notifyObservers();  // 숫자가 갱신되었음을 알림
            number += increment; // 증가값을 더함
        }
    }
}
