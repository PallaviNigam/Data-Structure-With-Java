import java.io.*;
import java.util.*;

//Logic is that in case of binary search tree inordere traversal would be in sorted form
class Tree
{
    int[] tree;
//Inoder Travesal of entred Tree
    HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
//Inoder Travesal of Binary Search Tree
TreeSet<Integer> ts = new TreeSet<Integer>();
int n = 0;
int index = 0;
int swap = 0;
   public void inorderTraversal()
   {
       index = 0;
       traverseNode(0);
     
   }
     public void traverseNode(int nodeindex)
     {
         if (2*nodeindex+1 < n)
         {
             traverseNode(2*nodeindex+1);
         }
         hm.put(index, tree[nodeindex]);
      //    System.out.println(tree[nodeindex] + "added to index" + index);
         index++;
         if (2*nodeindex+2 < n)
         {
             traverseNode(2*nodeindex+2);
         }
     }
     public void calculateSwap()
     {
         Iterator itr  = ts.iterator();
         int i = 0;
         //From tree set get each value and check if in Hasmap Value is at  same index or not, if not then swap the integers
         while(itr.hasNext())
         {
             int n1 = (int)itr.next();
             int n2 = hm.get(i);
             if (n1 == n2)
             {
                 i++;
             }
             else
             {
                  for(Map.Entry entry: hm.entrySet()){
            if(n1 == (int)entry.getValue()){
                int strkey = (int)entry.getKey();
                hm.put(i,n1);
                hm.put(strkey, n2);
               // System.out.println("Swap"+ n1 + n2);
                swap++;
                i++;
                break; //breaking because its one to one map
            }
        }
             }
             
         }
         System.out.println(swap);
     }
}


public class MyClass {
    public static void main(String args[]) throws Exception {

      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      Tree t = new Tree();
      t.n = Integer.parseInt(br.readLine());
      String[] str = br.readLine().split(" ");
      t.tree = new int[t.n];
      for(int i = 0; i<t.n; i++)
      {
          t.tree[i] = Integer.parseInt(str[i]);
          //sorted array expected outcome
          t.ts.add(t.tree[i]);
         //  System.out.println(t.tree[i]);
          
      }
     // System.out.println(t.ts);
      t.inorderTraversal();
      t.calculateSwap();
    }
}
