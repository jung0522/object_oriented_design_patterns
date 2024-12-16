package hw14_1;

//***************************
// 파일명: Component.java
// 작성자: 정준영
// 작성일: 2024-12-03
// 내용: Composite Pattern을 위한 추상 클래스
//***************************


public abstract class Component {
    String name;   // 파일 또는 디렉토리 이름
    int depth = 0; // 깊이 (디렉토리 내 위치)

    // 생성자: 이름을 받아 설정
    public Component(String name) {
    this.name = name;
    }
    
  

    // 자식 클래스에서 구현할 추상 메소드
    public abstract int getSize();  // 크기를 계산하는 메소드
    public abstract void print();   // 정보를 출력하는 메소드

    // 깊이를 설정하는 메소드
    public void setDepth(int depth) {
        this.depth = depth;
    }

    // 이름을 반환하는 메소드

    public String getName() {
        return name;
    }
}
