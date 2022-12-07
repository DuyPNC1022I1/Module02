package Lopvadoituong;

public class Lophinhchunhat {
    int width;
    int height;
    public Lophinhchunhat(){
    }

    public Lophinhchunhat(int width, int height) {
        this.width = width;
        this.height = height;
    }
    public int getArea() {
        return this.width * this.height;
    }

    public int getPerimeter() {
        return (this.width + this.height) * 2;
    }

    public String display() {
        return "Hình chữ nhật: " + "Chiều rộng = " + width + "\t"+ "Chiều dài" + height;
    }

}
