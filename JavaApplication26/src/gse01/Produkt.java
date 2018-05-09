package gse01;

import java.util.Scanner;

public class Produkt {

    String antal1;
    String a;
    Scanner input = new Scanner(System.in);
    gseLogic logic = new gseLogic();

    public void go() {
        commands();
    }

    public String commands() {
        System.out.println("Hvor mange mangoer");
        while (!"q".equalsIgnoreCase(a = input.next())) {
            antal1 = a;
            System.out.println("validatet, press q to quit");
        }

        if ("q".equals(a)) {
            System.out.println("done");

        }
        return antal1;
    }
}
