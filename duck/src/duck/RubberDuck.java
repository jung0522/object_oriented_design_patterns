package duck;

//RubberDuck 클래스는 Duck 인터페이스를 구현
public class RubberDuck implements Duck {
@Override
public void fly() {
   System.out.println("I can't fly.");
}
}
