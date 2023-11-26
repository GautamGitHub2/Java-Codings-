package CoreJavaHandsOn;

import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {

        // How to declare array list

        // ArrayList list = new ArrayList(); // we can store any type of element

        ArrayList<String> sList = new ArrayList<String>();

        ArrayList<Integer> iList = new ArrayList<Integer>();

        // Adding values to array list

        sList.add("Gautam");
        sList.add("Nitoo");
        sList.add("Raj");
        sList.add("Manu");
        sList.add("Appu");

        iList.add(2);
        iList.add(4);
        iList.add(6);
        iList.add(7);

        // Size of Arraylist
        System.out.println(sList.size());// 5t

        // Remove an element
        iList.remove(3);

        System.out.println(iList);// [2, 4, 6]
        System.out.println(iList.size());// 3
        System.out.println(sList);// [Gautam, Nitoo, Raj, Manu, Appu]

        // insert an element
        sList.add(2, "Tom");
        System.out.println(sList); // [Gautam, Nitoo, Tom, Raj, Manu, Appu]

        sList.add(5, "Purushottam");
        System.out.println(sList); // [Gautam, Nitoo, Tom, Raj, Manu, Purushottam, Appu]

        // After adding size
        System.out.println(sList.size());// 7

        // Read values from array list using for loop

        for (Object s : sList) { // here 'Object' means it will accept all types of object values Interger and
                                 // String and others as well if that is avaluable in Array List
                                 // Object type variable can hold any type of values
            System.out.println(s);

            // Output:
            /*
             * Gautam
             * Nitoo
             * Tom
             * Raj
             * Manu
             * Purushottam
             * Appu
             */
        }

    }

}
