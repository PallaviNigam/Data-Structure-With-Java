//Linklist implementation with insert, insertat, deleteelement, travesre
import java.util.Scanner;
public class TestLinkList
{
    public static void main(String args[])
    {
        int end =0;
        int choice;
        int element;
        int val;
        int pos;
        LinkList ll = new LinkList();
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter no of elements to be entered in Orginal Linklist");
        element = sc.nextInt();
         System.out.println("Enter elements to be entered in Orginal Linklist");
        int i;
        for(i=0; i<element;i++)
        {
          val= sc.nextInt();
          ll.insert(val);
        }
       System.out.println("Original Linklist");
       ll.print();
       ll.reverse();
        System.out.println();
           System.out.println("Reversed Linklist");
       ll.print();
       
        }
    }

class Node
{
    int val;
    Node next;
}

class LinkList
{
    Node head;
    public void insert(int val)
    {
        Node nn = new Node();
        Node temp;
        nn.val = val;
        if (head == null)
        {
            head = nn;
        }
        else
        {
           temp = head; 
           while (temp.next != null)
           {
               temp = temp.next;
           }
           temp.next = nn;
        }
    }
    
    public void print()
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }
    public void insertAt(int element, int pos)
    {
        Node temp = head;
        Node Next;
        Node nn = new Node();
        nn.val = element;
        int i = 0;
        for( i = 0; i<pos-1; i++)
        {
          if   (temp == null)
          {
              System.out.println("Total no of element in Linklist is"+ i);
              return;
          }
          temp = temp.next;
        }
        Next = temp.next;
        temp.next = nn;
        nn.next = Next;
        
    }
    
    public void reverse()
    {
        Node cur = head;
        Node next = cur.next;
        Node prev = null;
        while(cur != null)
        {
           cur.next = prev;
           prev = cur;
           cur = next;
           if (next != null)
           {
           next = next.next;
           }
        }
        head = prev;
            
        }
    
    
}
