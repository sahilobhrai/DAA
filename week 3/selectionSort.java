package week3;
import java.util.Scanner;
import java.util.Arrays;
public class selectionSort {

		public static int co=0;
		public static int s=0;

		public static int[] sort(int arr[],int x)
		{
			for(int i=0; i<arr.length-1;i++)
			{	int min=i;
				for(int j=i+1;j<arr.length;j++)
				{	if(arr[j]<arr[min])
					{	
						int temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
					
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
		co=(x*(x-1))/2;
		System.out.println("comparisons= "+co);
		s=x-1;
		System.out.println("swaps= "+s);
		}
		
	}


