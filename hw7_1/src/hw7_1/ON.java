//***************************
//파일명: ON.java
//작성자: 정준영
//작성일: 2024-10-29
//내용: ON 클래스 
//***************************
package hw7_1;

//ON 상태
public class ON implements LightState {
 public void on_button_pushed(Light light) {
     // ON 상태에서 on 버튼을 눌렀을 때의 반응
     System.out.println("반응 없음");
 }

 public void off_button_pushed(Light light) {
     // OFF 상태로 전환
     System.out.println("Light Off!!");
     light.setState(new OFF());
 }
}