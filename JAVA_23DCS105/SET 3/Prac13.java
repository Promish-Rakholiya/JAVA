class Employee{ 

    String fn,ln;
    double s=0;

    Employee(String a,String b,double c)
    {
        fn=a;
        ln=b;
        if(c<0)
        {
            s=0.0;
        }
        else
        s=c; 
    }
    public void set(String f_name,String l_name,double sal)
    {
        fn=f_name;
        ln=l_name;
        if(s<0)
        {
            s=0.0;
        }
        else
        s=sal;
        
    }
    public void get()
    {
        System.out.println("First Name: "+fn);
        System.out.println("Last Name: "+ln);
        System.out.println("Yearly Salary: "+s*12);
    }
    
    public void raise()
    {
        s+=s*(10.0/100);
    }
}

 class Prac13{
    public static void main(String[] args)
    {
    Employee obj1 = new Employee("Promish","Rakholiya",500000);
    Employee obj2 = new Employee("Nihir","Patel",-4000.0);
    obj1.get();
    obj2.get();
    obj2 = new Employee("Nihir","Patel",4000.0);
    obj1.raise();
    obj2.raise();
    obj1.get();
    obj2.get();
    
    }
   
}
