package BehavioralDesignPattern.StateDesignPattern.ATMMachine.BetterCode.state;

import BehavioralDesignPattern.StateDesignPattern.ATMMachine.BetterCode.Enums.ATMState;
import BehavioralDesignPattern.StateDesignPattern.ATMMachine.BetterCode.models.Card;

public interface State {
    int startTransaction(); // starts a transaction, returns a transactionID.

    boolean readAndValidateCardDetailsAndPin(Card card) throws IllegalStateException;

    boolean readAndValidateCashWithdrawalDetails(int transactionID, int amount);

    int dispenseCash(int amount);

    void cancelTransaction();

    ATMState getState();
}
