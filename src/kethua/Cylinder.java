package kethua;

public class Cylinder extends Circle1{
    public double height;

    public Cylinder() {
    }

    public Cylinder(double height) {
        this.height = height;
    }
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return radius * radius * height * Math.PI ;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                super.toString() +
                '}';
    }
}
