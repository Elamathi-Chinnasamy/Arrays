import java.util.*;

public class Main
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter no. of elements in array1: ");
		int n = scan.nextInt();
		int arr1[] = new int[n];
		System.out.println("Enter the array1 elements: ");
		
		for(int i=0; i<n; i++)
		{
		    arr1[i] = scan.nextInt();
		}
		System.out.println("Displaying the array1 elements: ");
		for(int i=0; i<n; i++)
		{
		    System.out.print(arr1[i]+", ");
		}
		System.out.println();
		
		System.out.println("Enter no. of elements in the array2: ");
		int m = scan.nextInt();
		int arr2[] = new int[m];
		System.out.println("Enter the array2 elements: ");
		
		for(int i=0; i<m; i++)
		{
		    arr2[i] = scan.nextInt();
		}
		System.out.println("Displaying the array2 elements: ");
		for(int i=0; i<m; i++)
		{
		    System.out.print(arr2[i]+", ");
		}
		System.out.println();
		
		boolean subset = true;
		for(int i=0; i<n; i++)
		{
		    boolean found = false;
		    for(int j=0; j<m; j++)
		    {
		        if(arr1[i] == arr2[j])
		        {
		            found = true;
		            break;
		        }
		    }
		    if(found == false)
		    {
		        subset = false;
		        break;
		    }
		}
		if(subset == true)
		{
		    System.out.println("arrays are subset of one another");
		}
		else
		{
		    System.out.println("arrays are not subset of one another");
		}
	}
}