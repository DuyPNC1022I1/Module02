package abstractandinterface;

public class Chicken extends Animal1 implements Edible{
    @Override
    public String howToEat() {
        return "Could be fried";
    }

    @Override
    public String makeSound() {
        return "Chicken!!!";
    }
}
