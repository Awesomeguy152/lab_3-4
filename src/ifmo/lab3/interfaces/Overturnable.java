package ifmo.lab3.interfaces;

import ifmo.lab3.Exceptions.ContainerTooHeavyException;

public interface Overturnable {
    public void overturn() throws ContainerTooHeavyException;
}
