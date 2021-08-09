abstract class Shape
{
	abstract void draw();
}

class Line extends Shape
{
	void draw()
	{
		System.out.println("Line: __");
	}
}

class Rectangle extends Shape
{
	void draw()
	{
		System.out.println("Rectangle: ▯");
	}
}

class Circle extends Shape
{
	void draw()
	{
		System.out.println("Circle: ●");
	}
}

public class DrawShape {
    public static void main(String args[])
    {
    	Shape s1=new Line();
    	s1.draw();
    	
    	Shape s2=new Rectangle();
    	s2.draw();
    	
    	Shape s3=new Circle();
    	s3.draw();
    }
}
