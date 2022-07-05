public class Circle extends Shape{

    private double radius;

    public Circle()
    {
        this.radius = 1;
    }

    public Circle(double radius)
    {
        this.radius = radius;
    }

    public Circle(double radius, boolean isFilled, String Color)
    {
        super(isFilled, Color);
        this.radius = radius;

    }

    public double getArea()
    {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString()
    {
        return "Radius: " + radius + "\n" + "Area: " + getArea() + "\n" + super.toString();
    }



}
