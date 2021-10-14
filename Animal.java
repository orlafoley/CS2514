/**
 * Class for animals with eating and roaming behaviour.
 */
public class Animal {
    private static final int HUNGER_LEVEL_INCREMENT = 1;
    private static final int HUNGER_LEVEL_DECREMENT = 2;
    private static final int INITIAL_HUNGER_LEVEL = 0;
    private final String name;
    private final String food;
    private int hungerLevel;

    /**
     * Construct an instance of this class with a given name and a
     * given preferred type of food.
     *
     * @param name The name of the instance.
     * @param food The preferred food of the instance.
     */
    public Animal( final String name, final String food ) {
        this.name = name;
        this.food = food;
        hungerLevel = INITIAL_HUNGER_LEVEL;
    }

    /**
     * Get the name of this instance.
     *
     * @return The name of this instance.
     */
    public String getName( ) {
        return name;
    }

    public String getFood( ) {
        return food;
    }

    public int getHungerLevel( ) {
        return hungerLevel;
    }

    private void addToHungerLevel( final int addend ) {
        hungerLevel += addend;
    }

    private void decrementHungerLevel( ) {
        addToHungerLevel( - HUNGER_LEVEL_DECREMENT );
    }

    private void incrementHungerLevel( ) {
        addToHungerLevel( HUNGER_LEVEL_INCREMENT );
    }

    /**
     * Make the instance of the class roam.
     */
    public void roam( ) {
        incrementHungerLevel( );
        System.out.println( "I am roaming" );
            
    }

    public void eat( ) {
        if (getHungerLevel( ) >= HUNGER_LEVEL_DECREMENT) {
            decrementHungerLevel( );
        }
        System.out.println( "eating " + food );
    }

    @Override
    public String toString( ) {
        return getName( );
    }
}
