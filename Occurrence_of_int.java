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
		
		//occurrence of integer
		
		System.out.print("Enter the value to find occurrence: ");
		int key = scan.nextInt();
		
		int count = 0;
		for(int i=0; i<n; i++)
		{
		    if(arr[i] == key)
		    {
		        count++;
		    }
		}
		
		System.out.println("the occurrence of "+key+" is "+count);
	}
}