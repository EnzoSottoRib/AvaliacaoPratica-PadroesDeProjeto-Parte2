public class ValueAtRiskCalculation implements iCalculationStrategy{

    public String calculate(float valor){
        return "Calculando o risco com 'Value at Risk' e valor: " + valor;
    }

}
