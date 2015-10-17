package factoryMethod.naturalNumber;

public class NaturalNumberFr extends NaturalNumber  {
    
    protected static String[] textValue = {"cero", "un", "deux", "trois", "quatre", "cinq"};
    
    public NaturalNumberFr(int value) {
        super(value);
    }

    @Override
    public String getTextValue() {
        if (this.value < textValue.length) {
            return NaturalNumberFr.textValue[this.value];
        } else {
            return "???";
        }
    }
    
    @Override
    public String toString() {
        return "Product NaturalNumberFr. Value = " + this.getTextValue();
    }

}