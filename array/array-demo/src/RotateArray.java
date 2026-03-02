import java.util.Arrays;

public class RotateArray
{
	 static int[] rotateArrayFromRight(int[] arr) 
	{
		int num= arr[arr.length-1];
		for(int i=arr.length-1;i>0;i--)
		{
			arr[i]=arr[i-1];
		}
		arr[0]=num;
		return arr;
	}
	public static void main(String[] args)
	{
		int arr[]= {2,4,7,1,8,3};
		int[] arr2=RotateArray.rotateArrayFromRight(arr);
		System.out.println(Arrays.toString(arr2));
	}

	

}
