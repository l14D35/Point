package points;

public class Point extends Figure
{
	public Point(int dx, int dy)
	{
		super(dx, dy);
	}
	
	public Point()
	{
		super();
	}
	
	public String getCoordinates()
	{
		return "x = " + getX() + ", y = " + getY();
	}
	
	public String getArea()
	{
		return ("Point doesn't have area");
	}
}
