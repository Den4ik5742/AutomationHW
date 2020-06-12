package forHomeWork9;

public class Calculator {
    private double a;
    private double b;

    public Calculator(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public Calculator() {

    }

    public double getA() {
        return a;
    }

    public double setA(double a) {
        this.a = a;
        return a;
    }

    public double getB() {
        return b;
    }

    public double setB(double b) {
        this.b = b;
        return b;
    }

    public double subtraction() {
        System.out.printf("\nВычитание = %.2f\n", a - b);
        return a - b;
    }

    public double sum() {
        System.out.printf("\nСумма = %.2f\n", a + b);
        return a + b;
    }

    public double multiplication() {
        System.out.printf("\nУмножение = %.2f\n", a * b);
        return a * b;
    }

    public double division() {
        System.out.printf("\nДеление = %.2f\n", a / b);
        return a / b;
    }

    public double powAction() {
        System.out.printf("\nа в степени b = %.2f\n", Math.pow(a, b));
        return Math.pow(a, b);
    }
}
