import java.util.*;
import java.io.*;
class Edge implements Comparable<Edge>
{
	int weight;
	int from;
	int to;
	public int compareTo(Edge compareedge)
	{
		int compareQuantity = ((Edge) compareedge).weight;
		return  (this.weight - compareQuantity);
	}
	}
class Graph{
	int[] node;
	Edge[] edges;
	int i= 0;
	int[] parent;
	Graph( int n, int e)
	{
		node = new int[n+1];
		edges = new Edge[e];
	}
	public void addEdge(int from, int to, int w)
	{  edges[i] = new Edge();
		edges[i].from = from;
		edges[i].to = to;
		edges[i].weight = w;
		i++;
	}
	public int find(int node)
	{
		if (parent[node] == -1)
		{
			return node;
		}
		else
		{
			return(find(parent[node]));
		}
	}
	public void union(int x, int y)
	{
		int n1 = find(x);
		int n2 = find(y);
		parent[n2] = n1; 
		}
	public void findMin(int desired_sum)
	{
		this.parent = new int[(node.length)];
		int no_visited = 0;
	Arrays.sort(edges);	
	for(int j = 0; j<i;j++)
	{
		//System.out.println(edges[j].weight);
	}
	for (int j = 0; j< node.length; j++)
	{
		parent[j]= -1;
		//System.out.println(parent[j]);
	}
	for(int j = 0; j< edges.length; j++ )
	{
		//System.out.println(edges[j].from + " "+ edges[j].to );
		int x = find(edges[j].from);
		int y = find(edges[j].to);
		if (x != y)
				{
			System.out.println("include"+ edges[j].from + " "+ edges[j].to + "with weight" + edges[j].weight);
				union( x,  y);
				}
		
	}
}}
public class First {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		int no_city = Integer.parseInt(str[0]);
		int no_road = Integer.parseInt(str[1]);
		int desired_w =  Integer.parseInt(str[2]);
	Graph g = new Graph(no_city,no_road);
	for (int i = 0;i<no_road;i++)
	{
		 str = br.readLine().split(" ");
		g.addEdge(Integer.parseInt(str[0]), Integer.parseInt(str[1]), Integer.parseInt(str[2]));
	}
	
	g.findMin(desired_w);
	}

}
