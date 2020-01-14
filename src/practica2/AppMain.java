package practica2;

import java.util.Scanner;

public class AppMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese dos valores: ");

        String uno = scanner.next();
        String dos = scanner.next();

        StringDataType<String> stringStringDataType = new StringDataType<>();
        stringStringDataType.performAll(uno, dos);

        System.out.println("Ingrese dos valores de tipo entero o decimal: ");

        double primer = scanner.nextDouble();
        double segundo = scanner.nextDouble();

        NumericDataType<Double> numericDataType = new NumericDataType<>();
        numericDataType.performAll(primer, segundo);

    }
}

interface Operations<T> {
    void addition(T a, T b);

    void subtraction(T a, T b);

    void multiplication(T a, T b);

    void division(T a, T b);
}

class StringDataType<T> implements Operations<T> {

    @Override
    public void addition(T a, T b) {
        System.out.println("The addition of 2 strings is: " + a + b);
    }

    @Override
    public void subtraction(T a, T b) {
        System.out.println("This operation can't be perform on strings");
    }

    @Override
    public void multiplication(T a, T b) {
        System.out.println("This operation can't be perform on strings");
    }

    @Override
    public void division(T a, T b) {
        System.out.println("This operation can't be perform on strings");
    }

    public void performAll(T a, T b) {
        addition(a, b);
        subtraction(a, b);
        multiplication(a, b);
        division(a, b);
    }
}

class NumericDataType<T extends Number> implements Operations<T> {

    @Override
    public void addition(T a, T b) {
        double primero = a.doubleValue();
        double segundo = b.doubleValue();
        double valor = primero + segundo;
        System.out.printf("The addition of two numbers is: %.2f", valor);
    }

    @Override
    public void subtraction(T a, T b) {
        double primero = a.doubleValue();
        double segundo = b.doubleValue();
        double valor = primero - segundo;
        System.out.printf("The subtraction of two numbers is: %.2f", valor);
    }

    @Override
    public void multiplication(T a, T b) {
        double primero = a.doubleValue();
        double segundo = b.doubleValue();
        double valor = primero * segundo;
        System.out.printf("The multiplication of two numbers is: %.2f", valor);
    }

    @Override
    public void division(T a, T b) {
        double primero = a.doubleValue();
        double segundo = b.doubleValue();
        double valor = primero / segundo;
        System.out.printf("The division of two numbers is: %.2f", valor);
    }

    public void performAll(T a, T b) {
        addition(a, b);
        subtraction(a, b);
        multiplication(a, b);
        division(a, b);
    }
}