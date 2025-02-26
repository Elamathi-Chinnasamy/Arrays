import java.util.*;

public class Main
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number of elements in the array: ");
		int size = scan.nextInt();
		System.out.print("Enter the elements in the array: ");
		int arr[] = new int[size];
		for(int i=0; i<size; i++)
		{
		    arr[i] = scan.nextInt();
		}
		for(int i=0; i<size; i++)
		{
		    System.out.print(arr[i]+" ");
		}
		System.out.println();
		int sum = 0;
		for(int i=0; i<size; i++)
		{
		    sum += arr[i];
		}
		
		int total = ((size+1)*(size+2))/2;
		int missing_val = total-sum;
		System.out.println("The missing value is : "+missing_val);
	}
}