package gse01;

import java.util.Scanner;

public class Product {

    String antal1;
    String a;
    Scanner input = new Scanner(System.in);
    gseLogic logic = new gseLogic();

    public void go() {
        commands();
    }

    public String commands() {
        System.out.println("How many mango's");
        while (!"q".equalsIgnoreCase(a = input.next())) {
            antal1 = a;
            System.out.println("Processed, press q to quit and see basket");
        }

        if ("q".equals(a)) {
            System.out.println("done");

        }
        return antal1;
    }
}
