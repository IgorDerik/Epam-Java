package PlayingOOP.Interfaces;

public interface Jumpable {

    int MIN_D = 10;

    abstract String currPos();

    default void doSomething() {

        System.out.println("I do.");

    }

}
