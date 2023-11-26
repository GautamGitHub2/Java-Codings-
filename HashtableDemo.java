package CoreJavaHandsOn;
import java.security.KeyStore.Entry;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
public class HashtableDemo {
    public static void main(String[] args) {
        
        //Hashtable ht=new Hashtable(); //Capacity is 11, load factor 0.75
        //Hashtable ht1=new Hashtable(initial capacity); // create hashtable object with some capacity
        //Hashtable ht2=new Hashtable(initial capacity, fill ratio/load factor); //Capacity is 11, load factor 0.75

        Hashtable <Integer,String> ht3 = new Hashtable <Integer,String>();

        ht3.put(101,"Gautam");
        ht3.put(102,"Nitoo");
        ht3.put(103,"Raj");

        System.out.println(ht3);

        ht3.put(null,"Kumar");// Null Pointer Exception
        ht3.put(104,null); // Null Pointer Exception

        System.out.println(ht3.get(102)); // Nitoo

        ht3.remove(101);
        System.out.println(ht3);

        System.out.println(ht3.containsKey(102)); // true
        System.out.println(ht3.containsKey(105)); //false

        System.out.println(ht3.containsValue("Gautam"));
        System.out.println(ht3.containsValue("Rohan")); //false

        System.out.println(ht3.isEmpty());

        System.out.println(ht3.keySet());
        System.out.println(ht3.values());

        for(int k:ht3.keySet())
        {
            System.out.println(k+"   "+ht3.get(k));
        }

        // Entry specific methods....@interface
        for(Map.Entry entry: ht3.entrySet()) //(key, value)
        {
            System.out.println(entry.getKey()+"  "+entry.getValue());
        }

        // Iterator

        Set s=ht3.entrySet();

        Iterator itr=s.iterator();

        while(itr.hasNext())
        {
            Map.Entry entry=(Entry) itr.next();
            System.out.println(entry.getKey()+"   "+entry.getValue());
        }









        

        
    }
    
}
