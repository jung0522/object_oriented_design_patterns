package hw5_1;

//***************************
//파일명: Item.java
//작성자: 정준영
//작성일: 2024-10-08
//내용: 아이템(상품) 클래스
//**************************

public class Item {
    private String name;
    private int price;

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }
}