package com.step;

import com.step.productInfo.*;

import java.util.Scanner;

import static com.step.productInfo.ProductMenus.mainMenu;

public class Main {

    public static void main(String[] args) {
        Product keyboard = new Product("KEYBOARD G PRO", 2609, "Logitech");
        Product mouse = new Product("MOUSE PRO X", 3539, "Logitech");
        Product mousepad = new Product("MOUSE PAD CRANE DESK MAT", 300, "Varmilo");
        Product monitor = new Product("MONITOR 27inch", 6539, "BENQ");
        Product phone = new Product("GALAXY S20+", 16000, "SAMSUNG");

        mainMenu();

        Scanner scanner = new Scanner(System.in);
        int menuLevel = scanner.nextInt();
        double totalPrice = keyboard.getPrice() + mouse.getPrice() + mousepad.getPrice() + monitor.getPrice() + phone.getPrice();

        if (menuLevel == 1 || menuLevel == 2 || menuLevel == 3) {
            switch (menuLevel) {
                case 1: {
                    System.out.println("1. " + keyboard.getName());
                    System.out.println("2. " + mouse.getName());
                    System.out.println("3. " + mousepad.getName());
                    System.out.println("4. " + monitor.getName());
                    System.out.println("5. " + phone.getName());
                };
                case 2: {
                    System.out.println("TOTAL PRICE IS: " + totalPrice);
                };
                case 3: {
                    System.exit(0);
                };
                default: {
                    System.out.println("Bravo");
                }
            }
        } else {
            System.out.println("Introduce-ti un numar corect !!!");
        }



    }
}
