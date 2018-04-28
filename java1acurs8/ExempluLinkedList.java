import java.util.*;

public class ExempluLinkedList {

    public static void main(String [] args) {
        LinkedList<Integer> list = new LinkedList<>();
        
        list.addFirst(5);
        list.addFirst(7);
        list.addLast(8);
        
        list.removeFirst();
        list.removeLast();
        
        list.forEach(System.out::println);
    }
}