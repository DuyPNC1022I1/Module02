package abstractandinterface;

public class SquareTest {
    public static void main(String[] args) {
        Square[] square = new Square[3];
        square[0] = new Square(1);
        square[1] = new Square(2);
        square[2] = new Square(3);

        for (int i = 0; i < square.length; i++) {
            square[i].getArea(square[i].getSide());
        }
    }
}
