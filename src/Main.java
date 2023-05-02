public class Main {
    public static void main(String[] args) {
        int amount = 100;
        int fill = 2000;
        int bonus;
        if (fill <1000) {
            bonus = 0;
        } else {
            bonus = fill / 100 * 1;
        }
        System.out.println(bonus);
        int cur = amount + fill + bonus;
        System.out.println("Бонусные баллы:" + bonus);
        System.out.println("Сумма пополнения: " + fill);

        System.out.println("Ваш счет:" + cur);


    }


}


