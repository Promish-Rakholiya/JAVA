import java.util.*;
public class Prac15 {
    int length,breadth;
    Prac15(int l,int b)
    {
        length=l;
        breadth=b;
        System.out.println("Area using constructor= "+(length*breadth));
    }

    public float returnArea(int l,int b)
    {
        return l*b;
    }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enetr the length of the rectangle: ");
        int a=sc.nextInt();
        System.out.println("Enetr the breadth of the rectangle: ");
        int b=sc.nextInt();
        Prac15 obj=new Prac15(a,b);
        float ans=obj.returnArea(a,b);
        System.out.println("Area of rectangle = "+ans);
        
    }

}

