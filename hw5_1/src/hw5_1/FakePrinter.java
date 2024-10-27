package hw5_1;

//***************************
//파일명: FakePrinter.java
//작성자: 정준영
//작성일: 2024-10-08
//내용: 가짜 프린터기 클래스
//**************************
public class FakePrinter implements ReceiptPrinter {
   
	@override
    public void print(StringBuffer buf) {
        System.out.println("fake Print");
        System.out.println(buf);
    }
}
