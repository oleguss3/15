package ru.netology.services;

public class MoneyCounter {
    public int calculate(int income, int expenses, int threshold) {
        int money = 0;
        int restMonths = 0;

        for (int month = 1; month <= 12; month++) {
            System.out.print("Месяц " + month + ". Денег " + money + ". ");

            if (money >= threshold) {
                System.out.print("Буду отдыхать. ");
                money -= expenses;
                System.out.print("Потратил -" + expenses + ", ");
                int lost = money / 3;
                money -= lost;
                System.out.println("затем ещё -" + lost);
                restMonths++;
            } else {
                System.out.print("Придётся работать. ");
                money += income;
                System.out.print("Заработал +" + income + ", ");
                money -= expenses;
                System.out.println("потратил -" + expenses);
            }
        }

        return restMonths;
    }
}
