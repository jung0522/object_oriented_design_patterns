//***************************
//파일명: OFF.java
//작성자: 정준영
//작성일: 2024-10-29
//내용: OFF 클래스 
//***************************

package hw7_1;

//OFF 상태
public class OFF implements LightState {
 public void on_button_pushed(Light light) {
     // OFF 상태에서 on 버튼을 눌렀을 때 SLEEPING 상태로 전환
     System.out.println("Light On!!");
     light.setState(new SLEEPING()); // SLEEPING 상태로 전환
 }

 public void off_button_pushed(Light light) {
     // OFF 상태에서 off 버튼을 눌렀을 때의 반응
     System.out.println("반응 없음");
     light.setState(new OFF());
 }
}