import java.util.Scanner;  
   
class ans   
{  
  public static void main(String args[])  
    {  
        int a,i,z,key,flag=0,c,k,j,n,search,array[];  
   
        Scanner in = new Scanner(System.in); 
        System.out.println("Enter number of times");  
        a=in.nextInt() ;
        for(z=0;z<a;z++)
        {
            System.out.println("Enter number of elements");  
            n = in.nextInt();   
            array = new int[n];  
   
            System.out.println("Enter those " + n + " elements");  
   
            for (c = 0; c < n; c++)  
            array[c] = in.nextInt();  

            System.out.println("Enter key");  
            key = in.nextInt(); 
   
            for (i = 0; i< n; i++)  
            {  
                for(j=i+1;j<n;j++)
                { 
                    if(array[j]-array[i]==key)
                    {
                        flag++;
                    }
                }
               
            }
            if(flag != 0)
            System.out.println(flag);  
            else
            System.out.println("No sequence found");  
        }  
    }  
}