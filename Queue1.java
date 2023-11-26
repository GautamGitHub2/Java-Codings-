package CoreJavaHandsOn;
import java.util.Iterator;
import java.util.PriorityQueue;
public class Queue1 {
    public static void main(String[] args) 
    {
        PriorityQueue q = new PriorityQueue();

        //Adding element
        
        q.add("Gautam");
        q.add("Kumar");
        q.add("Purushottam");
        q.add("Raj");
        q.add(100); //java.lang.ClassCastException, here heterogenuous elemets are not allowed in Queue 
        q.offer(100); 

        System.out.println(q);

        //System.out.println(q.element()); //java.util.NoSuchElementException, when the queue is empty, here i had commented above added elemets in Queue
        //System.out.println(q.peek()); // null

        //System.out.println(q.remove()); // it will remove 1st element "Gautam"
        //System.out.println(q);

        System.out.println(q.poll()); // remove "Kumar" // null if Queue is Empty
        System.out.println(q); // [] no elements 

        //Iterator

        Iterator it= q.iterator();

        while(it.hasNext())
        {
            System.out.println(it.next());
        }

        // For Each Loop

        for(Object o:q)
        {
            System.out.println(o.hashCode());
        }






        
    }
    
}
