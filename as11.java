import java.io.BufferedReader;
import java.io.InputStreamReader;

public class as11 {
    public static void main(String aarg[])
    {
        try
        {
        int i,num=0;
        String s;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Give the no. of manager:\n");
        s=br.readLine();
        num=Integer.parseInt(s);
        Manager[] man=new Manager[num];
        for(i=0;i<num;i++)
        {
            man[i]=new Manager();
            man[i].entM();
        }
        System.out.println("Give the no. of Typist :");
        s=br.readLine();
        num=Integer.parseInt(s);
        Typist[] typ=new Typist[num];
        for(i=0;i<num;i++)
        {
            typ[i]=new Typist();
            typ[i].entT();
        }
        System.out.println("Give the no. of Officer:\n");
        s=br.readLine();
        num=Integer.parseInt(s);
        Officer[] off=new Officer[num];
        for(i=0;i<num;i++)
        {
            off[i]=new Officer();
            off[i].entO();
        }

        System.out.println("Manager details\n");
         for(i=0;i<num;i++)
        {
         man[i].show();
        }
        System.out.println("Typist Details\n");
         for(i=0;i<num;i++)
        {
         typ[i].show();
        }
        System.out.println("officer Details\n");
         for(i=0;i<num;i++)
        {
         off[i].show();
        }


    }
        catch(Exception e){

        }

}
}