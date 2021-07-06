import javax.swing.*;

public class Calculator {
    Helpers helpers = new Helpers();
    public double sum(double a, double b) {
        return (a+b);
    }
    public double substracion(double a, double b) { return (a-b); }
    public double multiply(double a, double b) {
        return (a*b);
    }
    public double division(double a, double b) {
        if (b == 0) {
            helpers.showMessage("La división por 0 no se puede");
            return 0;
        }
        return (a/b);
    }
}
