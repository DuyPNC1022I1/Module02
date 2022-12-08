package staticmethodproperty;

public class Staticproperty {
        private String name;
        private String engine;
        public static int numberOfCars;

    public Staticproperty(String name, String engine) {
        this.name = name;
        this.engine = engine;
        numberOfCars++;
    }
}
