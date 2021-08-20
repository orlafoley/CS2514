abstract class Garment {
    private final String name;
    private final String purpose;
    private final double numUnits;
    private final Fabric fabric;

    public Garment ( String garName, String garPurpose, double garNumUnits, Fabric fabric ) {
        this.name = garName;
        this.purpose = garPurpose;
        this.numUnits = garNumUnits;
        this.fabric = fabric;
    }

    public String getName() {
        return name;
    }
    public void printPurpose() {
        System.out.println(purpose);
    }
    @java.lang.Override
    public String toString ( ) {
        return getName() + " " + purpose;
    }
    public double getNumUnits() {
        return numUnits;
    }

    public double getEnvironmentalTax() {
        return fabric.getEnvironmentalTax();
    }
    public String getFabricName() {
        return fabric.getFabricName();
    }
    public double getPricePerUnit() {
        return fabric.getPricePerUnit();
    }

    public abstract void printItemisedBill();
    public String getSource() {
        return NaturalFabric.getSource();
    }

}