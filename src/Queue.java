 // implement queue

public class Queue {

    int front , rare ,size;
    int capacity;
    int array[];

    public Queue(int capacity){
        this.capacity = capacity;
        front = this.size = 0;
        rare = capacity -1;
        array = new int[this.capacity];
    }

    //if full
    public boolean isFull(Queue queue){
        return(queue.size  == queue.capacity);
    }

    public boolean isEmpty(Queue queue){
        return(queue.size  == 0);
    }

    // Method to add an item to the queue.
    // It changes rear and size
    public void enqueue(int item){
        if(isFull(this)){
            return;
        }
        this.rare = (this.rare +1)%this.capacity;
        this.array[this.rare] = item;
        this.size = this.size+1;
        System.out.println(item+ " enqueued to queue");

}

    // Method to remove an item from queue.
    // It changes front and size
    public int dequeue(){
        if(isEmpty(this)){
            return Integer.MIN_VALUE;
        }
      int item = this.array[this.front];
        this.front = (this.front+1)%this.capacity;
        this.size = this.size-1;
        return item;

    }
    // Method to get front of queue
    int front()
    {
        if (isEmpty(this))
            return Integer.MIN_VALUE;

        return this.array[this.front];
    }

    // Method to get rear of queue
    int rear()
    {
        if (isEmpty(this))
            return Integer.MIN_VALUE;

        return this.array[this.rare];
    }
}


 // Driver class
    class main{

         public static void main(String[] args)
         {
             Queue queue = new Queue(1000);

             queue.enqueue(10);
             queue.enqueue(20);
             queue.enqueue(30);
             queue.enqueue(40);

             System.out.println(queue.dequeue() +
                     " dequeued from queue\n");

             System.out.println("Front item is " +
                     queue.front());

             System.out.println("Rear item is " +
                     queue.rear());
         }
 }



