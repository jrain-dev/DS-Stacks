public class Stack<E> {

    public Node head, tail;

    public Stack() //constructor method to create a list of object with head, tail, and size.
    {
        head = null;
        tail = null;
    }

    public void push(int data) //adds element to the top of a stack
    {
        if (tail == null)
            head = tail = new Node(data); //empty list
        else
        {
            tail.next = new Node(data); //link new node as last node
            tail = tail.next; //make tail pointer points to last node
        }
    }

    public void pop() //removes the element at the tp of a stack
    {
        if(size() == 0){
            System.out.println("Stack is empty.");
        } else if (size() == 1){
            Node temp = head;
            head = tail = null;
        } else {
            Node current = head;
            for (int i= 0; i < size() - 2; i++){
                current = current.next;
            }
            Node temp = tail;
            tail = current;
            tail.next = null;
        }
    }

    public void top() //returns the value at the top of the stack
    {
        if (tail == null)
        {
            System.out.println("Top is null, as your stack is empty.");
        }
        else{
            System.out.println(tail.data);
        }
    }

    public int size() //returns the size of the stack
    {
        int stackSize= 0;
        Node current = head;
        while (current != null){
            stackSize++;
            current = current.next;
        }
        return stackSize;

    }

    public boolean isEmpty(){ //returns empty value
        if (size() == 0){
            return true;
        }
        else{
            return false;
        }
    }

    //method #7: pritnInReverse  (Recursive method)
    public void printInReverse(Node L)
    {
        if (head == null){
            System.out.println("List is empty.");
        } else {
            printInReverse(head.next);
            System.out.println(head.data + " ");
        }
    }

    public void printStack() //Prints out the contents of the stack
    {
        if (size() == 0){
            System.out.println("Stack is empty.");
        } else {
            Node temp;
            temp = head;
            while (temp != null)
            {
                System.out.print(temp.data + "   ");
                temp = temp.next;
            }
        }

    }

    private class Node //class to create nodes as objects
    {
        private int data;  //data field
        private Node next; //link field

        public Node(int item) //constructor method
        {
            data = item;
            next = null;
        }
    }

}
