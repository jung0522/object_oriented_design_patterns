package hw5_1;

//***************************
//파일명: Sale.java
//작성자: 정준영
//작성일: 2024-10-08
//내용: Sale 클래스 
//**************************
import java.util.ArrayList;
import java.util.Iterator;

public class Sale {
    private ArrayList<Item> items = new ArrayList<Item>();
    private ReceiptPrinter printer; // 프린터 전략

    public Sale(ReceiptPrinter printer) {
        this.printer = printer; // 초기 프린터 전략 주입
    }

    // 영수증 프린터 설정 메서드 
    public void setReceiptPrinter(ReceiptPrinter printer) {
        this.printer = printer;
    }

    public void printReceipt() {
        Iterator<Item> itr = items.iterator();
        StringBuffer buf = new StringBuffer();
        while (itr.hasNext()) {
            Item item = itr.next();
            buf.append(item.getName());
            buf.append(item.getPrice());
        }
        printer.print(buf); // 전략에 따라 프린트
    }

    public void add(Item item) {
        items.add(item);
    }
}