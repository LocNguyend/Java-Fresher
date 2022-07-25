package JavaFresherDay6.Exercise.Triangle;

public class Triangle extends Shape{

    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    public Triangle() {
    }

    public Triangle(double side1, double side2, double side3) {
        double[] iter = {side1, side2, side3};
        boolean invalid = true;
        for (int i =1; i < 3; i++) {
            if (iter[i] > 0) {
                invalid = false;
            }
            else
                invalid = true;
        }
        if (!invalid) {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        }
        else
            System.out.println("Valid input");
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public boolean isValid() {
        double a = this.side1;
        double b = this.side2;
        double c = this.side3;
        if (a + b > c && a + c > b && b + c > a) {
            return true;
        }
        else
            return false;
    }

    public double getArea(){
        if (!this.isValid()){
            return 0;
        }
        else {
            double p = (this.side1 + this.side2 + this.side3)/2;
            double s_sqrt = p * (p - this.side1) * (p - this.side2) * (p - this.side3);
            double s = Math.sqrt(s_sqrt);
            return s;
        }
    }

    public double getPerimeter(){
        if (this.isValid()){
            double p = this.side1 + this.side2 + this.side3;
            return p;
        }
        else {
            return 0;
        }
    }

    @Override
    public String toString() {
        if (!this.isValid()){
            return "Can't create triangle from input edges";
        }
        else {
            return "Triangle{" + super.getColor() +
                    "), 3 edges a,b,c: " + this.side1 +
                    "," + this.side2 +
                    "," + this.side3 +
                    "}";
        }
    }
}
