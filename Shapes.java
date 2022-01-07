import java.applet.*;
import java.awt.*;
public class Shapes extends Applet
{
    //Function to initialize the applet
    public void init()
    {
	setBackground(Color.white);
    }
    //Function to draw and fill shapes
    public void paint(Graphics g)
    {
	//Draw a circle
	g.setColor(Color.black);
	g.drawString("Circle",400,200);
	g.drawOval(350,50,125,125);
	g.setColor(Color.yellow);
	g.fillOval(350,50,125,125);	
    //Draw a square
	g.setColor(Color.black);
	g.drawString("Square",75,200);
	int x[]={50,150,150,50};
	int y[]={50,50,150,150};
	g.drawPolygon(x,y,4);
	g.setColor(Color.yellow);
	g.fillPolygon(x,y,4);
	//Draw an ellipse
	g.setColor(Color.black);
	g.drawString("ellipse",100,380);
	g.drawOval(50,250,150,100);
	g.setColor(Color.yellow);
	g.fillOval(50,250,150,100);	
	

    }
}
