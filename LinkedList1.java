package CoreJavaHandsOn;
import java.util.*;
public class LinkedList1 {
    public static void main(String [] args) {
        
        // Declare Linked List
       // LinkedList <Integer> llI1=new LinkedList <Integer>();
        //LinkedList <String> llS1=new LinkedList <String>();

        LinkedList ll=new LinkedList();

        ll.add(100);
        ll.add("Gautam");
        ll.add(100.44);
        ll.add('A');
        ll.add(true);
        ll.add(null);

        System.out.println(ll);
        System.out.println("Size of the Linked List is:"+ll.size());

        //remove 
        ll.remove(2);
        System.out.println(ll);

        //insert element in the middle of the LinkedList

        ll.add(4,"Test");
        System.out.println(ll);

        //Retrieving value / object from Linked List
        System.out.println("The element at the index 3rd is:"+ll.get(3));

        //set value
        System.out.println("After changing the value at the 1st index:"+ll.set(1,"Kumar"));
        System.out.println(ll);

        //Contains
        System.out.println(ll.contains("Java"));
        System.out.println(ll.contains("Kumar"));

        //Is Empty
        System.out.println(ll.isEmpty());

        //Reading the element from LL using For Each Loop

        for(Object e:ll)
        {
            System.out.println(e);
        }

        //Iterator() Method
        Iterator it=ll.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }

        // Another Linked List

        LinkedList ll1=new LinkedList();

        ll1.add("X");
        ll1.add("Y");
        ll1.add("Z");
        ll1.add("A");
        ll1.add("B");
        ll1.add("C");

        LinkedList ll2=new LinkedList();

        //addAll

        ll2.addAll(ll1);
        System.out.println(ll2);

        //removeAll
        ll2.removeAll(ll1);
        System.out.println(ll2);

        //addAll

        ll2.addAll(ll1);
        System.out.println(ll2);

        //retain all

        ll2.retainAll(ll1);
        System.out.println(ll2);

        //sort
        Collections.sort(ll1);
        System.out.println(ll1);

        //reverse Order
        Collections.reverse(ll2);
        System.out.println(ll2);

        Collections.reverse(ll1);
        System.out.println(ll1);

        //Shuffle
        Collections.shuffle(ll2);
        System.out.println(ll2);

        Collections.shuffle(ll1);
        System.out.println(ll1);

        LinkedList ll3=new LinkedList();

        ll3.add("Gautam");
        ll3.add("Kumar");
        ll3.add("John");
        ll3.add("Don");
        ll3.add("Tom");
        ll3.add("Manu");

        System.out.println(ll3);

        ll3.addFirst("Nitoo");
        ll3.addLast("Delhi");
        System.out.println(ll3);

        System.out.println(ll3.getFirst());
        System.out.println(ll3.getLast());

        ll3.removeFirst();
        ll3.removeLast();
        System.out.println(ll3);
    }
    
}
