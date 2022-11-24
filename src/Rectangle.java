public class Rectangle extends Shape{
    protected double width;
    protected double lenght;

    public Rectangle() {
        super();
        width = 1.0;
        lenght = 1.0;
    }

    public Rectangle(double width, double lenght) {
        this.width = width;
        this.lenght = lenght;
    }

    public Rectangle(String color, boolean filled, double width, double lenght) {
        super(color, filled);
        this.width = width;
        this.lenght = lenght;

    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    @Override
    public double getArea() {
        return width*lenght;
    }

    @Override
    public double getPerimeter() {
        return 2*(width+lenght);
    }


}
