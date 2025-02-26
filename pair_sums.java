import java.util.*;

public class Main
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the size of the array: ");
		int size = scan.nextInt();
		System.out.print("Enter the elements of array: ");
		int arr[] = new int[size];
		
		for(int i=0; i<size; i++)
		{
		    arr[i] = scan.nextInt();
		}
		
		// sum of pairs
		
		System.out.print("Enter the sum of pair elements: ");
		int target = scan.nextInt();
		
		for(int i=0; i<size; i++)
		{
		    for(int j=i+1; j<size; j++)
		    {
		        if(target == arr[i]+arr[j])
		        {
		            System.out.println("the sum pairs of elements are ["+arr[i]+" , "+arr[j]+"]");
		        }
		    }
		}
	}
}