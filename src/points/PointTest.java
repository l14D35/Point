package points;

import java.util.ArrayList;

public class PointTest 
{
	public static void main(String[] args) 
	{
		ArrayList<Figure> figures = new ArrayList<>(3);
		Figure[] figures1 = new Figure[3];
		
		figures.add(new Point(1, 2));
		figures.add(new Square(1, 1, 2));
		figures.add(new Rectangle(1, 1, 3, 4));
		
		
		figures1[0] = new Point(1, 2);
		figures1[1] = new Square(1, 1, 2);
		figures1[2] = new Rectangle(1, 1, 3, 4);
		
		for (Figure f : figures)
		{
			System.out.println(f.getClass().getSimpleName() + "| " + f.getCoordinates());
			System.out.println(f.getClass().getSimpleName() + "| " + f.getArea());
			System.out.println();
		}
		System.out.println();
		for (Figure f : figures1)
		{
			System.out.println(f.getClass().getSimpleName() + "| " + f.getCoordinates());
			System.out.println(f.getClass().getSimpleName() + "| " + f.getArea());
			System.out.println();
		}
	}

}
