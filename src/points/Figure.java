package points;

public abstract class Figure 
{
	private int x;
	private int y;
	
	public Figure(int dx, int dy)
	{
		x = dx;
		y = dy;
	}
	
	public Figure()
	{
		x = 0;
		y = 0;
	}
	
	public abstract String getCoordinates();
	public abstract String getArea();
	
	public int getX()
	{
		return x;
	}
	
	public int getY()
	{
		return y;
	}
}
