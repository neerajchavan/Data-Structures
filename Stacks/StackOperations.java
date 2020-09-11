import java.util.Scanner;

class Stack{
 private int arr[];
 private int top, capacity;

 Stack(int size)
 {
     if(size>0){
     arr = new int[size];
     this.capacity = size;
     top = -1;
     System.out.println("Stack created with size of: "+ size);}

     else{
     System.out.println("Stack size cannot be less than 1, please re-run the program!");
     System.exit(1);}
 }

 public void push(int element)
 {
   if(isFull())
     System.out.println("Insertion Failed, Stack is Full!");

   else {
   arr[++top] = element;
   System.out.println(element +" added, Top : "+top);} 
 }

 public void pop()
 {
  if(isEmpty())
     System.out.println("Stack is Empty!");
  
  else {top--;
  System.out.println("Element popped!"); 
  System.out.println("Top: "+top);}
 }

 public int peek(){
    if(isEmpty()){
        System.out.println("Stack is empty!");
        return 0;}
      
    else 
      return arr[top];  
 }

 public void printStack(){
     if(isEmpty())
        System.out.println("No elemets in stack!");
     
    else{ 
     System.out.println("Printing elements in stack :"); 
     for(int i=0; i<=top; i++)
        System.out.println(arr[i]);
     }
 }

 public boolean isFull(){
  return (top == capacity-1) ?  true : false;
 }

 public boolean isEmpty(){
  return (top == -1) ?  true : false;
 }

}


public class StackOperations{
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      System.out.println("Please enter the size of stack: ");
      Stack s = new Stack(scan.nextInt());

      while(true){
          int element = 0;
          System.out.println("1) Push Operation\n2) Pop Operation\n3) Peek\n4) Check, whether stack is full/not?\n5) Check, whether stack is empty/not?\n6) Print Elemets of Stack\n7)Exit");
          System.out.println("Please enter your choice: ");
          byte ch = scan.nextByte();

        switch(ch)  
        {
         case 1 :   System.out.println("Enter an element to intert into stack: ");
                    element = scan.nextInt();
                    s.push(element);
                    break;

         case 2 :   s.pop();
                    break;   
                    
         case 3 :   element = s.peek();  
                    System.out.println("Top element of the stack is: "+ element);
                    break;

         case 4 :   if(s.isFull())  
                       System.out.println("Stack is full!");
                    else       
                       System.out.println("Stack is not full!");
                    break;

         case 5 :   if(s.isEmpty())  
                        System.out.println("Stack is empty!");
                    else       
                        System.out.println("Stack is not empty!");
                    break;  

         case 6 :   s.printStack();
                    break;   
                    
         case 7 :   System.exit(1);            

         default : System.out.println("Invalid option! please enter again!");
                   continue;                                
        }
      }

    }

}