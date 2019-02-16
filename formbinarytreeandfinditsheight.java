//form Binary tree from array and calculate the height

import java.util.*;
import java.io.*;
class Node
{
    int val;
    Node left;
    Node right;
}
class Tree
{
    Node root;
    int height;
    public void addNode(int node)
    {
        Node temp = new Node();
        if (root == null){
            temp.val = node;
            root = temp;
            height = 1;
        }
        else
        {
            int travh = 1;
            temp = root;
            Node newnode = new Node();
            newnode.val = node;
            while(true)
            {
               if (node > temp.val)
               {
                   if (temp.right != null)
                   {
                   temp = temp.right;
                   travh++;
                   }
                   else
                   {temp.right = newnode;
                   travh++;
                   if (height<travh)
                   {
                       height = travh;
                   }
                    break;   
                   }
                   
               }
               else
               {
                       if (temp.left != null)
                   {
                   temp = temp.left;
                   travh++;
                   }
                   else
                   {temp.left = newnode;
                   travh++;
                   if (height<travh)
                   {
                       height = travh;
                   }
                    break;   
                   }
               }
            }
        }
            }
}
public class MyClass  {
    public static void main(String args[]) throws Exception {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       Tree t = new Tree();
       int no = Integer.parseInt(br.readLine());
     String[] str =   br.readLine().split(" ");
     for(int i = 0;i<no; i++)
     {
         int n;
      n =   Integer.parseInt(str[i] );
      t.addNode(n);
     }
     System.out.println(t.height);
    }
}
