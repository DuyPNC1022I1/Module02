package Lopvadoituong;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        double delta;
        delta = b * b - 4 * a * c;
        return delta;
    }

    public double getRoot1() {
        double r1;
        r1 = (-b + Math.sqrt(b * b - 4 * a * c)) / 2 * a;
        return r1;
    }

    public double getRoot2() {
        double r2;
        r2 = (-b - Math.sqrt(b * b - 4 * a * c)) / 2 * a;
        return r2;
    }

    public double getRoot3() {
        double r3;
        r3 = (-b / (2 * a));
        return  r3;
    }
}
//    public static void main(String[] args) {
//        QuadraticEquation test = new QuadraticEquation(1, 9, 1);
//        double delta1 = test.getDiscriminant();
//        System.out.println(delta1);
//        if (delta1 > 0) {
//            System.out.println("Nghiệm thứ 1 của phương trình là: " + test.getRoot1());
//            System.out.println("Nghiệm thứ 2 của phương trình là: " + test.getRoot2());
//        }
//        else if (delta1 == 0) {
//            System.out.println("Nghiệm của phương trình đã cho là" + test.getRoot3());
//        }
//        else {
//            System.out.println("The equation has no roots");
//        }
//    }