public class Main {
    public static void main(String[] args) {
        // Создаем объект класса CreditPaymentService
        CreditPaymentService service = new CreditPaymentService();

        // Первый тестовый пример
        double payment1 = service.calculate(1_000_000, 9.99, 1);
        System.out.printf("Ежемесячный платеж (тест 1): %.2f рублей\n", payment1);

        // Второй тестовый пример
        double payment2 = service.calculate(1_000_000, 9.99, 2);
        System.out.printf("Ежемесячный платеж (тест 2): %.2f рублей\n", payment2);

        // Третий тестовый пример
        double payment3 = service.calculate(1_000_000, 9.99, 3);
        System.out.printf("Ежемесячный платеж (тест 3): %.2f рублей\n", payment3);
    }
}