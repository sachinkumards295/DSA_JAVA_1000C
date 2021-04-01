package ll;
import java.util.*;

class Node{
	int data;
	Node next;
	Node(int d)
	{
		data=d;
		next=null;
		
	}
}

class lli{
	Node head;
	public void addtothelast(Node node)
	{
		if(head==null)
		{
			head=node;
		}
		else
		{
			Node temp=head;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=node;
		}
	}
	
}
class N{
	void display(Node head)
	{
		Node n=head;
		while(n!=null)
		{
			System.out.println(n.data+" ");
			n=n.next;
		}
	}
}

public class a {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
while(t-- > 0)
{
 int n=sc.nextInt();
 lli list=new lli();
 int a1=sc.nextInt();
 Node head=new Node(a1);
 list. addtothelast(head);

 for(int i=1; i<n; i++)
 {
	 int a=sc.nextInt();
	 list.addtothelast(new Node(a));
 }

 N obj=new N();
 obj.display(list.head);
 System.out.println();
 

 
 
 
 
 
}
	}
	

}
