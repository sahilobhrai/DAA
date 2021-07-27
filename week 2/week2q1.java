import java.util.Scanner;  
   
class search
{  
  public static void main(String args[])  
    {  
        int i, j ,c, n, search, array[],count=0;
   
        Scanner in = new Scanner(System.in); 
        System.out.println("Enter number of times");  
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
   
            for (c = 0; c < n;c++)  
            {   
                if (array[c] == search)
                {
                    count++;    
                }  
            } 
             
            if (count != 0)
            {   /* Searching element is present */   
                System.out.println("present "+ search+" - "+count); 
                count=0;
            }
            else
            System.out.println("not present ");    /* Element to search isn't present */ 
        }  
    }  
}