abstract class Fabric {

    private final double environmentalTax;
    private final double pricePerUnit;
    private final String fabricName;

    public Fabric ( String fabricName, double environmentalTax, double pricePerUnit ) {
        this.fabricName = fabricName;
        this.environmentalTax = environmentalTax;
        this.pricePerUnit = pricePerUnit;
    }

    public double getEnvironmentalTax( ) {
        return environmentalTax;
    };
    public double getPricePerUnit( ) {
        return pricePerUnit;
    };
    public String getFabricName( ) {
        return fabricName;
    };

}