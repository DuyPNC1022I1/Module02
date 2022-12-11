package kethua;

public class Rectangle extends Hecacdoituonghinhoc {
    public double width;
    public double length;

    public Rectangle() {
        this.width = 1.0;
        this.length = 1.0;
    }

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double geArea() {
        return width * this.length;
    }

    public double getPrimeter() {
        return 2 * (width + this.length);
    }

    @Override
    public String toString() {
        return "A Rectangle with" +
                "width=" + width +
                "and length=" + length +
                super.toString();
    }
}
