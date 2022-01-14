package collectionspractice;



public class LinkedList {
 private Node head;

    private static class Node{
        private int data;
        private Node next;

        public Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }

    public void display()
    {
        Node current=head;
        while (current!=null)
        {
            System.out.println(current.data);
            current=current.next;
        }
    }
    public int length()
    {
        int count=0;
        Node current=head;
        while (current!=null)
        {
            count++;
            current=current.next;
        }
        return count;
    }

    public void insertFirst(int value)
    {
        Node newnode=new Node(value);
        if (head==null)
        {
           head=newnode;
        }
        else
        {
            newnode.next=head;
            head=newnode;
        }
    }

    public void insertLast(int value)
    {
        Node newnode=new Node(value);
        if (head==null)
        {
            head=newnode;
        }
        else
        {
            Node current=head;
            while (current.next!=null)
            {
                current=current.next;
            }
            current.next=newnode;
        }

    }

    public void insertAfter(int value,int data)
    {
        Node newnode=new Node(data);
        Node current=head;
        while (current!=null)
        {
            if (current.data==value)
            {
                newnode.next=current.next;
                current.next=newnode;
            }
            current=current.next;
        }

    }
    public void delete(int value)
    {
        Node current=head;
        while (current!=null)
        {
            if (current.next.data==value)
            {
                current=current.next.next;
                current.next=null;
                break;
            }
            current=current.next;
        }
    }

    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
         ll.head = new Node(10);
        Node two = new Node(20);
        Node three = new Node(30);
        Node four = new Node(40);
        Node five = new Node(50);

        ll.head.next=two;
        two.next=three;
        three.next=four;
        four.next=five;


//        ll.insertFirst(200);
//        ll.insertLast(500);
        ll.insertAfter(30,700);
        ll.delete(40);
        ll.display();
        System.out.println(ll.length());
    }
}
