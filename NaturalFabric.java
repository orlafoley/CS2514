abstract class NaturalFabric extends Fabric {

    private static String source;

    public NaturalFabric ( String fabricName, double pricePerUnit, String source) {
        super( fabricName, 0.0, pricePerUnit );
        this.source = source;
    }

    public static String getSource() {
        return source;
    }

}