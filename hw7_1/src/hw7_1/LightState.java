//***************************
//파일명: LightState.java
//작성자: 정준영
//작성일: 2024-10-29
//내용: LightState 인터페이스 - 상태 인터페이스
//***************************

package hw7_1;

//상태 인터페이스 정의
interface LightState {
	
 // 버튼이 눌렸을 때
 public void on_button_pushed(Light light);
 // 버튼이 꺼졌을 때
 public void off_button_pushed(Light light);
}
