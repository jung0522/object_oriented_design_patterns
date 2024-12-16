package hw14_1;

//***************************
//파일명: File.java
//작성자: 정준영
//작성일: 2024-12-03
//내용: 파일을 나타내는 클래스, Component를 상속받음
//***************************

public class File extends Component {
 private int size;  // 파일 크기
 

 // 생성자: 파일 이름과 크기를 받아 설정
 public File(String name, int size) {
     super(name);  // 부모 클래스의 생성자 호출
     this.size = size;  // 파일 크기 설정
 }

 // 파일 크기 반환
 @Override
 public int getSize() {
     return size;
 }

 // 파일 정보를 출력 
 @Override
 public void print() {
     for (int i = 0; i < depth; i++) {  // 깊이만큼 탭 추가
         System.out.print("\t");
     }
     System.out.println("[File] " + name + ", Size: " + size);  // 파일 이름과 크기 출력
 }
}
