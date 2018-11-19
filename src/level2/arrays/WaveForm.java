package arrays;
import java.util.*;


public class WaveFormArray {
	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>();
		list.add(2);
		list.add(3);
		list.add(5);
		list.add(10);
		list.add(11);
		list.add(1);
		wave(list);
	System.out.println(list);	
	}
	public static void wave (ArrayList<Integer>list)
	{
		int n=list.size();
		Collections.sort(list);
		for(int i=0;i<n-1;i=i+2)
		{
			swap(list,i,i+1);
		}
	}
	public static void  swap(ArrayList<Integer>list,int a,int b)
	{
		int temp=list.get(a);
		list.set(a, list.get(b));
		list.set(b, temp);
	}
}
