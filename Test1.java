package CoreJavaHandsOn;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public  class Test1 {
    public static void main(String args[]) {
        int[]  a =new int [10];
        a[0]=1;
        a[1]=5;
        a[2]=6;
        a[3]=8;
        a[4]=4;

        System.out.println(a[2]);
        System.out.println(a[3]);
        System.out.println(a[4]);
        System.out.println(a[1]);

       String[] s = new String[5];

       s[0]="Gautam";
       s[4]="Gautam";

       System.out.println(s[1]);
       System.out.println(s[2]);

       // Array List Derived class for String

        ArrayList<String> als=new ArrayList<String>();

        als.add(0,"gautam");
        als.add(1,"kumar");
        als.add(2,"manu");
        als.add(3,"appu");
        als.add(4,"gautam");
        
        Collections.sort(als);
        als.contains(als);
        als.size();
        System.out.println(als.size());
        
        System.out.println(als.indexOf(2));

        // Array List for all types of datatypes "heterogeneous "
        
        ArrayList al= new ArrayList();

        al.add(100);
        al.add("Gautam Kumar");
        al.add(15.2);
        al.add('A');
        al.add(true);

        System.out.println(al);
        System.out.println("Number of Elements in array list:"+al.size());
        al.remove(1);
        //al.remove("Gautam Kumar");
        System.out.println("After removing element from array list:"+al);

        //insert new element
        al.add(2,"Manu");
        al.add(4,"Appu");
        System.out.println(al);

        System.out.println(al.get(2));
        al.set(2,"Java");
        System.out.println("After setting new value at index 2:"+al);

        //Contains

        System.out.println(al.contains("Java"));
        System.out.println(al.contains(2));

        //Empty
        System.out.println(al.isEmpty());

        //for each loop

        System.out.println("Reading elements using for each loop....");

        for(Object e:al)
        {
            System.out.println(e);
        }

        // Iterator Method

        System.out.println("Reading elements using iterator method...");

        Iterator it=al.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());

        }

        // Another methods of ArrayList

        ArrayList al1=new ArrayList();

        al1.add("X");
        al1.add("Y");
        al1.add("Z");
        al1.add("A");
        al1.add("B");
        al1.add("C");

        ArrayList al2=new ArrayList();

        al2.addAll(al1);

        System.out.println("the elements from al2 ArrayList:"+al2);

        al2.removeAll(al1);
        System.out.println("After removing all al1 elements from al2:"+al2);

        // Sort
        System.out.println("the elements from al1 ArrayList:"+al1);

        Collections.sort(al1);
        System.out.println("After sorting the elements from al1 ArrayList:"+al1);

        Collections.sort(al1, Collections.reverseOrder());
        System.out.println("After reverse order:"+al1);

        //Shuffling -- collections.shuffle

        Collections.shuffle(al1);
        System.out.println("After shuffling"+al1);

        // Q. how to convert an array to the array list?

        String arr[]={"Gautam","Kumar","Manu","Appu"};
        System.out.println("An Array values are:");
        for(String value:arr)
        {
            System.out.println(value);
        }
        ArrayList al3=new ArrayList(Arrays.asList(arr));
        System.out.println("After converting an Array to the ArrayList"+al3);














        
      

       

    }
}
