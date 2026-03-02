import java.util.LinkedHashSet;
import java.util.Set;

public class DisplayTwice
{
	static Set<Integer> getNum(int arr[])
	{
		LinkedHashSet<Integer> set=new LinkedHashSet<Integer>();
		for(int i=0;i<arr.length;i++)
		{
		int num=CountOccurance.findOccurance(arr, arr[i]);
		if(num==2)
		{
			set.add(arr[i]);
		}
		}
		return set;
	}
	public static void main(String[] args) 
	{
		int arr[]= {2,3,4,5,6,2,3,4,56,7,5,4,32,3,7,8,8,2,2,3,7,9,9};
		System.out.println(DisplayTwice.getNum(arr));
	}
}
