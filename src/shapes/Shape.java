package shapes;

import java.awt.Color;
import java.io.File;

public abstract class Shape implements Comparable<Shape>
{
	public abstract double getPerimiter();
	public abstract double getArea();
	public abstract void renderAsJpeg(File fileToJpeg) throws Exception;
	
	private Color drawingColor = Color.BLACK;
	
	@Override
	public int compareTo(Shape o)
	{
		return Double.compare(this.getArea(), o.getArea());
	}
	
	public Color getColor() 
	{
		return drawingColor;
	}
	
	public void setColor(Color color)
	{
		this.drawingColor = color;
	}
}

