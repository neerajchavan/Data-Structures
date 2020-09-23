public class CircularQueue {
    int front,rear,size;
    int arr[];

    CircularQueue(){
        front = rear = -1;
    }

    CircularQueue(int size){
        this();
        arr = new int[size];
        this.size = size;
    }

    public boolean isFull(){
        if(front == 0 && rear == size-1)
         return true;
        if(front == rear + 1)
         return true; 
        
         return false;         
    }

    public boolean isEmpty(){
        if(front == -1)
         return true;
        else
         return false;
    }

    public void enQueue(int element){
        if(isFull())
           System.out.println("Queue is full!");
        else
           {
            if(front == -1)
             front = 0;
            rear = (rear + 1) % size; 
            arr[rear] = element;
            System.out.println("Inserted: "+element);
           }
    }
    

    public void deQueue(){
        if(isEmpty())
           System.out.println("Queue is empty!");
        else
           {
            if(front == rear)
                front = rear = -1;
            front = (front + 1) % size;  
            System.out.println("Deleted: "+arr[front-1]);   
           }
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Queue is empty!");
            return -1;}
        else
            return arr[front];    
    }

    public void printQueue(){
        int i;
        if(isEmpty())
         System.out.println("Queue is empty!");
        else{
            for(i=front; i!=rear; i = (i+1) % size )
                System.out.println(arr[i]+" ");
            System.out.println(arr[i]);    
        } 
    }
}

class Main{
    public static void main(String[] args) {
        CircularQueue cq = new CircularQueue(5);
        cq.enQueue(10);
        cq.enQueue(20);
        cq.enQueue(30);
        cq.enQueue(40);
        cq.enQueue(50);
        cq.deQueue();
        cq.deQueue();
        cq.enQueue(60);
        cq.enQueue(70);
        cq.enQueue(80);
        System.out.println("First Element: "+cq.peek());
        cq.printQueue();

    }
}