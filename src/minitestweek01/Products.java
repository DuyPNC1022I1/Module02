package minitestweek01;

public class Products {
    public int code;
    public String name;
    public int prime;
    public int type;
    public String unit = "USD";

    public Products() {
    }

    public Products(int code, String name, int prime, int type, String unit) {
        this.code = code;
        this.name = name;
        this.prime = prime;
        this.type = type;
        this.unit = unit;
    }
    @Override
    public String toString() {
        return "{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", prime=" + prime +
                ", type=" + type +
                ", unit='" + unit + '\'' +
                '}';
    }
}
