public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double result = service.calculate(1.70, 75);
        System.out.println("Ваш ИМТ составляет " + result);

    }
}