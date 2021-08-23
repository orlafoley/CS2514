public class Main {
    public static void main (String[] args) {
        final Title t1 = new Title( "The Hobbit", "An Unexpected Journey" );
        // create title #1: main title and subtitle
        final Title t2 = new Title( "Catcher in the Rye" ); final Author a1 = Author.JJR_Tolkien;
        final Author a2 = Author.JD_Sallinger;
        final Book b1 = new AudioBook( a1, t1, 1800.5 ); final Book b2 = new Paperback( a2, t2, 100 );
        final Reader r1 = new Reader( "Joe", "Soap" );
        // create title #2: main title only
        // ‘‘create’’ author #1
        // ‘‘create’’ author #2
        // create and publish book #1
        // create and publish book #2
        // create reader #1
        a1.receive( 100 );
        a1.buy( b2 );
        r1.buy( b1 );
        r1.receive( 100 );
        r1.buy( b1 );
        r1.buy( b2 );
        // author #1 receives some money to spend
        // author #1 buys book worth 10 Euro
        // reader #1 tries to buy book worth 15 Euro: fails
        // reader #1 receives some money to spend
        // reader #1 buys book worth 15 Euro: now works
        // reader #1 buys book worth 10 Euro
        a1.printBooksOwned( );
        a1.printBooksPublished( );
        r1.printBooksOwned( );
        // a1 owns 100 - 10 + 0.10 * 15 = 91.5 Euro
        System.out.println( a1 + " owns " + a1.getEarnings( ) + " Euro" );

        //You don’t have enough money to buy
        //  AudioBook[ author = JJR Tolkien, title = The Hobbit / An Unexpected Journey, price = 15.0, duration = 1800.5 ]
        //JJR Tolkien owns:
        //  Catcher in the Rye
        //JJR Tolkien published:
        //  The Hobbit / An Unexpected Journey
        //Joe Soap owns:
        //  The Hobbit / An Unexpected Journey
        //  Catcher in the Rye
        //JJR Tolkien owns 91.5 Euro
    }
}