package CreationalDesignPattern.Prototype.ImprovedCode;

// Why Prototype< T extends Prototype<T> > and not Prototype<T> ?
// 1.

public interface Prototype<T extends Prototype<T>> {
    T copy();
}
