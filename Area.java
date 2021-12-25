import java.io.*;

class square {
    int n;

    square(int m) {
        n = m;
    }

    int area() {
        return (n * n);
    }
}

class rectangle {
    int x;
    int y;

    rectangle(int n, int m) {
        x = n;
        y = m;
    }

    int area() {
        return (x*y);
    }
}

class circle {
    double r;

    circle(double x) {
        r = x;
    }

    double area() {

        return ( 3.14 * r * r);
    }
}

class Area {

    public static void main(String args[]) throws IOException {
        InputStreamReader r=new InputStreamReader(System.in);    
        BufferedReader br =new BufferedReader(r);  

        System.out.println("Enter Radius: ");
        
        
        double radius = Integer.parseInt(br.readLine());

        System.out.println("Enter Length and Breath: ");
        

        int length=Integer.parseInt(br.readLine());
        int breath=Integer.parseInt(br.readLine());

        System.out.println("Enter Length of Square: ");

        int side =Integer.parseInt(br.readLine());


        circle cq = new circle(radius);
             System.out.println("perimeter of circle is " + cq.area());
        
             rectangle rq = new rectangle(length, breath);
             System.out.println("perimeter of rectangle is " + rq.area());

             square sq = new square(side);
                System.out.println("perimeter of square is " + sq.area());

    }
    

}