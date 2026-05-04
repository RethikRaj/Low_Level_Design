package BehavioralDesignPattern.StateDesignPattern.ATMMachine.BetterCode.state;

import BehavioralDesignPattern.StateDesignPattern.ATMMachine.BetterCode.Enums.ATMState;
import BehavioralDesignPattern.StateDesignPattern.ATMMachine.BetterCode.models.Card;

import java.util.Scanner;

public class ReadingCashWithdrawalDetails implements State {
    @Override
    public int startTransaction() {
        throw new IllegalStateException("Cannot start transaction in : " + getState() + " state .");
    }

    @Override
    public boolean readAndValidateCardDetailsAndPin(Card card) {
        throw new IllegalStateException("Card details and pin cannot be read in " + getState() + " state.");
    }

    @Override
    public boolean readAndValidateCashWithdrawalDetails(int transactionID, int amount) {
        return false;
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
        return ATMState.READING_CASH_WITHDRAWAL_DETAILS;
    }
}
