package PlayingOOP.Interfaces;

public class Animal implements Jumpable, Movable {

    Animal() {

        System.out.println(Jumpable.MIN_D);

    }

    @Override
    public String currPos() {
        return null;
    }

    @Override
    public void doSomething() {

    }

    public static void main(String[] args) {

        Animal animal = new Animal();

        animal.doSomething();

    }

}
