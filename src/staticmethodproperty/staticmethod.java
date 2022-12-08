package staticmethodproperty;

public class staticmethod {
    private int rollno;
    private String name;
    private static String college = "BBDIT";

    public staticmethod(int r, String n) {
        rollno = r;
        name = n;
    }

    static void change() {
        college = "CodeGYM";
    }

    void display() {
        System.out.println(rollno + " "+ name + " " + college);
    }
}
