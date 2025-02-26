import java.util.*;

public class Main
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the size of array1: ");
		int size1 = scan.nextInt();
		System.out.print("Enter the elements of array1: ");
		int arr1[] = new int[size1];
		for(int i=0; i<size1; i++)
		{
		    arr1[i] = scan.nextInt();
		}
		System.out.print("Enter the size of array2: ");
		int size2 = scan.nextInt();
		System.out.print("Enter the elements of array2: ");
		int arr2[] = new int[size2];
		for(int i=0; i<size2; i++)
		{
		    arr2[i] = scan.nextInt();
		}
		
		//Arrrays.sort(arr1);
		//Arrays.sort(arr2);
		
		for(int i=0; i<size1; i++)
		{
		    for(int j=i+1; j<size1; j++)
		    {
		        if(arr1[i] > arr1[j])
		        {
		            int temp = arr1[j];
		            arr1[j] = arr1[i];
		            arr1[i] = temp;
		        }
		    }
		}
		
		for(int i=0; i<size2; i++)
		{
		    for(int j=i+1; j<size2; j++)
		    {
		        if(arr2[i] > arr2[j])
		        {
		            int temp = arr2[j];
		            arr2[j] = arr2[i];
		            arr2[i] = temp;
		        }
		    }
		}
		System.out.println("Displaying elements after sorting: ");
		for(int i=0; i<size1; i++)
		{
		    System.out.print(arr1[i]+" ");
		}
		System.out.println();
		for(int i=0; i<size2; i++)
		{
		    System.out.print(arr2[i]+" ");
		}
		System.out.println();
		
		//intersection of Arrays
		System.out.println("Intersection between 2 arrays: ");
		int i=0, j=0;
		while(i<size1 && j<size2)
		{
		    if(arr1[i] < arr2[j])
		    {
		        i++;
		    }
		    else if(arr1[i] > arr2[j])
		    {
		        j++;
		    }
		    else
		    {
		        System.out.print(arr1[i]+" ");
		        i++;
		        j++;
		    }
		}
		
		
	}
}