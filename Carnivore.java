public class Carnivore extends Animal {
    private static final String DEFAULT_FOOD = "raw meat";
    private static int instanceCount = 0;

    public Carnivore(String var1) {
        this(var1, "raw meat");
    }

    public Carnivore(String var1, String var2) {
        super(var1, var2);
        ++instanceCount;
    }

    public static int getInstanceCount() {
        return instanceCount;
    }
}