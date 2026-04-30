package CreationalDesignPattern.Prototype.BetterCode;

public interface Prototype<T extends Prototype<T> >{
    T copy();
}
