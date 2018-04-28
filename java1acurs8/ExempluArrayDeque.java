import java.util.*;

public class ExempluArrayDeque {

    public static void main(String [] args) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        
        deque.push(10); // adauga la inceput
        deque.offer(5); // adauga la sfarsit
        deque.pop(); // elimina de la inceput
        
        deque.forEach(System.out::println);
    }
}