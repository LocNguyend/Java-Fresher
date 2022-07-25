package JavaFresherDay6.Exercise.MoveablePoint;

public class MoveablePoint extends Point {

    private float xSpeed = 0;
    private float ySpeed = 0;

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint() {
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed(){
        float[] res = new float[2];
        res[0] = this.xSpeed;
        res[1] = this.ySpeed;
        return res;
    }

    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] move(){
        this.setX(super.getX() + this.xSpeed);
        this.setY(super.getY() + this.ySpeed);
        return this.getXY();
    }

    @Override
    public String toString() {
        return super.toString() +
                ",speed=(" + this.getxSpeed() +
                "," + this.getySpeed() +
                ")";
    }
}
