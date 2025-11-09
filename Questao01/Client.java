public class Client {
    public static void main(String[] args) {
        CalculationContext context = new CalculationContext(new ValueAtRiskCalculation());

        System.out.println(context.executeiCalculationStrategy(300));

        context.setCalculationContext(new ExpectedShortfallCalculation());

        System.out.println(context.executeiCalculationStrategy(200));

        context.setCalculationContext(new StressTestingCalculation());

        System.out.println(context.executeiCalculationStrategy(100));
    }
}
