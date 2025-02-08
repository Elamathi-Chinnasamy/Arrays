import java.util.*;

public class Main
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter no. of elements: ");
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
		int sum = 0;
		for(int i=0; i<n; i++)
		{
		    sum = sum+arr[i];
		}
		System.out.println("The sum of array elements: "+sum);
	}
}