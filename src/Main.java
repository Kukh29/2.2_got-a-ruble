public class Main {
    public static void main(String[] args) {

        // входные данные
        int amount = 100; // начальная сумма счета
        int replenishment = 1000; // сумма пополнения счета
        int spent = 100; // 1 рубль начисляется за каждые полные 100 рублей пополнения

        // логика
        if (replenishment >= 1000) {
            System.out.println("Количество бонусных рублей:");
            System.out.println((replenishment / spent) + " рублей");
        } else {
            System.out.println("0 бонусных рублей:");
        }

        if (replenishment >= 1000) {
        System.out.println("Итоговая сумма на счету клиента");
        System.out.println((replenishment / spent+replenishment+amount) + " рублей");
        } else {
            System.out.println("Итоговая сумма на счету клиента");
            System.out.println((replenishment+amount) + " рублей");
        }
        }
}
