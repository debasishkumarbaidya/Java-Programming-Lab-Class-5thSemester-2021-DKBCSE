import java.io.*;

public class VolumeB {
    public void volumeCalc(int side)
    {
      int volumec=side*side*side;
      System.out.println("Volume of the cube= "+ volumec);
    }

    public void volumeCalc(double r,double h)
    {
      double volumecy= 3.14 * r * r * h; 
       System.out.println("Volume of the Cylinder= "+ volumecy);
    }

    public void volumeCalc(double a,double b,double c)
    {
       double volumeE=(4.0/3.0) * 3.14 * a * b * c;
       System.out.println("Volume of the Ellipsoid= "+volumeE);
    }

    public static void main(String[]args) throws IOException{
   
    InputStreamReader r=new InputStreamReader(System.in);    
    BufferedReader br =new BufferedReader(r);  

    System.out.println("Enter Side of Cube: ");
    
    int side = Integer.parseInt(br.readLine());

    System.out.println("Enter radius and height: ");
    

    int radius=Integer.parseInt(br.readLine());
    int height=Integer.parseInt(br.readLine());

    System.out.println("Enter Axis of Ellipsoid: ");

    double axisA =Integer.parseInt(br.readLine());
    double axisB =Integer.parseInt(br.readLine());
    double axisC =Integer.parseInt(br.readLine());


VolumeB ob = new VolumeB();
    ob.volumeCalc(side);
    ob.volumeCalc(radius,height);
    ob.volumeCalc(axisA,axisB, axisC);   
}
}
