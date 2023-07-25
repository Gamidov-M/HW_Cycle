package ru.netology.services;

public class DayOfFreelancer {
    public int calculate(int income, int expenses, int threshold) {
        int money = 0;
        int count = 0;

        for (int i = 0; i < 12; i++) {
            if (money >= threshold) { // я работаю
                money -= expenses;
                money /= 3;
                count++;
            } else { // я отдыхаю
                money += income;
                money -= expenses;
            }
        }
        return count;
    }
}

