import java.util.Scanner;

class Queue {
 int size;
 int arr[];
 int front, rear;

 Queue(){
     front = -1;
     rear  = -1;
 }

 Queue(int size){
     this();
     if(size > 0){
     this.size = size;
     this.arr = new int[size];
     }
 }

 boolean isFull(){
     if(front == 0 && rear == size - 1)
        return true;
     else
        return false;   
 }

 boolean isEmpty(){
     if(front == -1)
        return true;
     else
        return false;   
 }

 public void enqueue(int element){
  if(isFull())
      System.out.println("Queue is full!");
  else{  
   if(front == -1)
      front = 0;
   rear++;    
   arr[rear] = element; 
   System.out.println("Element Inserted!"); }
  }
 

 public int peek(){
   if(isEmpty()){
      System.out.println("Queue is empty!");
      return -1;
   }
   else{
      return arr[front];}
      
 }

 public void dequeue(){
     if(isEmpty())
        System.out.println("Queue is empty!");
     else
        if(front >= rear){
            front = -1;
            rear  = -1;
        }
        else{
            front++;
            System.out.println("Element deleted!");   
        }  
 }

 public void printQueue(){
     for (int i=front; i<=rear; i++) {
      System.out.print(arr[i]+" ,");   
     }
 }

}

public class QueueImplementation{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of queue!");
        int size = s.nextInt();
        Queue q = new Queue(size);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        q.enqueue(60);
        q.enqueue(70);
        q.enqueue(80);
        q.enqueue(90);
        q.enqueue(100);
        System.out.println("Element at front is: "+q.peek());
        q.dequeue();
        q.dequeue();
        q.dequeue();
        System.out.println("Element at front is: "+q.peek());
        q.printQueue();
    }
}