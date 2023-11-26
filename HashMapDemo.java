package CoreJavaHandsOn;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

    public static void main(String[] args) {

        // Declaration

        // HashMap hm = new HashMap();

        HashMap<Integer, String> hm = new HashMap<Integer, String>();

        // Adding Pairs into Hash Map

        hm.put(101, "Gautam");
        hm.put(102, "Nitoo");
        hm.put(103, "Purushottam");
        hm.put(104, "Raj");
        hm.put(105, "Manu");

        System.out.println(hm);

        // {101=Gautam, 102=Nitoo, 103=Purushottam, 104=Raj, 105=Manu}

        // Remove pair from hash map
        hm.remove(102); // here there is no concept of indexing, we have to write the key to remove that
                        // key-value (pair)

        System.out.println(hm); // {101=Gautam, 103=Purushottam, 104=Raj, 105=Manu}

        // Read the values/pairs by using for loop

        System.out.println("Reading Pairs from Hash Map...");

        for (Map.Entry m : hm.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
        /*
         * Reading Pairs from Hash Map...
         * 101 Gautam
         * 103 Purushottam
         * 104 Raj
         * 105 Manu
         */
    }

}
