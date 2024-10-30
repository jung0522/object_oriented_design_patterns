//***************************
//파일명: SLEEPING.java
//작성자: 정준영
//작성일: 2024-10-29
//내용: SLEEPING 클래스 - "취침등" 상태(SLEEPING)를 추가
//***************************

package hw7_1;

//SLEEPING 상태
//"취침등" 상태(SLEEPING)를 추가
public class SLEEPING implements LightState {
public void on_button_pushed(Light light) {
   // SLEEPING 상태에서 on 버튼을 눌렀을 때
   System.out.println("취침등 상태");
   light.setState(new ON()); // ON 상태로 전환
   System.out.println("Light On Back!!");
}

public void off_button_pushed(Light light) {
   // SLEEPING 상태에서 off 버튼을 눌렀을 때 OFF 상태로 전환
   System.out.println("Light Off!!");
   light.setState(new OFF());
}
}