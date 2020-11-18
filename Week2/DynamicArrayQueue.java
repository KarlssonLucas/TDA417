
import java.util.Iterator;
import java.util.NoSuchElementException;

// TODO: Add documentation, including time complexity for each method

class DynamicArrayQueue<Item> implements Queue<Item> {

    private static final int INITIAL_CAPACITY = 4;

    private Item[] queue;
    private int head;
    private int tail;
    private int size;
    // Note: if head==tail, the stack can be either empty or full,
    // therefore we include a size variable.

    @SuppressWarnings("unchecked")
    public DynamicArrayQueue() {
        queue = (Item[]) new Object[INITIAL_CAPACITY];
        head = tail = size = 0;
    }

    public void enqueue(Item x) {
        if (size == queue.length){
            resize(2*queue.length); 
        }
        queue[tail] = x;
        tail = (tail+1)%size;
    }

    public Item dequeue() {
        if (isEmpty()) throw new NoSuchElementException("Queue underflow");
        if (size == queue.length) {
            resize(2*queue.length);
        }
        Item temp = queue[head];
        queue[head] = null
        head = (head+1) % size;
        return temp;
    }

    @SuppressWarnings("unchecked")
    private void resize(int capacity) {
        if (capacity > INITIAL_CAPACITY) {
            Item[] newqueue = (Item[]) new Object[capacity];
            size = queue.length;
            for(int i = 0; i<size; i++) {
                newqueue[i] = queue[((head+i)%size)];
            }
            head = 0;
            tail = size;
        }
    }

    public Item peek() {
        return queue[head]; 
    }

    public boolean isEmpty() {
        return queue[head] == null;
    }

    public int size() {
        if (isEmpty()) {
            return 0;
        } else if (queue[head] != null && head != tail) {
            return 
        }
    }

    // Iterate through all elements in the queue, in the order they will be removed
    public Iterator<Item> iterator() {
       return new CircularArrayIterator();
    }

    private class CircularArrayIterator implements Iterator<Item> {
        private int i = 0;
        public boolean hasNext() {
            return i < size;
        }
        public Item next() {
            if (!hasNext()) throw new NoSuchElementException();
            Item x = queue[(i + head) % queue.length];
            i += 1;
            return x;
        }
    }


    // Code for testing the class from the command line
    public static void main(String[] args) {
        if (args.length == 0) {
            System.err.println("Usage: give some command line arguments, '-' means dequeue(), all others mean enqueue()");
            System.exit(1);
        }
        DynamicArrayQueue<String> queue = new DynamicArrayQueue<String>();
        for (String item : args) {
            if (!item.equals("-")) {
                queue.enqueue(item);
            } else if (!queue.isEmpty()) {
                System.out.println(queue.dequeue());
            } else {
                System.out.println("Error: queue is empty, cannot dequeue()!");
            }
        }
        System.out.print("(" + queue.size() + " items left in queue:");
        for (String item : queue) System.out.print(" " + item);
        System.out.println(")");
    }

}

