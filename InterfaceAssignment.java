package CoreJavaHandsOn;

interface Assignment {
    int a = 10;
    int b = 20;

    void sum();
}

public class InterfaceAssignment implements Assignment {

    public void sum() {
        System.out.println(a + b);
    }

    public static void main(String[] args) {

        InterfaceAssignment ia = new InterfaceAssignment();
        ia.sum(); // 30

        Assignment as = new InterfaceAssignment();
        as.sum(); // 30

    }

}
