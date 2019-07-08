import sun.java2d.loops.ScaledBlit;

import java.util.Scanner;

public class chuyenDoiNhietDo {

    public static void main(String[] args) {

        chuyenDoiNhietDo chuyenDoi = new chuyenDoiNhietDo();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Menu ");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
           byte choice = scanner.nextByte();
            switch (choice) {
                case 1:
                    chuyenDoi.fahrenheitToCelsius();
                    break;
                case 2:
                    System.out.println("Do F la: " + chuyenDoi.celsiusToFahrenheit());
                    break;
                case 0:
                    System.exit(0);
                    break;

            }
        }

    }

    public void fahrenheitToCelsius() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap F");
        double fahrenheit = scanner.nextDouble();
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        System.out.println("do C : " + celsius);

    }

    public double celsiusToFahrenheit() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap C");
        double celsius = scanner.nextDouble();
        double fahrenheit = (9.0 / 5) * celsius + 32;
        // System.out.println("do F : " + fahrenheit);
        return fahrenheit;

    }
}
