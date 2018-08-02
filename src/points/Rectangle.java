package points;

public class Rectangle extends Square 
{
	private int side2;
	
	public Rectangle(int dX, int dY, int dSide1, int dSide2) 
	{
		super(dX, dY, dSide1);
		side2 = dSide2;	
	}

	public Rectangle() 
	{
		super();
		side2 = 0;
	}
	
	public String getCoordinates()
	{
		return super.getCoordinates();
	}
	
	public String getArea()
	{
		return ("Area = " + super.getSide1() * side2);
	}

}
