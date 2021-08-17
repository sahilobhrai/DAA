package week3;
import java.util.Scanner;
import java.util.Arrays;

public class insertionSort {
	public static int co=-1;
	public static int s=0;

	public static int[] sort(int arr[],int x)
	{
		for(int i=1; i<=arr.length;i++)
		{
			int j=i-1;
			co++;
			while((j>0) && (arr[j-1]>arr[j]))
			{	if(arr[j-1]>arr[j])
				{	
					co++;
				}
				int temp=arr[j];
				arr[j]=arr[j-1];
				arr[j-1]=temp;
				j--;
				s++;
				
				
			}
		} 
		return arr;
		
	}
public static void main(String args[]) {
	Scanner sc= new Scanner(System.in);
	int x= sc.nextInt();
	int[] arr = new int[x];
	for(int b=0;b<x;b++)
	{
		arr[b]=sc.nextInt();
	}
	arr=sort(arr,x);
	System.out.println(Arrays.toString(arr));
	System.out.println("comparisons= "+s);
	System.out.println("shifts= "+co);
	}
	
}
