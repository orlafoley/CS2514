/*
public class Note {
    public class Main {
        public void main( final String[] args ) {
            final Note note = new Note( );
            System.out.println( note );

        }

        public Note create ( final String comment ) {
            final Note result;

            if (comment.length( ) > 40) {
                result = null;
            } else {
                result = new Note( comment );
            }

            return result;
        }
    }

    @Override
    public String toString( ) {
        return "default note text";
    }
}
 */
public class Note {
    private final String note;

    public Note( final String text ) {
        note = text;
    }

    @Override
    public String toString( ) {
        return note;
    }
}