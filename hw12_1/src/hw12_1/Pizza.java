package hw12_1;

//***************************
// 파일명: Pizza.java
// 작성자: 정준영
// 작성일: 2024-11-28
// 내용: 피자의 기본 클래스. 피자의 이름, 도우, 소스 등의 속성을 정의하고,
//       준비, 굽기, 자르기, 포장 등의 메서드를 제공한다.
//       팩토리 메서드를 통해 생성된 피자 객체는 이 클래스를 상속받는다.
//***************************

public abstract class Pizza {
    String name;
    String dough;
    String sauce;

    public String getName() {
        return name;
    }

    public void prepare() {
        System.out.println("Preparing " + name);
    }

    public void bake() {
        System.out.println("Baking " + name);
    }

    public void cut() {
        System.out.println("Cutting " + name);
    }

    public void box() {
        System.out.println("Boxing " + name);
    }

    public String toString() {
        StringBuffer display = new StringBuffer();
        display.append("---- " + name + " ----\n");
        display.append(dough + "\n");
        display.append(sauce + "\n");
        return display.toString();
    }
}
