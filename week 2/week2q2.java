import java.util.Scanner;  
   
class find   
{  
  public static void main(String args[])  
    {  
        int a,i,z,flag=0,c,k,j,n,search,array[];  
   
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
   
            for (i = 0; i< n; i++)  
            {  
                for(j=i+1;j<n;j++)
                { 
                    for(k=j+1;k<n;k++)
                    {
                        if(array[i]+array[j]==array[k])
                        {
                            System.out.println(i+" , "+j+" , "+k);
                            flag=1;
                        }
                    }
               
                }  
            }
            if(flag==0)
            System.out.println("No sequence found");  
        }  
    }  
}