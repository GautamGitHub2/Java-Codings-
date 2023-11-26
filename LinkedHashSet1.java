package CoreJavaHandsOn;
import java.util.LinkedHashSet;
import java.util.HashSet;
public class LinkedHashSet1 {
    public static void main(String[] args)
    {
        //LinkedHashSet<Integer> lhs1=new LinkedHashSet<Integer>();

        LinkedHashSet lhs = new LinkedHashSet();
        lhs.add(100);
        lhs.add(100);
        lhs.add(200);
        lhs.add(300);
        lhs.add(400);
        lhs.add(100);
        lhs.add(500);

        System.out.println(lhs);

        System.out.println(lhs.isEmpty());  

        HashSet hs=new HashSet();
        hs.add(900);
        hs.add(900);
        hs.add(600);
        hs.add(500);

        System.out.println(hs);

    }
    
}
