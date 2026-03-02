
public class CountOccurance 
{
	static int findOccurance(int[] arr,int num)
	{
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(num==arr[i])
			{
				count++;
			}
		}
		return count;
		
	}
	public static void main(String[] args) 
	{
		int arr[]= {2,3,4,2,5,6,2,7,6,2,3,9,2,4,1,2,5,2};
		System.out.println(CountOccurance.findOccurance(arr, 2));
	}
}
