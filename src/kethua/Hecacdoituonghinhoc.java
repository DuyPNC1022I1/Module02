package kethua;

public class Hecacdoituonghinhoc {
    public String color;
    public boolean filled;

    public Hecacdoituonghinhoc() {
        this.filled = true;
        this.color = "Green";
    }



    public Hecacdoituonghinhoc(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "Hecacdoituonghinhoc{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}


