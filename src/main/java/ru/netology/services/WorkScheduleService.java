package ru.netology.services;

public class WorkScheduleService {
    public int calculateMonths(int income, int expenses, int threshold) {
        int countMonths = 0;
        int money = 0;
        for (int month = 0; month < 12; month++) {
            if (money >= threshold) {
                countMonths++;
                money = (money - expenses) / 3;
            } else {
                money = money + income - expenses;
            }
        }
        return countMonths;
    }
}
