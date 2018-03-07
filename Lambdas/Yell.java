package Lambdas;

import java.util.Objects;

public class Yell {

    public static void yell(String s) {
        Objects.requireNonNull(s, () -> "Null Happened");
        System.out.println(s.toUpperCase()+"!!!");
    }

    public static void main(String[] args) {
        yell(null);
    }

}
