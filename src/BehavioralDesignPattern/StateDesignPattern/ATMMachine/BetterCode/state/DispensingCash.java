package BehavioralDesignPattern.StateDesignPattern.ATMMachine.BetterCode.state;

import BehavioralDesignPattern.StateDesignPattern.ATMMachine.BetterCode.Enums.ATMState;
import BehavioralDesignPattern.StateDesignPattern.ATMMachine.BetterCode.models.Card;

public class DispensingCash implements State {
    @Override
    public int startTransaction() {
        return 0;
    }

    @Override
    public boolean readAndValidateCardDetailsAndPin(Card card) {
        return false;
    }

    @Override
    public boolean readAndValidateCashWithdrawalDetails(int transactionID, int amount) {
        return false;
    }

    @Override
    public int dispenseCash(int amount) {
        return 0;
    }

    @Override
    public void cancelTransaction() {

    }

    @Override
    public ATMState getState() {
        return ATMState.DISPENSING_CASH;
    }
}
