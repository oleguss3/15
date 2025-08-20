package ru.netology.services;

public class MoneyCounter {
    public int calculate(int income, int expenses, int threshold) {
        int money = 0;
        int restMonths = 0;

        for (int month = 1; month <= 12; month++) {
            System.out.print("Месяц " + month + ". Денег " + money + ". ");

            if (money >= threshold) {
                System.out.print("Буду отдыхать. ");
                money -= expenses;                   // R = money - expenses
                System.out.print("Потратил -" + expenses + ", ");
                int afterExpenses = money;           // R
                int newMoney = afterExpenses / 3;    // остаток становится в 3 раза меньше
                int lost = afterExpenses - newMoney; // печатаем, сколько «съел» отдых (≈ 2/3 R)
                money = newMoney;
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
