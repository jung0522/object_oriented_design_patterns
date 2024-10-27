// Duck 인터페이스 선언
package duck;

public interface Duck { 
   void fly(); // fly 메서드를 인터페이스에 선언
}





// 메인 클래스
public class DuckTest { 
    public static void main(String[] args) {
        Duck d1 = new RedHeadDuck(); 
        d1.fly();  // RedHeadDuck는 날 수 있으므로 "flying"이 출력됨.
 
        Duck d2 = new RubberDuck(); 
        d2.fly();  // RubberDuck는 날 수 없으므로 "I can't fly"가 출력됨.
    }
}
