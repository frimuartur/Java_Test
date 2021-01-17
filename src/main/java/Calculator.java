public class Calculator {
    ICalculator iCalculator;

    public Calculator(ICalculator ICalculator) {
        this.iCalculator = ICalculator;
    }
    int mult(int a, int b){
        return iCalculator.add(a,b) * 2;
    }
}
