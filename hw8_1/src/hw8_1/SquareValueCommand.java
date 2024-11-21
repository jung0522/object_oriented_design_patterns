package hw8_1;

//***************************
//파일명: SquareValueCommand.java
//작성자: 정준영
//작성일: 2024-11-06
//내용: 제곱 명령 클래스
//***************************

public class SquareValueCommand implements Command {
	
	private final int a;
	private final int b;
	
	public SquareValueCommand(int a) {
		this.a = a;
		this.b = 2;
		
	}
	
	@Override
	public void execute() {
		// 제곱 연산 수행
		int c = (int)Math.pow(a, b);
		System.out.println("pow(" + a + ", " + b + ") = " + c);
		
	}

}
