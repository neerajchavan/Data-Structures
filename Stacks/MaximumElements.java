import java.io.*;
import java.util.*;
import java.util.Stack;

public class MaximumElements {

    public static int maxElem=0;

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        Stack<Integer> mainStack = new Stack<Integer>();
        Stack<Integer> maxStack  = new Stack<Integer>();
        maxStack.push(0);

        for(int i=0; i<n; i++){
        int ch = s.nextInt();

        if(ch==1)
        { 
           int num = s.nextInt();
           mainStack.push(num);
           int maxSoFar = maxStack.peek();
           if(num > maxSoFar)
            maxStack.push(num); 
           else
            maxStack.push(maxElem);
        }

        else if(ch==2)
        {
           if(!mainStack.isEmpty()) 
           mainStack.pop();
           maxStack.pop();
        }  

        else if(ch==3)
        {
           if(!maxStack.isEmpty()) 
           System.out.println(maxStack.peek()); 
        }
        }  
                  
    }
}
