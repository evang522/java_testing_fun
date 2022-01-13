import things.GasMileage.CostCalculationRequest;
import things.GasMileage.DrivingCostCalculator;

// If the person did not drive at all, the cost should be 0
// If the gas prices are zero, there should be no cost

public class Main {
    public void assertDoublesAreEqual(double val1, double val2)
    {
        if (val1 != val2) {
           throw new RuntimeException("The values were not equal, got " + val2 + "\"."); 
        }
    }


    public static void main(String[] args) {
        Main self = new Main();
        
        self.testIfThereWasNoDrivingThereIsNoCost();
        self.testIfGasPricesAreZeroThereIsNoCost();
        self.testCalculatesAtNormalRatesFor60Miles();
        self.testWhenCostOfGasGoesUpThePriceIncreases();
       
        System.out.println("All Tests passed!");
    }

    public void testIfThereWasNoDrivingThereIsNoCost() {
        DrivingCostCalculator calculator = new DrivingCostCalculator();
        CostCalculationRequest request = new CostCalculationRequest(0, 30, 3.2);
        
        double cost = calculator.calculate(request);
        this.assertDoublesAreEqual(0, cost);
    }

    public void testIfGasPricesAreZeroThereIsNoCost() {
        DrivingCostCalculator calculator = new DrivingCostCalculator();
        CostCalculationRequest request = new CostCalculationRequest(100, 30, 0);        

        double cost = calculator.calculate(request);
        this.assertDoublesAreEqual(0, cost);
    }

    public void testCalculatesAtNormalRatesFor60Miles() {
        DrivingCostCalculator calculator = new DrivingCostCalculator();
        CostCalculationRequest request = new CostCalculationRequest(60, 30, 3.2);        

        double cost = calculator.calculate(request);
        this.assertDoublesAreEqual(6.4, cost);
    }

    public void testWhenCostOfGasGoesUpThePriceIncreases() {
        DrivingCostCalculator calculator = new DrivingCostCalculator();
        CostCalculationRequest request = new CostCalculationRequest(60, 30, 3.2);        

        double firstResult = calculator.calculate(request);
        this.assertDoublesAreEqual(6.4, firstResult);


        CostCalculationRequest raisedGasPriceRequest = new CostCalculationRequest(60, 30, 5);
        double secondResult = calculator.calculate(raisedGasPriceRequest);
        this.assertDoublesAreEqual(10.0, secondResult);
    }
}
