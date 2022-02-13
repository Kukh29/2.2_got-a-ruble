public class Main {
    public static void main(String[] args) {

        // входные данные
        int amount = 100; // начальная сумма счета
        int replenishment = 100; // сумма пополнения счета

        // логика
        int percent = 1;
        int bonus = replenishment * percent / 100;

        if (replenishment >= 1000) {
            bonus = replenishment * percent / 100;
        } else {
            bonus = 0;
        }
        System.out.println("Бонус");
        System.out.println((bonus) + " рублей");
        System.out.println("Итоговая сумма на счету клиента");
        System.out.println((bonus + replenishment + amount) + " рублей");
    }
}
