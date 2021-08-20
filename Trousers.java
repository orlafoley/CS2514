abstract class Trousers extends Garment {

    public Trousers ( String trousersName, double numUnits, Fabric fabric ) {
        super( trousersName, "cover the legs", numUnits, fabric );
    }

    private double lineThreeResult = getEnvironmentalTax() * getNumUnits();
    private double lineFourResult = getNumUnits() * getPricePerUnit();
    private double lineFiveResultNatural = getPricePerUnit() * getNumUnits();

    @java.lang.Override
    public void printItemisedBill ( ) {
        System.out.println("Itemised bill for " + getName());
        System.out.println("Made of " + getNumUnits() + " units of " +
                getFabricName() + " made of " + getSource());
        System.out.println("\t environment tax: " + getNumUnits() +
                " * " + getEnvironmentalTax() + " = " + lineThreeResult);
        System.out.println("\t base price: " + getNumUnits() +
                " * " + getPricePerUnit() + " = " + lineFourResult);
        System.out.println("\t grand total: " + getPricePerUnit() +
                " * " + getNumUnits() + " = " + lineFiveResultNatural);
    }

}