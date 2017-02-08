package hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created by Android on 2/8/2017.
 */
public class Hasmap {
    public  static void  main(String [] args){
        HashMap<Integer,String> map=new HashMap<Integer, String>();
        map.put(01,"Mithun");
        map.put(02,"Sujan");
        map.put(03,"Sagar");
        map.put(04,"Imran");
        Set set = map.entrySet();
        Iterator iterator = set.iterator();
        while(iterator.hasNext()) {
            Map.Entry mentry = (Map.Entry)iterator.next();
            System.out.print("key is: "+ mentry.getKey() + " & Value is: ");
            System.out.println(mentry.getValue());
        }
    }
}
