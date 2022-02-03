public class Main {
    public static void main(String[] args) {

        // входные данные
        int amount = 100; // начальная сумма счета
        int replenishment = 2000; // сумма пополнения счета
        boolean registered = true;

        // логика

        int percent = registered ? 1 : 0;
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
