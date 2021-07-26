import java.util.Scanner;

class BinarySearch
{
    int binarysearch(int arr[],int first,int last, int num)
    {
        if(first<=last)
        {
            int mid= (first+last)/2;
            if(arr[mid]==num)
            {
                return mid;
            }
            else if(arr[mid]>num)
            {
                return binarysearch(arr ,first,mid-1,num);
            }
            else if(arr[mid]<num)
            {
                return binarysearch(arr ,mid+1,last,num);
            }
        }
        return -1;
    }
     public static void main(String args[])
    {   
        BinarySearch object=new BinarySearch();
        int arr[] = { 2, 3, 4, 10,20,30,32,38,40 };
        int last=arr.length;
        System.out.println("enter num to find");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int result= object.binarysearch(arr ,1,last, num);
        if (result == -1)
        System.out.println("Element not present");
        else
        System.out.println("Element found at index " + result);
    }
}
