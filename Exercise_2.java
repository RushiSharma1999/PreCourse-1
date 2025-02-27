public class Exercise_2 { 
  
    StackNode root; 
    static class StackNode { 
        int data; 
        StackNode next; 
  
        StackNode(int data) 
        { 
            this.data = data;
            //Constructor here 
        } 
    } 
    
	
    public boolean isEmpty() 
    { 
        if (root == null) 
        {
            return true;
        }
        return false;
        //Write your code here for the condition if stack is empty. 
    } 
  
    public void push(int data) 
    { 

        StackNode node = new StackNode(data);
        node.next = root;
        root = node;
        //Write code to push data to the stack. 
    } 
  
    public int pop() 
    { 	
        if (isEmpty())
        {
            System.out.println("Stack Underflow");
            return 0;
        }
        else
        {
            //storing the top value
            int top = root.data;
            root = root.next;
            return top;
        }
	//If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
	//Also return the popped element 
    } 
  
    public int peek() 
    { 
        if(isEmpty())
        {
            System.out.println("Empty Stack");
            return -1;
        }
        else
        {
            return root.data;
        }

        //Write code to just return the topmost element without removing it.
    } 
  
	//Driver code
    public static void main(String[] args) 
    { 
  
        Exercise_2 sll = new Exercise_2(); 
  
        sll.push(10); 
        sll.push(20); 
        sll.push(30); 
  
        System.out.println(sll.pop() + " popped from stack");
  
        System.out.println("Top element is " + sll.peek()); 
    } 
} 
