package hw8_1;

//***************************
//파일명: Main.java
//작성자: 정준영
//작성일: 2024-11-05
//내용: 명령 패턴 실행
//***************************

// Main 실행시 결과 CommandManager에 객체를 추가하고 실행하는 Main 클래스 구현
public class Main {
 public static void main(String[] args) {
     System.out.println("hw8_1 : 정준영");

     CommandManager mgr = new CommandManager();
     
     // Command 패턴: 각 연산을 별도의 명령 객체로 생성하여 CommandManager에 추가
     mgr.addOperation(new AddValueCommand(2, 3));       // 덧셈 명령 추가
     mgr.addOperation(new SubtractValueCommand(2, 3));  // 뺄셈 명령 추가
     mgr.addOperation(new SquareValueCommand(3));       // 제곱 명령 추가

     // 추가된 산술 연산 실행    
     mgr.performOperations(); 
 }
}
