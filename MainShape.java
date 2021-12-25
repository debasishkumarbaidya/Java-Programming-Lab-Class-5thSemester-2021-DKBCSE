import java.io.*;
import Shape.*;
class MainShape
{
    public static void main(String args[]) throws IOException
    {
        int a,b,c;
        String s;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Figure ob = new Figure();
        System.out.print("Enter (Cube, Rectangle or Cylinder) : ");
        s=br.readLine();
        if(s.equalsIgnoreCase("cube") == true)
            {   System.out.print("");
                a=Integer.parseInt(br.readLine());
                ob.volume(a);
            }
        else if(s.equalsIgnoreCase("rectangle") == true)
        {
            a=Integer.parseInt(br.readLine());
            b=Integer.parseInt(br.readLine());
            c=Integer.parseInt(br.readLine());
            ob.volume(a,b,c);
        }
        else if(s.equalsIgnoreCase("cylinder") == true)
        {
            a=Integer.parseInt(br.readLine());
            b=Integer.parseInt(br.readLine());
            ob.volume(a,b);
        }
    }
}