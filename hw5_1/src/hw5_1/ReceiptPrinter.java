package hw5_1;

//***************************
//파일명: ReceiptPrinter.java
//작성자: 정준영
//작성일: 2024-10-08
//내용: ReceiptPrinter 인터페이스
//**************************

// ReceiptPrinter 인터페이스를 통해 Strategy Pattern 적용
// 인터페이스를 통해 진짜 프린터기랑 가짜 프린터기로 나눔
public interface ReceiptPrinter {
    void print(StringBuffer buf);
}
