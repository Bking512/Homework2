public class Rectangle extends Shape{

    private double width;
    private double length;

    public Rectangle()
    {
        this.length = 2;
        this.width = 1;
        setLW(this.length, this.width);
    }

    public Rectangle(double width, double length)
    {
        this.length = length;
        this.width = width;
        setLW(this.length, this.width);
    }

    public Rectangle(double width, double length, boolean isFilled, String Color)
    {
        super(isFilled, Color);
        this.width = width;
        this.length = length;
        setLW(this.length, this.width);

    }
    public void setLW(double x, double y)
    {
        if (x > y)
        {
           this.length = x;
           this.width= y;
        }
        else
        {
            this.width = x;
            this.length = y;
        }

    }

    public double getArea()
    {
        return length * width;
    }

    @Override
    public String toString()
    {
       return "Width: " + width + "\nlength: " + length + "\nArea: " + getArea() + "\n" + super.toString();
    }





}
