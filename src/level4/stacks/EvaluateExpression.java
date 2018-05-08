package stacks;

import java.util.*;

public class EvaluateExpression {
public static void main(String[] args) {
	ArrayList<String>A=new ArrayList<String>();
	A.add("2");
	A.add("4");
	A.add("+");
	A.add("2");
	A.add("/");
	int res=evaluate(A);
	System.out.println(res);
}

private static int evaluate(ArrayList<String> a) {
	int ans=0;
	int n=a.size();
	Stack<Integer>stack=new Stack<Integer>();
	for(int i=0;i<n;i++)
	{
		if(a.get(i)=="+")
		{
			stack.push(stack.pop()+stack.pop());
		}
		else if(a.get(i)=="-")
		{
			stack.push(-stack.pop()+stack.pop());
		}
		else if(a.get(i)=="*")
		{
			stack.push(stack.pop()*stack.pop());
		}
		else if(a.get(i)=="/")
		{
			int temp1=stack.pop();
			int temp2=stack.pop();
			
			stack.push(temp2/temp1);
		}
		else 
		{
			stack.push(Integer.parseInt(a.get(i)));
		}
	}
	return stack.pop();
}	

}
