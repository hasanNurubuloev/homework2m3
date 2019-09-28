package com.company;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class BankAccount {
    private double ammount;

    public double getAmmount() {
        return ammount;
    }

    public double deposit(double sum) {
        ammount = ammount + sum;
        System.out.println("Ваш баланс " + ammount);
        return ammount;
    }


    public double withDraw(double sum) {
        if (sum > ammount) {
            try {
                throw new LimitException("На вашем балансе не достаточно средств. Ваш баланс - ", ammount);

            } catch (LimitException a) {

                System.out.println( a.getMessage() + " Ваш баланс  - " + ammount);
                sum = ammount;
                ammount = ammount - sum;
            }
        } else {
            ammount = ammount - sum;
        }


        return ammount;
    }
}
