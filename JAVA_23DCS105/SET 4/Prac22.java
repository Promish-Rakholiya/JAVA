import java.util.*;
interface AdvancedArithmetic{
    int divisor_sum(int n); 
}

class calledMyCalculator implements AdvancedArithmetic{
    int sum;
    public int divisor_sum(int n){
        
        for(int i=1;i<=n;i++){
            if(n%i==0){
                sum+=i;
            }
        }
return sum;
    }
}

public class Prac22 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Number : ");
        int n=sc.nextInt();
        calledMyCalculator obj=new calledMyCalculator();
        System.out.println("Sum of All Divisors = "+obj.divisor_sum(n));

    }
}