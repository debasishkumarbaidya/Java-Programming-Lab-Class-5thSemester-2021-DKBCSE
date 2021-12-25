class Person 
{ 
    protected String name,gender,d_o_b;   
    int age,date,month,year;     
    public Person(String name,String gender,String d_o_b) 
    { 
        this.name=name;         
        this.gender=gender;         
        this.d_o_b=d_o_b; 
    } 
    public int get_age() 
    { 
        String s[]=d_o_b.split("/");         
        date=Integer.parseInt(s[0]);         
        month=Integer.parseInt(s[1]);         
        year=Integer.parseInt(s[2]);         
        age=2021-year;         
        if(month>11) 
        {             
            age--; 
            month=12-month+11; 
            if(date>19) 
            { 
                month--;                 
                if(month<0)                     
                age--; 
            } 
        } 
        return this.age; 
    } 
 
 
} 
 
 
class InvalidVoterException extends Exception 
{ 
    public InvalidVoterException(){ 
    System.out.println("Age is less than 18"); 
    } 
} 
 
 
class Voter extends Person 
{ 
    public Voter(String name,String gender,String d_o_b) 
    { 
        super(name,gender,d_o_b); 
    } 
    public static Boolean validVoter(int y) throws InvalidVoterException 
    { 
        if(y>=18)             
        return true;         
        else     
            throw new InvalidVoterException(); 
    } 
} 
 
 
class VoterRegistration 
{ 
    public static void main(String args[]) 
    {         int i,j=0; 
        Person p[]=new Person[5];         
        Voter v[]=new Voter[5];         
        p[0]=new Person("a", "M", "22/07/2000");         
        p[1]=new Person("b", "M", "21/02/2006");         
        p[2]=new Person("c", "F", "12/05/2015");         
        p[3]=new Person("d", "F", "06/10/2002");         
        p[4]=new Person("e", "F", "07/12/1995");         
        for(i=0;i<5;i++) 
        {            
             try 
            { 
                Voter.validVoter(p[i].get_age());                 
                v[j]=new Voter(p[i].name, p[i].gender, p[i].d_o_b); 
                j++; 
            } 
            catch(InvalidVoterException ex) 
            { 
                System.out.println(ex); 
            } 
        } 
        System.out.println("Valid voters are: ");         
        for(i=0;i<j;i++) 
        { 
            System.out.println(v[i].name+" age= "+v[i].get_age()); 
        } 
    } 
} 
 
