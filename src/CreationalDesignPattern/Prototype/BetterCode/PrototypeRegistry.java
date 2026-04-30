package CreationalDesignPattern.Prototype.BetterCode;

import java.util.HashMap;
import java.util.Map;

public class PrototypeRegistry<T extends Prototype<T>> {
    private final Map<String, T> prototypes;

    public PrototypeRegistry() {
        prototypes = new HashMap<>();
    }

    public void register(String key, T prototype) {
        prototypes.put(key, prototype);
    }

    public void unregister(String key) {
        prototypes.remove(key);
    }

    // returns clone for the key
    public T get(String key) throws IllegalArgumentException {
        T prototype = prototypes.getOrDefault(key, null);

        if(prototype == null) {
            throw new IllegalArgumentException("No prototype registered under key: " + key);
        }

        return prototype.copy();
    }
}
