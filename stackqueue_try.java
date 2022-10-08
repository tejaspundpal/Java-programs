import java.util.*;
interface StackInterface
{
    boolean isEmptyStack();
    boolean isFullStack();
    void push(int data);
    int pop();
    int peek();
    void display_stack();
    int m = 20;
    int[] stack = new int[m];

}
interface QueueInterface
{
    boolean isEmptyQueue();
    boolean isFullQueue();
    void enqueue(int data);
    int dequeue();
    void display_queue();
    int n = 20;
    int[] queue = new int[n];
}
class StackQueue implements StackInterface,QueueInterface
{
    int top;
    int front;
    int rear;
    Scanner sc = new Scanner(System.in);

    public StackQueue() {
        this.top = -1;
        this.front = -1;
        this.rear = -1;
    }

    public boolean isEmptyStack()
    {
        if(top == -1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public boolean isFullStack()
    {
        if(top == m-1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public void push(int data)
    {
        if(isFullStack())
        {
            System.out.println("Stack Overflow....!!");
        }
        else
        {
            top++;
            stack[top] = data;
        }
    }
    public int pop()
    {
        int popped_element = 0;
        if(isEmptyStack())
        {
            System.out.println("Stack is Empty,You cannot perform pop...!!");
            return -1;
        }
        else
        {
            popped_element = stack[top];
            top--;
        }
        return popped_element;
    }

    @Override
    public int peek()
    {
        if(isEmptyStack())
        {
            System.out.println("Stack is Empty..!! (top = -1)");
            return -1;
        }
        else {
            return stack[top];
        }
    }

    public void display_stack()
    {
        if(isEmptyStack())
        {
            System.out.println("Stack is Empty..!!");
        }
        else {
            for (int i = top; i >= 0; i--) {
                System.out.println(stack[i]);
            }
        }
        System.out.println();
    }
    public boolean isEmptyQueue()
    {
        if((front == -1 && rear == -1) || front > rear)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public boolean isFullQueue()
    {
        if(rear == n - 1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    @Override
    public void enqueue(int data)
    {
        if (front == -1 && rear == -1) {
            front = 0;
            rear++;
            queue[rear] = data;
        } else if (rear != -1) {
            ++rear;
            queue[rear] = data;
        } else {
            System.out.println("Queue is full..!!");
        }
    }

    @Override
    public int dequeue()
    {
        if (isEmptyQueue())
        {
            System.out.println("Queue is Empty ,Nothing to Dequeue");
            return -1;
        }
        else if (front == rear)
        {
            int data = queue[front];
            front = -1;
            rear = -1;
            return data;
        }
        else
        {
            int data = queue[front];
            front++;
            return data;
        }
    }

    @Override
    public void display_queue() {
        if (isEmptyQueue())
        {
            System.out.println("Queue is Empty ,Nothing to Dequeue");
        }
        else{
            for(int i = front;i <= rear;i++){
                System.out.print(queue[i]+" ");
            }
        }
    }

}
public class stackqueue_try {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackQueue obj = new StackQueue();
        boolean flag = true;
        System.out.println("1)Push element in Stack\n2)Pop element from stack\n3)Display peek of Stack\n4)Display Stack\n5)Enqueue element in Queue\n6)Dequeue element from Queue\n7)Display queue\n8)Exit");
        while(flag)
        {
            System.out.println("Enter choice : ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.println("Enter element to add in Stack : ");
                    int stack_data = sc.nextInt();
                    obj.push(stack_data);
                }
                case 2 -> {
                    int stack_element = obj.pop();
                    System.out.println("Popped element is : "+stack_element);
                    System.out.println();
                }
                case 3 -> {
                    int peek = obj.peek();
                    System.out.println("Peek of the stack is : "+peek);
                    System.out.println();
                }
                case 4 -> {
                    obj.display_stack();
                }
                case 5 -> {
                    System.out.println("Enter element to add in queue : ");
                    int queue_data = sc.nextInt();
                    obj.enqueue(queue_data);
                }
                case 6 -> {
                    int queue_element = obj.dequeue();
                    System.out.println("Dequeued element is : "+queue_element);
                    System.out.println();
                }
                case 7 -> {
                    obj.display_queue();
                }
                case 8 -> {
                    flag = false;
                }
                default -> System.out.println("Enter the valid choice...!!!!");
            }
        }
    }
}
