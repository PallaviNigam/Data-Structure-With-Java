//This program forms linklist from no of elements eneterd and then print it
import java.util.Scanner;

public class LinkListTest
{
public static void main(String args[])
{
int no;
int temp;
System.out.println("Enter no of Elements");
Scanner sc = new Scanner(System.in);
no = sc.nextInt();
System.out.println("Enter Elements");
int i;
LinkList ll = new LinkList();
for(i=0; i<no; i++)
{
temp = 	sc.nextInt();
ll.insert(temp);
}

ll.print();
}
}

class Node
{
int value;
Node next;
}

class LinkList
{
  Node head, temp;
  public void insert(int val)
  {
  	Node nd = new Node();
  	nd.value = val;
 	if (head == null )
 	{
 	  head = nd;
 	}
 	else
 	{
 	temp = head;
 	while(temp.next!= null)
 	{
 	temp = temp.next;
 	
 	}
 	temp.next = nd;
 	}
  }
  public void print()
  {
      Node temp;
      temp = head;
      int val;
      while (temp != null)
      {
          val = temp.value;
          System.out.print(val);
          temp = temp.next;
      }
  }
}
