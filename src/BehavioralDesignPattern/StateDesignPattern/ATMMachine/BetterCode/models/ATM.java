package BehavioralDesignPattern.StateDesignPattern.ATMMachine.BetterCode.models;

import BehavioralDesignPattern.StateDesignPattern.ATMMachine.BetterCode.state.ReadyForTransaction;
import BehavioralDesignPattern.StateDesignPattern.ATMMachine.BetterCode.state.State;

public class ATM {
    private final int id;
    private State state;
    private long availableAmount;

    public ATM(int id, long availableAmount){
        this.id = id;
        this.state = new ReadyForTransaction();
        this.availableAmount = availableAmount;
    }

    private int getId() {
        return this.id;
    }

    private void changeState(State state) {
        this.state = state;
    }

}
