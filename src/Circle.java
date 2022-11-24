public class Circle extends Shape{
    protected double radious;

    public Circle() {
        super();
        radious = 1.0;
    }

    public Circle(double radious){
        this.radious = radious;

    }

    public Circle(String color, boolean filled, double radious) {
        super(color, filled);
        this.radious = radious;
    }

    public double getRadious() {
        return radious;
    }

    public void setRadious(double radious) {
        this.radious = radious;
    }

    @Override
    public double getArea() {
        return radious*radious*Math.PI;
    }

    @Override
    public double getPerimeter() {
        return 2*radious*Math.PI;
    }




}
