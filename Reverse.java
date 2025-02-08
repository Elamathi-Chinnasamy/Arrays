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
		
		System.out.println("reverse of an array");
		for(int i=n-1; i>=0; i--)
		{
		    System.out.print(arr[i]+", ");
		}
	}
}