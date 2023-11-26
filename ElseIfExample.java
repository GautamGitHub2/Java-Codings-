package CoreJavaHandsOn;

public class ElseIfExample {

    public static void main(String[] args) {

        int weekDayNumber = 6;

        if (weekDayNumber == 1) {
            System.out.println("Sunday");
        } else if (weekDayNumber == 2) {
            System.out.println("Monday");
        } else if (weekDayNumber == 3) {
            System.out.println("Tuesday");
        } else if (weekDayNumber == 4) {
            System.out.println("Wednesday");
        } else if (weekDayNumber == 5) {
            System.out.println("Thursday");
        } else if (weekDayNumber == 6) {
            System.out.println("Friday");
        } else if (weekDayNumber == 7) {
            System.out.println("Saturday");
        } else {
            System.out.println("Invalid Week Day No.");
        }

    }

}
