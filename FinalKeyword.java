package CoreJavaHandsOn;

public class FinalKeyword {

    final int speed=40; // this can be changed because this is not final, and if i have marked it as as final and try to change the values of speed with the help of class object ref. variable then it will five compile-time error

    public static void main(String[] args) {

        FinalKeyword fKeyword=new FinalKeyword();
        //fKeyword.speed=100; //cannot assign a value to final variable speed
        System.out.println(fKeyword.speed); //100 (before final), 40 (after final) 
    }    
}
