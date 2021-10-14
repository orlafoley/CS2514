public class Main {
    public static void main( final String[] args ) {
        final Wolf wolf = new Wolf( );
        final Wolf wolf2 = new Wolf( );
        final Dog dog = new Dog( );

        wolf.roam( );
        dog.roam( );
        wolf.eat( );
        dog.eat( );

        System.out.println( "number of carnivores created = "
                + Carnivore.getInstanceCount( ) );
    }
}