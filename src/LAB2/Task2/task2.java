package LAB2.Task2;

public class task2 {
    public static void main(String[] args) {

        Queue<Integer> first_Queue = new Queue<>();
        Queue<Integer> second_Queue = new Queue<>(5);

        first_Queue.push(51);
        first_Queue.push(78);
        first_Queue.push(89);

        second_Queue.push(12);
        second_Queue.push(1000);
        second_Queue.push(2999);


        System.out.println("The last value in the first Queue: " + first_Queue.pop());
        System.out.println("The last value in the second Queue: " + second_Queue.pop());

        System.out.println(" Is second_Queue empty? " + second_Queue.isEmpty() + " Is second_Queue full? " + second_Queue.isFull());
        System.out.println(" Is first_Queue empty? " + first_Queue.isEmpty() + " Is first_Queue full? " + first_Queue.isFull());
    }
}