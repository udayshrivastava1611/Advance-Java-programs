import java.rmi.Naming;

public class server {
    public static void main(String[] args) {
        try {
            calculatorimpl obj = new calculatorimpl();

            Naming.rebind("CalculatorService", obj);

            System.out.println("Calculator Server Started...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}