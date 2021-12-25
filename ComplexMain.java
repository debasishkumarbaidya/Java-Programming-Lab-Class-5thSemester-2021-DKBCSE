import java.io.BufferedReader;
import java.io.InputStreamReader;

class Complex {

    double real, imaginery;

    Complex() {
        real = 56;
        imaginery = 80;
    }

    Complex(double a, double b) {
        real = a;
        imaginery = b;
    }

    Complex(Complex c) {
        real = c.real + 10;
        imaginery = c.imaginery + 10;
    }

    Complex addition(Complex a, Complex b) {
        real = a.real + b.real;
        imaginery = a.imaginery + b.imaginery;
        return this;
    }

    Complex subtraction(Complex a, Complex b) {
        real = a.real - b.real;
        imaginery = a.imaginery - b.imaginery;
        return this;
    }

    Complex multiplication(Complex a, Complex b) {
        real = a.real * b.real - (a.imaginery * b.imaginery);
        imaginery = a.imaginery * b.real + a.real * b.imaginery;
        return this;
    }
    }



class ComplexMain {
    public static void main(String args[]) throws Exception {

        BufferedReader ar = new BufferedReader(new InputStreamReader(System.in));

        Complex result = new Complex();

        //For c1 and c2
        Complex c1 = new Complex();
        Complex c2 = new Complex();
      
        result = result.addition(c1, c2);
        System.out.println("Addition---->" + result.real + " + " + result.imaginery + "i");

        result = result.subtraction(c1, c2);
        System.out.println("Subtraction ---> " + result.real + " + " + result.imaginery + "i");

        result = result.multiplication(c1, c2);
        System.out.println("Multiplication ---->" + result.real + " + " + result.imaginery + "i");

        //For c3 and c4

        System.out.println("Enter values for c3 : ");
        double real = Double.parseDouble(ar.readLine());
        double imag = Double.parseDouble(ar.readLine());
        Complex c3 = new Complex(real, imag);

        System.out.println("Enter values for c4 : ");
        real = Double.parseDouble(ar.readLine());
        imag = Double.parseDouble(ar.readLine());
        Complex c4 = new Complex(real, imag);

        result = result.addition(c3, c4);
        System.out.println("Addition---->" + result.real + " + " + result.imaginery + "i");
        result = result.subtraction(c3, c4);
        System.out.println("Subtraction--->" + result.real + " + " + result.imaginery + "i");
        result = result.multiplication(c3, c4);
        System.out.println("Multiplication---> " + result.real + " + " + result.imaginery + "i");

         //For c5 and c6
        Complex c5 = new Complex(c3);
        Complex c6 = new Complex(c4);

        result = result.addition(c5, c6);
        System.out.println("Addition--->" + result.real + " + " + result.imaginery + "i");
        result = result.subtraction(c5, c6);
        System.out.println("Subtraction--->" + result.real + " + " + result.imaginery + "i");
        result = result.multiplication(c5, c6);
        System.out.println("Multiplication--->" + result.real + " + " + result.imaginery + "i");

    }
}