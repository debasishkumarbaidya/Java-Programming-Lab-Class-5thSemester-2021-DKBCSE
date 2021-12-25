import java.io.*;
class Employee{
    double basic,da,hra;
    String Emp_name,Emp_code,Address,Ph_no;
    void entry()
    {
         try{
             String s;
         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
         System.out.println("Give the employee name: ");
         Emp_name=br.readLine();
         System.out.println("Give the employee code: ");
         Emp_code=br.readLine();
         System.out.println("Give the employee address: ");
         Address=br.readLine();
         System.out.println("Give the employee ph no: ");
         Ph_no=br.readLine();
         }
         catch(Exception e)
         {
             System.out.println(e);
         }
        }
    void show(){
        System.out.println("Employee name :"+Emp_name);
        System.out.println("Employee code :"+Emp_code);
        System.out.println("Employee address :"+Address);
        System.out.println("Employee ph no :"+Ph_no);
        System.out.println("Enployee basic :"+basic);
        System.out.println("Employee name :"+da);
        System.out.println("Employee hra: "+hra);

    }
}
class Manager extends Employee{
    void entM()
    {
       try{
        entry();
        String s;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Give the manager basic: ");
        s=br.readLine();
        basic=Double.parseDouble(s);
        da=basic*0.1;
        hra=basic*0.2;
       }
       catch(Exception e)
       {
           System.out.println(e);
       }
    }

}

class Typist extends Employee{
    void entT()
    {
       try{
           entry();
        String s;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Give the Typist basic: ");
        s=br.readLine();
        basic=Double.parseDouble(s);
        da=basic*0.1;
        hra=basic*0.2;
       }
       catch(Exception e)
       {
           System.out.println(e);
       }
    }

}
class Officer extends Employee{
    void entO()
    {
       try{
        entry();
        String s;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Give the officer basic: ");
        s=br.readLine();
        basic=Double.parseDouble(s);
        da=basic*0.1;
        hra=basic*0.2;
       }
       catch(Exception e)
       {
           System.out.println(e);
       }
    }

}