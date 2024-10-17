public class Prac10{
    public static void main(String[] args) 
    {
        String str="CHARUSAT UNIVERSITY", nstr="";
        char ch;

        System.out.println("Lenght of string :"+str.length());
        System.out.println("Convert to lowercase:"+str.toLowerCase());
        System.out.println("Convert to Uppercase :"+str.toUpperCase());

        for (int i=0; i<str.length(); i++)
      {
        ch= str.charAt(i); 
        nstr= ch+nstr; 
      }
        System.out.println("Reverse the String :"+nstr);
       

    }
}
