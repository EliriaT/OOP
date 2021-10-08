package LAB2.Task2;

import java.util.List;
import java.util.ArrayList;

public class Queue<T> {
    private Integer size;
    private Integer maxSize;
    private List<T> queue;

    public Queue() {
        this.size = 0;
        this.queue = new ArrayList<>();
        this.maxSize = Integer.MAX_VALUE;

    }

    public Queue(int maxSize) {
        this.size = 0;
        this.queue = new ArrayList<>();
        this.maxSize = maxSize;
    }

    public void push(T value) {
        if (size < maxSize) {
            this.queue.add(value);
            this.size = this.size + 1;
        } else {
            System.out.println("Items can't be added,the limit of items in Queue was reached!");
        }
    }

    public T pop() {
        if (size != 0) {
            this.size--;
            T value = queue.get(size);
            queue.remove(this.size);
            return value;
        } else {
            System.out.println("The are no items in the Queue");
            return null;
        }
    }

    public Boolean isEmpty() {
        if (size == 0) {
            return true;
        }
        return false;
    }

    public Boolean isFull() {
        if (maxSize == Integer.MAX_VALUE) {
            System.out.println("This Queue is never full");
            return null;
        } else {
            if (size == maxSize) {
                return true;
            }

            return false;
        }

    }
}

