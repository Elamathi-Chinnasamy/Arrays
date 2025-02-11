import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter no. of elements in array: ");
		int n = scan.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the array elements: ");

		for(int i=0; i<n; i++)
		{
			arr[i] = scan.nextInt();
		}
		System.out.println("Displaying the array elements: ");
		for(int i=0; i<n; i++)
		{
			System.out.print(arr[i]+", ");
		}
		System.out.println();
		
		int ele = -1;
        int count;
		for(int i=0; i<n; i++)
		{
			count = 0;
			for(int j=0; j<n; j++)
			{
				if(arr[i] == arr[j])
				{
					count++;
				}
			}
			if(count > n/2)
			{
			    ele = arr[i];
			}
		}
		if(ele != -1)
		{
			System.out.println("the majority element is: "+ele);
		}
		else
		{
		    System.out.println("No majority element found");
		}
	}
}