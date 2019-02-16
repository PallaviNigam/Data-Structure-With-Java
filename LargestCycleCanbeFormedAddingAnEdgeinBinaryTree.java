
import java.util.*;
import java.io.*;

class Tree
{
     HashMap<Integer,ArrayList<Integer>> hm;
     Tree(HashMap<Integer,ArrayList<Integer>> hm)
     {
         this.hm = hm;
      //   System.out.println(hm);
     }
     
     public int[] find(int node)
     {
          int[]  ret1 = new int[2];
               int[]  ret2 = new int[2];
          int[] ret = new int[2];
         if (!hm.containsKey(node) )
         {
             //Last node
            
             ret[0] = node;
             ret[1] = 0;
         }
         else
         {
           ArrayList<Integer> arr =   hm.get(node);
          int size =  arr.size();
          if(size == 1)
          {
           int nd = arr.get(0);   
          ret =  find(nd);
          ret[1]++;
          }
          else if(size == 2)
          {
             
               int nd1 = arr.get(0);   
                int nd2 = arr.get(1);   
                ret1 =  find(nd1);
                 ret2  = find(nd2);
               
               if (ret1[1] > ret2[1])
               {
                   ret[0] =  ret1[0];
                   ret[1] =  ret1[1] + 1;
               }
               else
               {
                     ret[0] =  ret2[0];
                   ret[1] =  ret2[1] + 1;
               }
          }
               
        if (node == 1)
        {
            if (size == 1)
            {
                System.out.println(1 + " " + ret[0]);
            }
            else
            {
                System.out.println(ret1[0] + " " + ret2[0]);
            }
        }
          }
                
          return ret;
          
          }
              
          
         
     
   public void  findLargestCycle()
   {
       this.find(1);
       
   }
}
public class MyClass {
    public static void main(String args[]) throws Exception  {
       HashMap<Integer,ArrayList<Integer>> hm = new  HashMap<Integer,ArrayList<Integer>> ();
       //form Tree 
        BufferedReader br   = new BufferedReader(new InputStreamReader(System.in));
       int n = Integer.parseInt( br.readLine());
       //System.out.println(n);
       for(int i=0; i<n-1; i++)
       {
           String[] edge=br.readLine().split(" ");
     //Build Tree
         int parent = Integer.parseInt(edge[0]);
         int child = Integer.parseInt(edge[1]);
        //   System.out.println(parent + " "+child);
          if( hm.containsKey(parent))
          {
             ArrayList<Integer> ar = hm.get(parent);
             ar.add(child);
             hm.put(parent,ar);
          //   System.out.println(hm);
          }
          else
          {
               ArrayList<Integer> ar1 = new ArrayList<Integer>();
             ar1.add(child);
             hm.put(parent,ar1);
            //     System.out.println(hm);
          }
       }
       Tree t = new Tree(hm);
       t.findLargestCycle();
       
    }
}
