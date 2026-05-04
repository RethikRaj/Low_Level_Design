package BehavioralDesignPattern.StateDesignPattern.ATMMachine.BetterCode.state;

import BehavioralDesignPattern.StateDesignPattern.ATMMachine.BetterCode.Enums.ATMState;
import BehavioralDesignPattern.StateDesignPattern.ATMMachine.BetterCode.models.Card;

public class ReadyForTransaction implements State {
    private int generateTransactionID() {
        int txnID = 0;
        for(int i = 0;i < 20; i++) {
            txnID = txnID * 10 + (int)(Math.random() * 10);
        }
        return txnID;
    }

    @Override
    public int startTransaction() {
        int txnID = generateTransactionID();
        System.out.println("Starting Transaction : " + txnID);
        return txnID;
    }

    @Override
    public boolean readAndValidateCardDetailsAndPin(Card card) throws IllegalStateException {
        throw new IllegalStateException("Card details and pin cannot be read in " + getState() + " state.");
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
        System.out.println("No transaction to cancel in " + getState() + " state.");
    }

    @Override
    public ATMState getState() {
        return ATMState.READY_FOR_TRANSACTION;
    }
}
