abstract class Coat extends Garment {

    public Coat ( String coatName, double numUnits, Fabric fabric ) {
        super ( coatName, "provide extra protection against the elements", numUnits, fabric );
    }

    private double lineThreeResult = getEnvironmentalTax() * getNumUnits();
    private double lineFourResult = getNumUnits() * getPricePerUnit();
    private double lineFiveResultSynthetic = lineThreeResult * lineFourResult;

    @java.lang.Override
    public void printItemisedBill ( ) {
        System.out.println("Itemised bill for " + getName());
        System.out.println("Made of " + getNumUnits() + " units of " +
                getFabricName());
        System.out.println("\t environment tax: " + getNumUnits() +
                " * " + getEnvironmentalTax() + " = " + lineThreeResult);
        System.out.println("\t base price: " + getNumUnits() +
                " * " + getPricePerUnit() + " = " + lineFourResult);
        System.out.println("\t grand total: " + lineThreeResult +
                " * " + lineFourResult + " = " + lineFiveResultSynthetic);
    }

}