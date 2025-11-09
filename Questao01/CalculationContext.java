public class CalculationContext {

    public iCalculationStrategy calculation;

    public CalculationContext(iCalculationStrategy calculation){
        this.calculation = calculation;
    }

    public void setCalculationContext(iCalculationStrategy calculation){
        this.calculation = calculation;
    }

    public String executeiCalculationStrategy(float valor){
        return calculation.calculate(valor);
    }

}
