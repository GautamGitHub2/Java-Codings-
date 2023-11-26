package CoreJavaHandsOn;

interface Aa1 {
    int a = 100;
    int b = 200;

    void add();
}

interface Bb1 {
    int x = 400;
    int y = 500;

    void mul();
}

public class InterfaceAssignment2 implements Aa1, Bb1 {

    public void add() {
        System.out.println(a + b);
    }

    public void mul() {
        System.out.println(x * y);
    }

    public static void main(String[] args) {

        InterfaceAssignment2 is2 = new InterfaceAssignment2();
        is2.add();// 300
        is2.mul();// 200000

        Aa1 aa1 = new InterfaceAssignment2();
        aa1.add();// 300

        Bb1 bb1 = new InterfaceAssignment2();
        bb1.mul();// 200000

    }

}
