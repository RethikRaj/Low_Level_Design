package BehavioralDesignPattern.StateDesignPattern.ATMMachine.BetterCode.Enums;

public enum ATMState {
    READY_FOR_TRANSACTION,
    READING_CARD_DETAILS,
    READING_CASH_WITHDRAWAL_DETAILS,
    DISPENSING_CASH,
    EJECTING_CARD
}
