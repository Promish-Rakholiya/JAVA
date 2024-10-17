import java.util.Scanner;

public class Prac8 
{
    static int count9(int a[]) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 9)
                count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int size;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array :");
        size=sc.nextInt();
        int array[]=new int[size];
        
        for (int i=0;i<size;i++) {
            System.out.println("a["+i+"]");
            array[i]=sc.nextInt();
        }
        System.out.println("Number of 9 in given array is :"+count9(array));
        sc.close();
    }


    
}
