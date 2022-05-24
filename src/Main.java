public class Main {

    public static void main(String[] args) {
        int balance = 100;
        int refill = 1300;
        int bonus = 0;

        if (refill >= 1000) {
            bonus = refill / 100;
            System.out.println("Bonus rubles is: " + bonus);
        } else {
            System.out.println("You do not have bonus rubles");
        }

        int itog = refill + bonus + balance;
        System.out.println("Balans is: " + itog);

    }
}
