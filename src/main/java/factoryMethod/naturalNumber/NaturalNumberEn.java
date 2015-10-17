package factoryMethod.naturalNumber;

public class NaturalNumberEn extends NaturalNumber  {
    
    protected static String[] textValue = {"zero", "one", "two", "three", "four", "five"};
    
    public NaturalNumberEn(int value) {
        super(value);
    }

    @Override
    public String getTextValue() {
        if (this.value < textValue.length) {
            return NaturalNumberEn.textValue[this.value];
        } else {
            return "???";
        }
    }

    @Override
    public String toString() {
        return "Product NaturalNumberEn. Value = " + this.getTextValue();
    }

}