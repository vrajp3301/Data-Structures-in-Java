package Exercise_1;
public class Main {

    public static void main(String[] args) {
        
        Array numbers = new Array(3);
        numbers.insert(33);//[33]
        numbers.insert(21);//[33,21]
        numbers.insert(12);//[33,21,12]
        numbers.insert(95);//[33,21,12,95]
        numbers.removeAt(2);//[33,21,95]
        numbers.indexOf(21);//1
        numbers.print();            
    }

}
