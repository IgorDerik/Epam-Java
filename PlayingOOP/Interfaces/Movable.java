package PlayingOOP.Interfaces;

public interface Movable {

    String MIN_D = "SMALL";

    abstract String currPos();

    default void doSomething() {

        System.out.println("I do.");

    }

}
