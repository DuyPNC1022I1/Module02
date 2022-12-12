package abstractandinterface;

public class Circle3Test {
    public static void main(String[] args) {
        Circle3 [] circle = new Circle3[3];
        circle[0] = new Circle3(1);
        circle[1] = new Circle3(2);
        circle[2] = new Circle3(3);

        for (int i = 0; i < circle.length; i++) {
            circle[i].resize(Math.random());
        }

    }
}
