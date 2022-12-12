package abstractandinterface;

public class Circle3 implements Resizeable3{
    public double radius;

    public Circle3(double radius) {
        this.radius = radius;
    }

    @Override
    public void resize(double percent) {
        System.out.println("AreaCircle before: "+  radius * radius * Math.PI);
        System.out.println("AreaCircle after: "+ radius * percent * radius * percent * Math.PI);
    }
}
