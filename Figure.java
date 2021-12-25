package Shape;
public class Figure
{   double pi = 3.14;
    public void volume(int a)
    {
       System.out.print(a*a*a);
    } 
    public void volume(int a, int b, int c)
    {
        System.out.print(a*b*c);
    }
    public void volume(int a, int b)
    {
        System.out.print(pi*a*a*b);
    }
}