import java.util.*;


public class Main
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter no. of elements: ");
		int n = scan.nextInt();
		int arr[] = new int[n];
		System.out.print("Enter the array elements: ");
		
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
		
		System.out.print("enter the index of element to be rotated: ");
		int ele = scan.nextInt();
		
		//right rotate
		ele = ele%n;
		for(int i=0; i<ele; i++)
		{
		    int last = arr[n-1];
		    for(int j=n-1; j>0; j--)
		    {
		        arr[j] = arr[j-1];
		    }
		    arr[0] = last;
		}
		for(int i=0; i<arr.length; i++)
		{
		    System.out.print(arr[i]+", ");
		}
		
	}
}