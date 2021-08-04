package Collection.demo;

import java.util.PriorityQueue;

public class Prority_Queue_Demo {

	public static void main(String[] args) {
		// Create a Priority Queue
        PriorityQueue<Integer> numbers = new PriorityQueue<>();

        // Add items to a Priority Queue (ENQUEUE)
        numbers.add(750);
        numbers.add(500);
        numbers.add(900);
        numbers.add(100);
        //insert number useing offer
        numbers.offer(50);

        // Remove items from the Priority Queue (DEQUEUE)
        while (!numbers.isEmpty()) {
            System.out.println(numbers.remove());
        }


	}

}
