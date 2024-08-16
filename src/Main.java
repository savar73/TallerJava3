import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        int b;
        int c;
        System.out.println("Ingrese 3 numeros diferentes");
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        if (a != b && b != c && a != c) {
        } else {
            System.out.println("Los numeros no pueden ser iguales");
        }if (a > b) {
            if (a > c) {
                System.out.println("El numero mayor es a");
            }
        } else {
            if (b > c) {
                System.out.println("El numero mayor es b");
            }
        }
        if (c > b) {
            System.out.println("El numero mayor es c");
        } else {
            if (b < c)
                System.out.println("El numero menor es b");
        }
        if (c < a) {
            System.out.println("El numero menor es c");
        }
        if (a < b) {
            if (a < c) {
                System.out.println("El numero menor es a");
            }
        }
    }
}

