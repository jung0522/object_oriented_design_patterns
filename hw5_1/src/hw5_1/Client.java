package hw5_1;

//***************************
//파일명: Client.java
//작성자: 정준영
//작성일: 2024-10-08
//내용: 클라이언트 클래스
//**************************

public class Client {
    public static void main(String[] args) {
        System.out.println("hw5_1: 정준영");

        Item item1 = new Item("Shampoo", 3000);
        Item item2 = new Item("Cookie", 1000);
        
        // 실제 프린터 
        Sale sale = new Sale(new HD108ReceiptPrinter());
        sale.add(item1);
        sale.add(item2);
        sale.printReceipt();

        // 가짜 프린터
        sale.setReceiptPrinter(new FakePrinter());
        sale.printReceipt();
    }
}