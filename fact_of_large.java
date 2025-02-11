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
		
		//factorial of large
		
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
		int large = arr[n-1];
		int fact = 1;
		for(int i=1; i<=large; i++)
		{
		    fact = fact*i;
		}
		System.out.println("the factorial of largest number("+large+") is "+fact);
	}
}