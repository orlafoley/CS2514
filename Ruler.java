public class Ruler implements Comparable {
    private final double length;
    public Ruler (double length) {
        this.length = length;
    }
//...
    @Override
    public int compareTo( final Object object ) {
        final int result;
            if (object instanceof Ruler) {
                final Ruler that = (Ruler)object;
                if (this.length < that.length) {
                    result = -1;
                } else if (this.length > that.length) {
                    result = 1;
                } else {
                    result = 0;
                }
            } else {
                result = 0;
            }

        return result;
}
}