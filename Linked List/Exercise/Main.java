package Exercise;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        var list = new LinkedList();

        list.addLast(21);
        list.addLast(20);
        list.addFirst(5);
        System.out.println(list.indexOf(5)); //0
        System.out.println(list.contains(40)); //false
        list.removeFirst();//removes first element and now head points to the second element
        list.removeLast();
        list.reverse();
        var array = list.toArray();
        System.out.println(Arrays.toString(array));
        
        
    }
    

}
