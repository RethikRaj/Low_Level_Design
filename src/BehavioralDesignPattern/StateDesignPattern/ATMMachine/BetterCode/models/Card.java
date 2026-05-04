package BehavioralDesignPattern.StateDesignPattern.ATMMachine.BetterCode.models;

import BehavioralDesignPattern.StateDesignPattern.ATMMachine.BetterCode.Enums.CardType;

public class Card {
    private final long cardNumber;
    private final String cardHolderName;
    private int pin;
    private final int ccv;
    private final CardType cardType;

    public Card(long cardNumber, String cardHolderName, int pin, int ccv, CardType cardType) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
        this.pin = pin;
        this.ccv = ccv;
        this.cardType = cardType;
    }

    // getters and setters
    public long getCardNumber() {
        return cardNumber;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }
}
