package CoreJavaHandsOn;
import java.util.HashSet;
import java.util.Iterator;
public class HashSet1 {
    public static void main(String[] args) {

         // default capacity is 16 and load factor is 0.75
        // hashSet hs1 = new HashSet(100); // initial capacity is 100
        //HashSet hs2 = new HashSet (100, (float)0.90);

        //HashSet<Integer> hs3 =new HashSet<Integer>();

        HashSet hs = new HashSet();
        hs.add(100);
        hs.add("Gautam");
        hs.add(15.5);
        hs.add('G');
        hs.add(true);
        hs.add(false);
        hs.add("Gautam");
        hs.add(null);

        System.out.println(hs);

        //remove

        hs.remove('G');
        System.out.println(hs);

        //contains
        hs.contains(15.5);
        System.out.println(hs);
        System.out.println(hs.contains("Gautam"));

        System.out.println(hs.isEmpty());

        // reading object by for each loop
        for(Object e:hs)
        {
            System.out.println(e);
        }

        // Iterator

        Iterator it=hs.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }

        HashSet<Integer> evenNumber=new HashSet<Integer>();

        evenNumber.add(2);
        evenNumber.add(4);
        evenNumber.add(6);
        evenNumber.add(8);

        System.out.println("HashSet:"+evenNumber);

        HashSet<Integer> number=new HashSet<Integer>();
        
        number.addAll(evenNumber);
        number.add(10);
        System.out.println(number);

        //remove all
        number.removeAll(evenNumber);
        System.out.println(number);

        HashSet<Integer> set1=new HashSet<Integer>();

        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);
        set1.add(6);

        System.out.println("HashSet 1:"+set1);

        HashSet<Integer> set2=new HashSet<Integer>();

        set2.add(3);
        set2.add(4);
        set2.add(5);

        System.out.println("HashSet 2:"+set2);

        //union 
        set1.addAll(set2);

        System.out.println("Union:"+set1);

        //set2.addAll(set1);
        //System.out.println("Union:"+set2);

        //intersection
        set1.retainAll(set2);
        System.out.println("Intersection:"+set1);

        // difference
        set2.removeAll(set1);
        System.out.println("difference:"+set1);

        //subset
        set1.containsAll(set2);
        System.out.println("subset:"+set1);
        System.out.println(set1.containsAll(set2));

        System.out.println(set2.containsAll(set1));









        






























        







        
    }
    
}
