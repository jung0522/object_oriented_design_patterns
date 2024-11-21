//***************************
//파일명: DigitObserver.java
//작성자: 정준영
//작성일: 2024-11-12
//내용:  Observer 인터페이스를 구현한 구체적인 관찰자(수로 표시)
//***************************

public class DigitObserver implements Observer {
	  public void update(Subject generator) {
	    System.out.println("DigitObserver:" + generator.getNumber());

	  }
	}

/*
Observer 인터페이스를 구현한 구체적인 관찰자
관찰한 수를 ‘숫자’로 표시
*/