
import java.util.Scanner;

class Prac6
{  
    public static void main(String[] args)  
    {
     int n1=0,n2=1,n3,i,sum=1;
     System.out.println("Enter Days :");
     Scanner a = new Scanner(System.in);
      
        int N = a.nextInt();   
           
         System.out.print(n1+" "+n2);
         
            
         for(i=2;i<N;++i)   
         {   
          n3=n1+n2;    
          System.out.print(" "+n3);    
          n1=n2;    
          n2=n3; 
          sum=sum+n3;
         }
         System.out.println("\n"+sum);   
           
    }    
      
}
  