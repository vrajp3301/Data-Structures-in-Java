import java.util.Arrays;
import java.util.LinkedList;

public class Main{
        public static void main(String[] args) {
                LinkedList list  = new LinkedList();
                
                list.addLast(10);//[10]
                list.addLast(20);//[10,20]
                list.addLast(30);//[10,20,30]
                list.addFirst(1);//[1,10,20,30]
                list.remove(2);//[1,10,20]
                System.out.println(list);
                var array = list.toArray();
                System.out.println(Arrays.toString(array)); //Converts Linked list to Array


                 
        }
}