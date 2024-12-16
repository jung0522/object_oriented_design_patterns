package hw14_1;

//***************************
//파일명: Directory.java
//작성자: 정준영
//작성일: 2024-12-03
//내용: 디렉토리를 나타내는 클래스, Component를 상속받음
//***************************

import java.util.ArrayList;
import java.util.List;

public class Directory extends Component {
 
 // 디렉토리 내의 항목들을 저장할 리스트
 private List<Component> entries = new ArrayList<>();

 // 생성자: 디렉토리 이름을 설정
 public Directory(String name) {
     super(name);  // 부모 클래스인 Component의 생성자를 호출하여 이름 설정
 }

 // 디렉토리에 항목을 추가하는 메서드
 public void addEntry(Component entry) {
     entries.add(entry);  // 항목 추가
     entry.setDepth(depth + 1);  // 항목의 깊이를 현재 디렉토리 깊이 + 1로 설정
 }

 // 디렉토리에서 항목을 제거하는 메서드
 public void removeEntry(Component entry) {
     entries.remove(entry);  // 항목 제거
 }

 // 디렉토리의 크기를 계산하는 메서드
 @Override
 public int getSize() {
     int size = 0;  // 디렉토리 크기 초기화
     // 디렉토리 내의 모든 항목의 크기를 합산
     for (Component entry : entries) {
         size += entry.getSize();
     }
     return size;  // 최종 크기 반환
 }

 // 디렉토리와 그 안의 항목들을 출력하는 메서드
 @Override
 public void print() {
     // 현재 디렉토리의 깊이를 기반으로 출력
     for (int i = 0; i < depth; i++) {
         System.out.print("\t");
     }
     // 디렉토리 이름과 크기 출력
     System.out.println("[Directory] " + name + ", Size: " + getSize());

     // 디렉토리 내 항목들의 정보 출력
     for (Component entry : entries) {
         entry.print();  // 항목의 print() 메서드 호출
     }
 }
}
