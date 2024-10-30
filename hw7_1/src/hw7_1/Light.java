//***************************
//파일명: Light.java
//작성자: 정준영
//작성일: 2024-10-29
//내용: Light 클래스 구현 - 취침등 상태 포함
//***************************

package hw7_1;

// Light 클래스 - 현재 상태를 관리
// 스테이트 패턴을 적용 - 현재 상태에 따라 결과를 반환한게 만듦
public class Light {
    private LightState state; // 현재 상태를 저장

    // 초기 상태를 OFF로 설정
    public Light() {
        state = new OFF();
    }

    // 상태 변경 메서드
    public void setState(LightState state) {
        this.state = state; // 새로운 상태로 전환
    }

    // on 버튼 눌림 처리
    public void on_button_pushed() {
        state.on_button_pushed(this); // 현재 상태에 따라 처리
    }

    // off 버튼 눌림 처리
    public void off_button_pushed() {
        state.off_button_pushed(this); // 현재 상태에 따라 처리
    }
    
    
}
