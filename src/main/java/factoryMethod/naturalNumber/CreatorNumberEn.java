package factoryMethod.naturalNumber;

public class CreatorNumberEn extends Creator {

    @Override
    public NaturalNumber createNumber(int value) {
        return new NaturalNumberEn(value);
    }

    @Override
    public String toString() {
        return "NaturalNumberEn creator";
    }

}
