package ArrayList;

import java.util.ArrayList;

/**
 * Created by Android on 2/8/2017.
 */
public class ArraylistExmple {
    public  static void main(String[] args){
        ArrayList<String> list=new ArrayList<String>();
        list.add("Mithun");
        list.add("Sujan");
        list.add("Sagar");
        System.out.println("Contain element of Arraylist= \n"+list);
        list.remove(1);
        System.out.println("After remove Contain element of Arraylist= \n"+list);
    }


}
