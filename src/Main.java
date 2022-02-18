public class Main {
    public static void main(String[] args) {

        // входные данные
        int amount = 100; // начальная сумма счета
        int replenishment = 1000; // сумма пополнения счета

        // логика
        int percent;
        if (replenishment >= 1000) {
            percent = 1;
        } else {
            percent = 0;
        }

        int bonus = replenishment * percent / 100;

        System.out.println("Итоговая сумма на счету клиента");
        System.out.println((bonus + replenishment + amount) + " рублей");
        System.out.println("Бонус");
        System.out.println((bonus) + " рублей");

    }
}
