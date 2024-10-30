//***************************
//파일명: Client.java
//작성자: 정준영
//작성일: 2024-10-29
//내용: Client 클래스
//***************************

package hw7_1;

public class Client {
    public static void main(String[] args) {
        System.out.println("hw7_1: 정준영"); // 과제명과 본인의 이름을 맨 처음 출력

        Light light = new Light();
        light.on_button_pushed(); // Light On!!
        light.on_button_pushed(); // 취침등 상태
                                  // Light On Back!!
        light.off_button_pushed(); // Light Off!!
        light.on_button_pushed(); // Light On!!
    }
}
