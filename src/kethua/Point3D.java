package kethua;

public class Point3D extends Point2D {
    private float z = 0.0f;

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public Point3D() {
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        super.getXY();
        this.z = z;
    }

    public float[] getXYZ() {
        float[] array2 = new float[3];
        array2[0] = super.getX();
        array2[1] = super.getY();
        array2[2] = this.z;
        return array2;
    }

    @Override
    public String toString() {
            return "Point3D{" +
                    "z=" + z + super.toString() +
                    '}';
    }
}
