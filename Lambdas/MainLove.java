package Lambdas;

public class MainLove {

    public static void main(String[] args) {

        Lovable lovable = () -> System.out.println("Mega Love");

        lovable.showLove();

    }

}
