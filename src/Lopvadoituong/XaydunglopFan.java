package Lopvadoituong;

public class XaydunglopFan {
    final int slow = 1;
    final int medium = 2;
    final int fast = 3;
    private int speed = slow;
    private boolean on = false;
    private double radius = 5.0;
    private String color = "blue";

    public int getSlow() {
        return slow;
    }

    public int getMedium() {
        return medium;
    }

    public int getFast() {
        return fast;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public XaydunglopFan() {
    }

    @Override
    public String toString() {
        return "XaydunglopFan{" +
                ", speed=" + speed +
                ", on=" + on +
                ", radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}

//    public static void main(String[] args) {
//        //Tạo đối tuợng Fan1
//        XaydunglopFan fan1 = new XaydunglopFan();
//        fan1.setSpeed(3);
//        fan1.setRadius(10);
//        fan1.setColor("Yellow");
//        fan1.setOn(true);
//
//        //Tạo đối tượng Fan2
//        XaydunglopFan fan2 = new XaydunglopFan();
//        fan2.setSpeed(2);
//        fan2.setRadius(5);
//        fan2.setColor("Blue");
//        fan2.setOn(false);
//
//        // Hiển thị các đối tượng:
//        System.out.println(fan1.toString());
//        System.out.println(fan2.toString());
//    }
