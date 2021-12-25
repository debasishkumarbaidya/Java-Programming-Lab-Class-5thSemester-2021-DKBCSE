class Rectangle
{
	double a,b;
	Rectangle(double x, double y)
	{
		a=x;
		b=y;
	}
	void calculate()
	{
		double p = 2*(a+b);
		System.out.println("Perimeter of Rectangle " + p);
	} 
}
class Circle
{
	double r;
	Circle(double x)
	{
		r=x;
	}
	void calculate()
	{
		double p = 2*3.14*r;
		System.out.println("Perimeter of Circle " + p);
	} 
}

class Square
{
	double a;
	Square(double x)
	{
		a=x;
	}
	void calculate()
	{
		double p = 4*a;
		System.out.println("Perimeter of Square " + p);
	} 
}


class PeriCal
{
	public static void main(String args[])
	{
		int n = args.length;
		int i = 0; 
		while( i < n)
		{	
			if(args[i].equalsIgnoreCase("rectangle"))	
			{
				Rectangle ob = new Rectangle(Double.parseDouble(args[i+1]), Double.parseDouble(args[i+2]));
				ob.calculate();
				i=i + 3;
			}
			else if(args[i].equalsIgnoreCase("circle"))	
			{
				Circle ob = new Circle(Double.parseDouble(args[i+1]));
				ob.calculate();
				i= i + 2;
			}
			else	
			{
				Square ob = new Square(Double.parseDouble(args[i+1]));
				ob.calculate();
				i= i + 2;
			}
		}				
	}
}