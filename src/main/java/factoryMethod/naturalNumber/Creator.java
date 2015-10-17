package factoryMethod.naturalNumber;

public abstract class Creator {
    public abstract NaturalNumber createNumber(int value);
    
    public abstract String toString();
}
