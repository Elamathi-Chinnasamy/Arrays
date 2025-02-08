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
		
		//move 0's to end 
		int index = 0;
		for(int i=0; i<n; i++)
		{
		    if(arr[i] != 0)
		    {
		        arr[index] = arr[i];
		        index++;
		    }
		}
		while(index < n)
		{
		    arr[index] = 0;
		    index++;
		}
		
		for(int i=0; i<n; i++)
		{
		    System.out.print(arr[i]+", ");
		}
		System.out.println();
	}
}