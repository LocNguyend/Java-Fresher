package JavaFresherDay5.Circle;

public class Circle {

    private double radius = 1.0;

    private String color = "red";

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    // public modifier
    /*public double getRadius() {
        return radius;
    }

    public double getArea(){
        return Math.PI * Math.pow(this.getRadius(),2);
    }
    */


    //default
    /*
    double getRadius() {
        return radius;
    }

    double getArea(){
        return Math.PI * Math.pow(this.getRadius(),2);
    }
    */

    //private
    /*
    private double getRadius() {
        return radius;
    }

    private double getArea(){
        return Math.PI * Math.pow(this.getRadius(),2);
    }
     */

    //protected

    protected double getRadius() {
        return radius;
    }

    protected double getArea(){
        return Math.PI * Math.pow(this.getRadius(),2);
    }

}
