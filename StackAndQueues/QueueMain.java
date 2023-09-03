package StackAndQueues;

public class QueueMain {
    public static void main(String[] args) throws Exception {
        //CustomQueue queue = new CustomQueue(5);
        CircularQueue queue = new CircularQueue(5);
        queue.insert(12);
        queue.insert(6);
        queue.insert(5);
        queue.insert(19);
        queue.insert(33);

        queue.display();

        System.out.println(queue.remove());
        queue.insert(133);

        queue.display();
    }
}
