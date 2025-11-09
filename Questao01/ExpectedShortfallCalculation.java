public class ExpectedShortfallCalculation implements iCalculationStrategy{

    public String calculate(float valor){
        return "Calculando o risco com 'Expected Shortfall' e valor: " + valor;
    }

}
