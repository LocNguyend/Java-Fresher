package JavaFresherDay6.Exercise.CircleCylinder;

public class Cylinder extends Circle{

    private double height = 1.0;

    public Cylinder() {
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume(){
        return super.getArea() * this.getHeight();
    }

    @Override
    public double getArea() {
        return super.getArea() * 2 + super.getPerimeter() * this.getHeight();
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                " radius=" + this.getRadius() +
                " color='" + this.getColor() + '\'' +
                '}' + " is subclass of " + super.toString();
    }
}
