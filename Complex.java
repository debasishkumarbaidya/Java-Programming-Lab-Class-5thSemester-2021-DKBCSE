import java.io.*;
class Complex
{
        int real;
        int imaginary;
        Complex(int real,int imaginary)
        {
                        this.real=real;
                        this.imaginary=imaginary;
        }
        Complex(Complex c)
        {
                        real=c.real;
                        imaginary=c.imaginary;
        }
        Complex()
        {}
        public Complex addition(Complex c2)
        {
                        Complex c3=new Complex();
                        c3.real=real+c2.real;
                        c3.imaginary=imaginary+c2.imaginary;
                        System.out.println("The Result of addition is");
                       
                        return c3;
        }
        public Complex subtraction(Complex c2)
        {
                        Complex c3=new Complex();
                        c3.real=real-c2.real;
                        c3.imaginary=imaginary-c2.imaginary;
                        System.out.println("The Result of subtraction is");
                       
                        return c3;
        }
        public Complex multiplication(Complex c2)
        {
                        Complex c3=new Complex();
                        c3.real=real*c2.real;
                        c3.imaginary=imaginary*c2.imaginary;
                        System.out.println("The Result of multiplication is");
                       
                        return c3;
        }
        public void showComplexNo()
        {
                        System.out.println("The Complex No Is\n"+real+"+i("+imaginary+")");
        }
}
class ComplexMain
{
        public static void main(String args[])
        {
                        int r1=0,i1=0,r2=0,i2=0;
                        try
                        {
                                        System.out.println("Enter The First Complex Number");
                                        System.out.println("Enter The Real part of the Complex Number");
                                        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                                        r1=Integer.parseInt(br.readLine());
                                        System.out.println("Enter The Imaginary part of the Complex Number");
                                        i1=Integer.parseInt(br.readLine());
                        }
                        catch(Exception e)
                        {
                                        System.out.println(e);
                        }
                        Complex c1=new Complex(r1,i1);
                        c1.showComplexNo();
                        try
                        {
                                        System.out.println("\nEnter The Second Complex Number");
                                        System.out.println("Enter The Real part of the Complex Number");
                                        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                                        r2=Integer.parseInt(br.readLine());
                                        System.out.println("Enter The Imaginary part of the Complex Number");
                                
                                        i2=Integer.parseInt(br.readLine());
                        }
                        catch(Exception e)
                        {
                                        System.out.println(e);
                        }
                        Complex c2=new Complex(r2,i2);
                        Complex c = new Complex();
                        c.showComplexNo();
                        Complex copied = new Complex(c);
                        copied.showComplexNo();
                        c2.showComplexNo();
                        Complex c3=new Complex();
                        c3=c1.addition(c2);
                        c3.showComplexNo();
                        Complex c4=new Complex();
                        c4=c1.subtraction(c2);
                        c4.showComplexNo();
                        Complex c5=new Complex();
                        c5=c1.multiplication(c2);
                        c5.showComplexNo();
        }
}