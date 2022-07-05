public class Shape {

    private boolean isFilled;
    private String color;

    public Shape()
    {
       this.isFilled = true;
       this.color = "Green";
    }

    public Shape(boolean isFilled, String Color)
    {
        this.isFilled = isFilled;
        this.color = Color;
    }

    @Override
    public String toString()
    {
        return "Filled: " + isFilled + "\n" + "Color: " + color;
    }









}
