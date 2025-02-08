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
		
		System.out.print("enter the element to be checked: ");
		int check = scan.nextInt();
		boolean found = false;
		
		for(int i=0; i<n; i++)
		{
		    if(arr[i]==check)
		    {
		        found = true;
		        break;
		    }
		}
		if(found == true)
		{
		    System.out.println(check+", the element found in the array");
		}
		else
		{
		    System.out.println(check+", the element not found in the array");
		}
	}
}