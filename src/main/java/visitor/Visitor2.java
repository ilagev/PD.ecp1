package visitor;

public class Visitor2 extends Visitor {
    
    private int countA = 0;
    
    private int countB = 0;
    
    @Override
    public void visitElementA(ElementA e) {
        countA++;
    }

    @Override
    public void visitElementB(ElementB e) {
        countB++;
    }
    
    public int getAs() {
        return countA;
    }
    
    public int getBs() {
        return countB;
    }

}
