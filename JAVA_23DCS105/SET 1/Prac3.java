import java.util.Scanner;

class Prac3
{
public static void main(String[] args)
{


float sp,spk,spm;
Scanner a = new Scanner(System.in);

System.out.println("Enter distance (meter) :");
int distance= a.nextInt();

System.out.println("Enter time (hours) :");
int time_h= a.nextInt();

System.out.println("Enter time (minutes) :");
int time_m= a.nextInt();

System.out.println("Enter time (second) :");
int time_s= a.nextInt();

float km=distance/1000;
System.out.println("Distance in km :"+km);

float ml=distance/1609;
System.out.println("Distance in miles :"+ml);

sp=distance/time_s;
System.out.println("Speed in m/s:" + sp);

spk=km/time_h;
System.out.println("Speed in km/h:" + spk);


spm=ml/time_h;
System.out.println("Speed in ml/h:" + spm);
}
}
