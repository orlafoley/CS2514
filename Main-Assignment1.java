import java.util.List;
import java.util.ArrayList;


public class Main {

    public static void main( final String[] args ) {

        Jeans jeans = new Jeans();
        final List<Garment> items = new ArrayList<Garment>( );
        items.add( jeans );

        for (Garment item : items) {
            item.printPurpose( );
        }

        System.out.println( );

        for (Garment item : items) {
            item.printItemisedBill( );
        }

    }

}
