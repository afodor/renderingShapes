package shapes;

import java.io.File;

public interface Shape
{
	public double getPerimiter();
	public double getArea();
	public void renderAsJpeg(File fileToJpeg) throws Exception;
}

