package points;

public class Square extends Point
{
	private int side1;
	
	public Square(int dX, int dY, int dSide) 
	{
		super(dX, dY);
		side1 = dSide;
	}

	public Square() 
	{
		super();
		side1 = 0;
	}

	public String getCoordinates()
	{
		return super.getCoordinates();
	}
	
	public String getArea()
	{
		return ("Area = " + side1 * side1);
	}
	
	public int getSide1()
	{
		return side1;
	}
}
