public class Queue {
    private Node front;
    private Node rear;
    private int count;
    
    public Queue(){
        this.front = null;
        this.rear = null;
        this.count = 0;
    }

    public void enqueue (String item){
        Node nodeEnqueue = new Node(item);
        if (count == 0){
            front = nodeEnqueue;
            rear = nodeEnqueue;
        } else {
            rear.next = nodeEnqueue;
            rear = nodeEnqueue;
        }
        count++;
    }

    public void dequeue(){
        Node nodeDequeue = front;
        if (count == 0){
            System.out.println("The queue is empty. There´s no elements to dequeue.");
            return;
        }
        if (count == 1){
            front = null;
            rear = null;
        } else {
            front = nodeDequeue.next ;
            nodeDequeue = null;
            count--;
        }
        count--;
    }

    public String peek() {
        if (front != null){
            return front.data;
        }
        return null;
    }

    public int size() {
        return count;
    }
}
