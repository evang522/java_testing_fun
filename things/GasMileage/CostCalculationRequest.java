package things.GasMileage;

public class CostCalculationRequest {
    private double milesDriven;
    private double milesPerGallon;
    private double dollarsPerGallon;

    public CostCalculationRequest(
            double milesDriven,
            double milesPerGallon,
            double dollarsPerGallon) {
        this.milesDriven = milesDriven;
        this.milesPerGallon = milesPerGallon;
        this.dollarsPerGallon = dollarsPerGallon;
    }

    public double getMilesDriven() {
        return milesDriven;
    }

    public double getMilesPerGallon() {
        return milesPerGallon;
    }

    public double getKmPerGallon() {
        return this.milesPerGallon * 1.6;
    }

    public double getDollarsPerGallon() {
        return dollarsPerGallon;
    }
}
