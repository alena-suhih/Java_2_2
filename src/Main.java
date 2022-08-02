public class Main {
    public static void main(String[] args) {

        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        // Условным оператором проверяете превысила ли
        // сумма пополнения порог и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.

        int initialAccount = 500;
        int depositAmount = 200;
        int bonus;
        int totalAmount;

        if (depositAmount > 100) {
            bonus = depositAmount / 100;
        } else {
            bonus = 0;
        }

        totalAmount = initialAccount + depositAmount + bonus;

        System.out.println("Начислено бонусов: " + bonus);
        System.out.println("Итоговая сумма " + totalAmount);
    }
}
