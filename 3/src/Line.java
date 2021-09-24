/**
 * This is a Class represents a line made up of two points.
 * @author Lydia Lin
 *
 */
public class Line {
	private Point p1;
	private Point p2;
	
	//getters
	/**
	 * get the p1 of the line
	 * @return the first point
	 */
	public Point getP1() {return p1;}
	
	/**
	 * get the point2 of the line 
	 * @return the second line
	 */
	public Point getP2() {return p2;}
	
	/**
	 * Construct a line and initiate it with two points.
	 */
	//constructors
	public Line()
	{
		p1 = new Point(0,0);
		p2 = new Point(0,0);
	}
	
	/**
	 * Construct a line and initiate it with two given points.
	 * @param p1 the first point of the line
	 * @param p2 another point of the line 
	 */
	public Line(Point p1, Point p2)
	{
		this.p1 = p1;
		this.p2 = p2;
	}
	
	/**
	 * Construct a line with 4 coordinate numbers of the two points.
	 * @param x1 the X of the first point
	 * @param y1 the Y of the first point
	 * @param x2 the X of the second point
	 * @param y2 the Y of the second point
	 */
	public Line(int x1, int y1, int x2, int y2)
	{
		p1 = new Point(x1,y1);
		p2 = new Point(x2,y2);
	}
	
	/**
	 * Get the length of the line
	 * @return the length in a double type
	 */
	public double getLength()
	{
		double d;
		d=Math.sqrt(Math.pow(p1.getX()-p2.getX(),2)+Math.pow(p1.getY()-p2.getY(),2));
		System.out.println(d);
		return d;
	}

}

class Point {
	private int x;
	private int y;
	
	/**
	 * get the X number of the point.
	 * @return the X
	 */
	//getters
	public int getX() { return x;}
	
	/**
	 * get the Y number of the point
	 * @return the Y
	 */
	public int getY() { return y;}
	
	/*
	 * set the x and y
	 */
	//setters
	/**
	 * set the X of the point 
	 * @param x the X of the point
	 */
	public void setX(int x)
	{
		if (x>99) {
			x = 99;
		}
		if (x<-99) {
			x=-99;
		}
		this.x = x;
	}
	
	/**
	 * set the Y of the point 
	 * @param y the Y of the point
	 */
	public void setY (int y) 
	{
		if (y>99)
		{
			y = 99;
		}
		if (y<-99) 
		{
			y=-99;
		}
		this.y = y;
	}
	
	//constructors
	/**
	 * Constructs a Point object and initialize it to give the x and y.
	 * 

	 */
	public Point() 
	{
		this.x = 0;
		this.y = 0;
	}
	
	/**
	 * Construct a point object with a x and a y
	 * @param x the X number
	 * @param y the Y number
	 */
	public Point(int x, int y) 
	{
		this.x = x;
		this.y = y;
	}
	
	/**
	 * Get the Quadrant of the point
	 * @return the Quadrant
	 */
	
	public String getQuadrant() 
	{
		 
		if (x==0 && y==0)
		{
			return "Origin";
		}
		if (x==0 || y==0)
		{
			return "border";
		}
		if (x>0) 
		{
			if (y>0) {
				return "Quadrant A";
			}
			if (y<0) {
				return "Quadrant D";
			}
			
		}
		if (y>0) {
			return "Quadrant B";
		}
		
		return "Quadrant C";
		
	}
	
	/**
	 * Print the point
	 */
	public void printPoint() 
	{
		System.out.println("("+x+","+y+")");
	}
	
	

}


class Driver {
	public static void main(String [] args ) 
	{
	
		Point p1,p2,p3,p4,p0;
		p1 = new Point(1,1);
		p2 = new Point(-1,1);
		p3 = new Point(-1,-1);
		p4 = new Point(1,-1);
		p0 = new Point(0,0);
		
		if (p0.getQuadrant()=="Origin")
			System.out.println("Origin test passed");
		else System.out.println("Origin test failed");
		
		if (p1.getQuadrant()=="A")
			System.out.println("A test passed");
		else System.out.println("A test failed");
		
		if (p2.getQuadrant()=="B")
			System.out.println("B test passed");
		else System.out.println("B test failed");
		
		if (p3.getQuadrant()=="C")
			System.out.println("C test passed");
		else System.out.println("C test failed");
		
		if (p4.getQuadrant()=="D")
			System.out.println("D test passed");
		else System.out.println("D test failed");
		
		Line l1,l2,l3;
		l1 = new Line(p0,p1);
		System.out.println(l1.getLength());
		l2 = new Line(p1,p2);
		System.out.println(l2.getLength());
		l3 = new Line(p2,p3);
		System.out.println(l3.getLength());
	
	}

}


