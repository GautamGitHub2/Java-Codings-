package CoreJavaHandsOn;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.LinkedList;
public class LinkedList2 {
    public static void main(String[] args) 
    {
        LinkedList ll = new LinkedList();

        //Adding element
        
        ll.add("Gautam");
        ll.add("Kumar");
        ll.add("Purushottam");
        ll.add("Raj");
        ll.add(100); //java.lang.ClassCastException, here heterogenuous elemets are not allowed in Queue 
        ll.offer(100); 

        System.out.println(ll);

        System.out.println(ll.element()); 
        System.out.println(ll.peek()); 

        System.out.println(ll.remove()); // it will remove 1st element "Gautam"
        System.out.println(ll);

        /*
          System.out.println(q.poll()); // remove "Kumar" // null if Queue is Empty
        System.out.println(q); // [] no elements 
*/
        //Iterator

        Iterator it= ll.iterator();

        while(it.hasNext())
        {
            System.out.println(it.next());
        }

        /*
          
        // For Each Loop

        for(Object o:ll)
        {
            System.out.println(ll);
        }
         
        */
        
         
        
        






        
    }
    
}
