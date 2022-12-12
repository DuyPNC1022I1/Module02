package abstractandinterface;

import javax.xml.bind.SchemaOutputResolver;

public class Square implements Colorable {
    public int side;

    public Square(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void getArea(int side) {
        System.out.println("Area of Square is: " + side * side);
    }
    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }
}
