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
		
		//move (-)ve numbers to left side
		int indexL = 0;
		for(int i=0; i<n; i++)
		{
		    if(arr[i] < 0)
		    {
		        int temp = arr[i];
		        arr[i] = arr[indexL];
		        arr[indexL] = temp;
		        indexL++;
		    }
		}
		System.out.println("Array after moving negative values to left: ");
		for(int num : arr)
		{
		    System.out.print(num+" ");
		}
		System.out.println();
		
		//move (-)ve numbers to right side
		int indexR = n-1;
		for(int i=n-1; i>=0; i--)
		{
		    if(arr[i] < 0)
		    {
		        int temp = arr[i];
		        arr[i] = arr[indexR];
		        arr[indexR] = temp;
		        indexR--;
		    }
		}
		System.out.println("Array after moving negative values to right: ");
		for(int num : arr)
		{
		    System.out.print(num+" ");
		}
		System.out.println();
		
		// or it can be done by sorting
		/*
		for(int i=0; i<n; i++)
		{
		    for(int j=i+1; j<n; j++)
		    {
		        if(arr[i] > arr[j])
		        {
		            int temp = arr[i];
		            arr[i] = arr[j];
		            arr[j] = temp;
		        }
		    }
		}
		System.out.print("After moving elements to one side: ");
		for(int i=0; i<n; i++)
		{
		    System.out.print(arr[i]+", ");
		}
		System.out.println();
		*/
	}
}