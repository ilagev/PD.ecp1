package factoryMethod.naturalNumber;

public class CreatorNumberEs extends Creator {

    @Override
    public NaturalNumber createNumber(int value) {
        return new NaturalNumberEs(value);
    }
    
    @Override
    public String toString() {
        return "NaturalNumberEs creator";
    }

}
