package com.company;


/*
Написать класс проверяемого исключения LimitException, с конструктором LimitException(String message, double remainingAmount) и методом getRemainingAmount().
Написать класс BankAccount с 1 полем double amount - остаток на счете и методами getAmount() - возвращает текущий остаток на счете, deposit(double sum) - положить деньги на счет, withDraw(sum) - снимает указанную сумму со счета.
Также метод withDraw() может сгенерировать исключение в том случае если запрашиваемая сумма на снятие больше чем остаток денег на счете.
Написать Main класс где бы создавался счет клиента. Положить 10 000 сом на счет.
Затем попытаться снять через бесконечный цикл, каждую итерацию по 6000 сом, при этом отлавливать исключение LimitException и при возникновении такого исключения снимать только ту сумму которая осталась на счете и завершать бесконечный цикл

 */
public class Main {

    public static void main(String[] args) throws LimitException {

        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(10000);
        while (true) {

            bankAccount.setAmmount(bankAccount.getAmmount() - bankAccount.getSum());

            try {
                bankAccount.withDraw(6000);


            } catch (LimitException le) {

                System.out.println(" Ваш баланс  - " + bankAccount.getAmmount());
                if (bankAccount.getSum() > bankAccount.getAmmount()) {

                    bankAccount.setAmmount(bankAccount.getAmmount() - bankAccount.getSum());
                }
            }


        }

    }
}





