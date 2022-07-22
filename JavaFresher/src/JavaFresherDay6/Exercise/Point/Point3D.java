package JavaFresherDay6.Exercise.Point;

public class Point3D extends Point2D {

    private float z = 0;

    public Point3D() {
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float[] getXYZ() {
        float[] res = new float[3];
        res[0] = this.getX();
        res[1] = this.getY();
        res[2] = this.z;
        return res;
    }

    public void setXYZ(float x, float y, float z){
        setXY(x,y);
        this.z = z;
    }

    @Override
    public String toString() {
        return "(" + this.getX() +
                "," + this.getY() +
                "," + this.getZ() +
                ")";
    }
}
