package hw8_1;

//***************************
//파일명: AddValueCommand.java
//작성자: 정준영
//작성일: 2024-11-06
//내용: 덧셈 명령 클래스
//***************************

public class AddValueCommand implements Command {
	
	private final int a;
	private final int b;
	
	 public AddValueCommand(int a, int b) {
	        this.a = a;
	        this.b = b;
	    }
	 
	 @Override
	 public void execute() {
		// 뎃셈 연산 수행
		 System.out.println(a + " + " + b + " = " + (a + b));
		 
	 }
	 

}
