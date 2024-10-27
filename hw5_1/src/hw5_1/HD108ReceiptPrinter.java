package hw5_1;

//***************************
//파일명: HD108ReceiptPrinter.java
//작성자: 정준영
//작성일: 2024-10-08
//내용: 진짜 프린터기 클래스
//**************************

public class HD108ReceiptPrinter implements ReceiptPrinter {
	public void print(StringBuffer buf) {

        System.out.println("Real Print");	
		System.out.println(buf);	
	}
}
