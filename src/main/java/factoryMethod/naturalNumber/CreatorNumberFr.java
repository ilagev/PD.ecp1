package factoryMethod.naturalNumber;

public class CreatorNumberFr extends Creator {

    @Override
    public NaturalNumber createNumber(int value) {
        return new NaturalNumberFr(value);
    }
    
    @Override
    public String toString() {
        return "NaturalNumberFr creator";
    }

}
