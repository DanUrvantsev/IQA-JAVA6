public class CreditPaymentService {
        // Метод calculate для расчета ежемесячного платежа
        public double calculate(double creditAmount, double annualRate, int years) {
            // Конвертируем годовую ставку в месячную (в долях единицы)
            double monthlyRate = annualRate / 100 / 12;

            // Вычисляем количество месяцев
            int months = years * 12;

            // Рассчитываем аннуитетный коэффициент
            double annuityCoefficient = monthlyRate * Math.pow(1 + monthlyRate, months) /
                    (Math.pow(1 + monthlyRate, months) - 1);

            // Рассчитываем ежемесячный платеж
            return creditAmount * annuityCoefficient;
        }
    }
