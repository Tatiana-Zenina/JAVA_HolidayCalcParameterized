package ru.netology.services;

public class HolidayService {
    /*
    Нужно смоделировать отдых по следующей схеме:
    1. изначально нет денег;
    2. если он решает, что следующий месяц хочет активно поработать, то его деньги увеличиваются на income, доход от работы, и уменьшаются на expense, обязательные месячные траты;
    3. если он решает, что следующий месяц хочет отдохнуть, то за месяц его деньги уменьшаются на expense;
    4. а затем остаток накоплений ещё уменьшается в три раза — траты на отдых;
    5. решение, отдохнуть ли в следующем месяце принимается по правилу: если на счету есть хотя бы threshold денег, то выбираем отдых, иначе — работу.
     */

    public int calculateMonthsAndMoney(int income, int expenses, int threshold) {

        int count = 0; // количесвто месяцев отдыха
        int money = 0; // количество денег

        for (int month = 0; month < 12; month++) {
            if (money >= threshold) {
                count++;
                money = (money - expenses) / 3;
            } else {
                money = money + income - expenses;
            }
        }
        return count;
    }
}
