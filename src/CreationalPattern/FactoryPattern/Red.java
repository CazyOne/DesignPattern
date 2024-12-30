package CreationalPattern.FactoryPattern;

public class Red implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Green::fill() method.");
    }
}