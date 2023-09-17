/*
 * Nolan Blevins
 * Homework #4 Sierpinskis Triangle
 * March 24 2022
 * CSCE 146 
 */
import java.awt.*;
import javax.swing.*;
public class SierpinskisTriangle extends Canvas
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L; // no idea what this is but Eclipse told me to add it
	// starting point variables
	int side =400;
	int x = 50;
	int y = 410;

	public static void main(String[] args) // generates the window with Jframe, also main method
	{
		JFrame frame = new JFrame ("Triangle");
		frame.setSize(600,420);
		SierpinskisTriangle st = new SierpinskisTriangle();
		frame.add(st);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void paint(Graphics g)
	{
		drawTri(x,y,side,g);
	}
	public void drawTri(int x, int y, int side, Graphics g) // recursively creates triangles
	{
		int sub = side/2; // subdivision of 200
		int xx = x + sub; // second x value is 250
		int yy = y - sub*2; // second y value is 10
	    int xxx = x + sub*2; // third x value is 450
		int yyy = y; // third y value is 410 same as initial y
		int xpoints [] = {x,xx,xxx}; // each x spaced by 200 units
	    int ypoints [] = {y,yy,yyy}; // first and third y are both 410, second is 10
		g.drawPolygon(xpoints,ypoints,3);//the triangle
		
		if(side>20) // pixel lim of 4
		{
			// recursively drawing all triangles
		drawTri(x,y,sub,g); 
		drawTri(x+sub,y,sub,g);
		drawTri(x+(sub/2),y-(sub),sub,g);	     
		}
		
		
		/*
		 * Area below fills in all upside down recursively drawn triangles
		 */
		
		
		//center tri
		int xopoints [] = {200,250,300};
		int yopoints [] = {310,210,310};
		g.fillPolygon(xopoints,yopoints,3);
		
		
		// med small tri
		int d = 0;
		for(int j = 0; j < 8; j++)
		{
		int x1points [] = {60+25*j,75+25*j,90+25*j};
		int y1points [] = {385-50*j,410-50*j,385-50*j};
		int increase1 [] = {50,50,50};
		g.fillPolygon(x1points,y1points,3);
		
		for(; d<7; d++)
		{
			x1points[0] = x1points[0] + increase1[0];
			x1points[1] = x1points[1] + increase1[1];
			x1points[2] = x1points[2] + increase1[2];
			g.fillPolygon(x1points,y1points,3);
		}
		d=j+1;
		}
		
		
		
		// med tri
		int z = 0;
		for(int j = 0; j < 8; j++)
		{
		int x2points [] = {75+50*j,100+50*j,125+50*j};
		int y2points [] = {360-100*j,410-100*j,360-100*j};
		int increase2 [] = {100,100,100};
		g.fillPolygon(x2points,y2points,3);
		
		for(; z<3; z++)
		{
			x2points[0] = x2points[0] + increase2[0];
			x2points[1] = x2points[1] + increase2[1];
			x2points[2] = x2points[2] + increase2[2];
			g.fillPolygon(x2points,y2points,3);
		}
		z= j+1;
		}
		
		// large tri
		int q = 0;
		for(int j = 0; j < 3; j++)
		{
		int x2points [] = {100+50*j,150+50*j,200+50*j};
		int y2points [] = {310-100*j,410-100*j,310-100*j};
		int increase2 [] = {100,100,100};
		g.fillPolygon(x2points,y2points,3);
		
		for(; q<2; q++)
		{
			x2points[0] = x2points[0] + increase2[0];
			x2points[1] = x2points[1] + increase2[1];
			x2points[2] = x2points[2] + increase2[2];
			g.fillPolygon(x2points,y2points,3);
		}
		q= j+1;
		}
		
		// small tri at bottom
		int k = 0;
		for(int j = 0; j < 8; j++)
		{
		int xLpoints [] = {56+12*j,63+12*j,71+12*j};
		int yLpoints [] = {398-25*j,410-25*j,398-25*j};
		int Lincrease [] = {25,25,25};
		g.fillPolygon(xLpoints,yLpoints,3);
		
		for(; k<15; k++)
		{
			xLpoints[0] = xLpoints[0] + Lincrease[0];
			xLpoints[1] = xLpoints[1] + Lincrease[1];
			xLpoints[2] = xLpoints[2] + Lincrease[2];
			
			g.fillPolygon(xLpoints,yLpoints,3);
		}
		k = j+1;
		}
		// small tri at top
		int r = 0;
		for(int j = 0; j < 8; j++)
		{
		int xRpoints [] = {155+12*j,163+12*j,171+12*j};
		int yRpoints [] = {198-25*j,211-25*j,198-25*j};
		int Rincrease [] = {25,25,25};
		g.fillPolygon(xRpoints,yRpoints,3);
		
		for(; r<7; r++)
		{
			xRpoints[0] = xRpoints[0] + Rincrease[0];
			xRpoints[1] = xRpoints[1] + Rincrease[1];
			xRpoints[2] = xRpoints[2] + Rincrease[2];
			
			g.fillPolygon(xRpoints,yRpoints,3);
		}
		r = j+1;
		}
		}
		
		}
	

			
			




			




		
		

			

			

			
		
		
	
	


