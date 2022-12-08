package staticmethodproperty;

import sun.applet.Main;

public class TestCircle {
    public static void main(String[] args) {
        // Tạo đối tượng circle có thuộc tính radiius = 10
        AccessModifier circle = new AccessModifier(10);

        System.out.println(circle.getRadius());
        System.out.println(circle.getArea());
    }
}
