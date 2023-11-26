package CoreJavaHandsOn;

public class StringMethods {
    public static void main(String[] args) {

        String s= "Gatuam";
        System.out.println(s.length()); //6


        String s0="Hello";
        String s1="  Gautam Kumar   ";
        System.out.println(s1);//  Gautam Kumar   
        System.out.println(s1.trim());//Gautam Kumar // trim() removes spaces before and after the sentence but keeps space in-between

        System.out.println(s0.concat(s1)); //Hello  Gautam Kumar

        System.out.println(s.charAt(4));//a

        String s2="WelcomeIndia";
        System.out.println(s2.contains("India"));//true
        System.out.println(s2.contains("Wel"));//true
        System.out.println(s2.contains("come"));//true
        System.out.println(s2.contains("Come"));//false
        System.out.println(s2.contains("wel"));//false

        System.out.println("***** Equals Method ****");

        System.out.println(s2.equals("welcomeindia"));//false
        System.out.println(s2.equals("welcomeIndia"));//false
        System.out.println(s2.equals("Welcomeindia"));//false
        System.out.println(s2.equals("WelcomeToIndia"));//false
        System.out.println(s2.equals("WelcomeIndia"));//true

        System.out.println(s2.equals("Welcome"));//false
        System.out.println(s2.equals("Welcome India"));//false
        System.out.println(s2.equals(" Welcome India "));//false
        
        System.out.println("***** Equals Ignore Case ****");

        String s3="gautam kumar";
        System.out.println(s3.equalsIgnoreCase(s3)); // true

        String s4="gautam KUMAR";
        System.out.println(s3.equalsIgnoreCase("Kumar GAUTAM")); // FALSE

        String s5="gautam kumar";
        System.out.println(s3.equalsIgnoreCase("gautam KUMAR")); // true

        String s6="gautam kumar";
        System.out.println(s3.equalsIgnoreCase("GAUTAM kumar")); // true

        System.out.println("*** Replace Method ***");

        String s7="gautam ";
        System.out.println(s7.replace('a','o')); // gautom

        String s8="Hi, Gautam Kumar";
        System.out.println(s8.replace("Hi","Hello"));//Hello, Gautam Kumar

        
        
        
    }
    
}
