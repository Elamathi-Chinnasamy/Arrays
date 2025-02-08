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
		
		//kth largest element
		
		System.out.print("Enter the value of k: ");
		int k = scan.nextInt();
		Arrays.sort(arr);
		/*
		//sorting
		for(int i=0; i<n; i++)
		{
		    for(int j=i+1; j<n; j++)
		    {
		        if(arr[i] > arr[j])
		        {
		            int temp = arr[j];
		            arr[j] = arr[i];
		            arr[i] = temp;
		        }
		    }
		}
		*/
		System.out.println("the "+k+"th largest element is "+arr[n-2]);
		
	}
}