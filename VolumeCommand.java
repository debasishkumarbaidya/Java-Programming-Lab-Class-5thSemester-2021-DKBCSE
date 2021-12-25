import java.io.*;

public class VolumeCommand {
    public static void volumeCalc(int side)
    {
      int volumec=side*side*side;
      System.out.println("Volume of the cube= "+ volumec);
    }

    public static void volumeCalc(double r,double h)
    {
      double volumecy= 3.14 * r * r * h; 
       System.out.println("Volume of the Cylinder= "+ volumecy);
    }

    public static void volumeCalc(double a,double b,double c)
    {
       double volumeE=(4.0/3.0) * 3.14 * a * b * c;
       System.out.println("Volume of the Ellipsoid= "+volumeE);
    }


    public static void main(String[]args) throws IOException{
        for (int i = 0; i < args.length; i++) {

            if (args[i].equals("cube")) {
            VolumeCommand.volumeCalc(Integer.parseInt(args[i + 1]));
               i=i+2;
            }
            if (args[i].equals("cylinder")) {
                
            VolumeCommand.volumeCalc(Double.parseDouble(args[i + 1]),Double.parseDouble(args[i + 2]));
                
                i = i + 1;
            }
            if (args[i].equals("ellipsoid")) {
               
                VolumeCommand.volumeCalc(Double.parseDouble(args[i + 1]),Double.parseDouble(args[i + 2]),Double.parseDouble(args[i + 3]));
                
                
            }
           
        }



      
}
}
// ob.volumeCalc(radius,height);
//     ob.volumeCalc(axisA,axisB, axisC); 