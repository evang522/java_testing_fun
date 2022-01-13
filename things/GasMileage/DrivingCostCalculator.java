package things.GasMileage;

// What do we have?
// - Miles Driven
// - Miles per Gallon
// - Dollars Per Gallon

// What do we want to get from that?
// - Get the cost of driving. 

// first thing to figure out:  gallons used.
// second?  cost of gallons used? 
// third, simply return that cost?

public class DrivingCostCalculator {
    public double calculate(CostCalculationRequest request) {
        double gallonsUsed = this.calculateGallonsUsed(
                request.getMilesDriven(),
                request.getMilesPerGallon());

        double totalCost = this.calculateCostOfGallons(gallonsUsed, request.getDollarsPerGallon());

        return totalCost;
    }

    private double calculateGallonsUsed(double milesDriven, double milesPerGallon) {
        return milesDriven / milesPerGallon;
    }

    private double calculateCostOfGallons(double gallonsUsed, double dollarsPerGallon) {
        return gallonsUsed * dollarsPerGallon;
    }
}