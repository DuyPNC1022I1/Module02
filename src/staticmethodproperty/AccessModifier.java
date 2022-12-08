package staticmethodproperty;

public class AccessModifier {
    private double radius = 1.0;
    private String color = "red";

    public AccessModifier() {
    }

    public AccessModifier(double r) {
        radius = r;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        double area = radius * radius  * Math.PI;
        return area;
    }
}
