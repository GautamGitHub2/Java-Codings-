package CoreJavaHandsOn;
import java.util.Map.Entry;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
public record HashMap1() {
    public static void main(String[] args) {
        HashMap m=new HashMap();
        m.put(201,"Test");
        m.put(202,"Java");
        m.put(203,"Salesforce");
        m.put(204,"Agile");
        m.put(205,"MySQL");


        HashMap<Integer,String> m1=new HashMap<Integer,String>();

        m1.put(101, "Gautam");
        m1.put(102, "Nitoo");
        m1.put(103, "Purushottam");
        m1.put(104, "Raj");
        

        System.out.println(m1); //{101=Gautam, 102=Nitoo, 103=Purushottam, 104=Raj}
        
        m1.put(103, "Manu"); // it will replace old values with new values since key are same
        m1.put(104, "Appu");

        System.out.println(m1); //{101=Gautam, 102=Nitoo, 103=Manu, 104=Appu}

        m1.put(105, "Gautam"); // duplicate values with the new key will be saved as new entry
        m1.put(106, "Nitoo");

        System.out.println(m1); // {101=Gautam, 102=Nitoo, 103=Manu, 104=Appu, 105=Gautam, 106=Nitoo}

        System.out.println(m1.get(105)); // Gautam
        System.out.println(m1.get(102)); // Nitoo

        m1.remove(101);
        System.out.println(m1);

        System.out.println(m1.containsKey(101));
        System.out.println(m1.containsKey(103));

        System.out.println(m1.containsValue("Manu"));
        System.out.println(m1.containsValue("John"));
        System.out.println(m1.containsValue("Raj"));

        System.out.println(m1.isEmpty()); // false
        System.out.println(m1.keySet()); // [102, 103, 104, 105, 106]
        System.out.println(m1.values()); // [Nitoo, Manu, Appu, Gautam, Nitoo]

        System.out.println(m1.entrySet()); // [102=Nitoo, 103=Manu, 104=Appu, 105=Gautam, 106=Nitoo]

        for(Object o:m1.keySet()) // here it will consider all the keys available in hashMap
        {
            System.out.println(o);
        }

        for(Object o1:m1.values()) // here it will consider only values from the HashMap
        {
            System.out.println(o1); 
        }

        for(Object o2:m1.keySet()) // to print the key and value pair together
        {
            System.out.println(o2+"     "+m1.get(o2));
        }

        // Entry Method

        for(Map.Entry entry:m1.entrySet())
        {
            System.out.println(entry.getKey()+"   "+entry.getValue());
            
        }

        // Iterator 

        Set s = m1.entrySet(); // here Set is created because entrySet() returns the set

        Iterator it=s.iterator();

        while(it.hasNext())
        {
            System.out.println(it.next());
        }
// Output for 'm'
/*
201=Test
202=Java
203=Salesforce
204=Agile
205=MySQL
 */

 // Output for 'm1'

 /*
102=Nitoo
103=Manu
104=Appu
105=Gautam
106=Nitoo
 */

 // Another approach for Iterator 

  Set s1 = m.entrySet(); // here Set is created because entrySet() returns the set

  Iterator itr=s1.iterator();

  while(itr.hasNext())
  {
    Map.Entry entry=(Entry)itr.next();  
    System.out.println(entry.getKey()+"   "+entry.getValue());
    
  }

  // Output

  /*

201   Test
202   Java
203   Salesforce
204   Agile
205   MySQL 
   
  */

    }

    
}
