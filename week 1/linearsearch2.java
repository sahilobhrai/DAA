import java.util.Scanner;  
   
class linear_search2   
{  
  public static void main(String args[])  
    {  
        int i, j ,c, n, search, array[];  
   
        Scanner in = new Scanner(System.in); 
        System.out.println("Enter number of times you want to check");  
        i=in.nextInt() ;
        for(j=0;j<i;j++)
        {
            System.out.println("Enter number of elements");  
            n = in.nextInt();   
            array = new int[n];  
   
            System.out.println("Enter those " + n + " elements");  
   
            for (c = 0; c < n; c++)  
            array[c] = in.nextInt();  
   
            System.out.println("Enter value to find");  
            search = in.nextInt();  
   
            for (c = 0; c < n; c++)  
            {  
                if (array[c] == search)     /* Searching element is present */  
            {  
                System.out.println("present " + (c+1) + ".");  
                break;  
            }  
            }  
            if (c == n)  /* Element to search isn't present */  
            System.out.println("not present "+ (c) + ".");  
        }  
    }  
}