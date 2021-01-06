import java.lang.reflect.Type;
import java.util.ArrayList;

import java.util.ArrayList;

public class Dynamic{
        public static void main(String[] args) {
                ArrayList<Integer> list = new ArrayList<>();
                list.add(21);//Add:[21]
                list.add(42);//Add:[21,42]
                list.add(39);//Add:[21,42,39]
                list.toArray();//Converts this list to an Array
                // System.out.println(list.size()); Returns size of list: 3
                list.remove(1);//Removes at index 1: [21,39]
                list.contains(80);//Returns False
                System.out.println(list);

        }
}
