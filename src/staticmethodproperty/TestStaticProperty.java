package staticmethodproperty;

public class TestStaticProperty {
    public static void main(String[] args) {
        Staticproperty test1 = new Staticproperty("Mazda 3", "Kia");
        System.out.println(Staticproperty.numberOfCars);

        Staticproperty test2 = new Staticproperty("Mazda 10", "Kia morning");
        System.out.println(Staticproperty.numberOfCars);
    }
}
