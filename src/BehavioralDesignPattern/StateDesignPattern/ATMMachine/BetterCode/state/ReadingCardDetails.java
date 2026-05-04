package BehavioralDesignPattern.StateDesignPattern.ATMMachine.BetterCode.state;

import BehavioralDesignPattern.StateDesignPattern.ATMMachine.BetterCode.Enums.ATMState;
import BehavioralDesignPattern.StateDesignPattern.ATMMachine.BetterCode.models.Card;

import java.util.Scanner;

public class ReadingCardDetails implements State{
    @Override
    public int startTransaction() {
        return 0;
    }

    @Override
    public boolean readAndValidateCardDetailsAndPin(Card card) {
        // 1. Read Card

        // 2. Validate Card

        // 2. Read pin details
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter pin : ");
        int pin = sc.nextInt();
        sc.close();

        // 3. Validate pin
        return card.getPin() == pin;
    }

    @Override
    public boolean readAndValidateCashWithdrawalDetails(int transactionID, int amount) {
        throw new IllegalStateException("Cash withdrawal details cannot be read in " + getState() + " state.");
    }

    @Override
    public int dispenseCash(int amount) {
        throw new IllegalStateException("Cash cannot be dispensed in " + getState() + " state.");
    }

    @Override
    public void cancelTransaction() {
        System.out.println("Cancelling transaction in " + getState() + " state.");
    }

    @Override
    public ATMState getState() {
        return ATMState.READING_CARD_DETAILS;
    }
}
