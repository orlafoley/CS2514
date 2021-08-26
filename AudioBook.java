public final class AudioBook implements Book {
    private final Author author;
    private final Title title;
    private final double price = 15.0;
    private final double duration;
    private final double profit = 1.5;

    public AudioBook(Author author, Title title, double duration) {
        this.author = author;
        this.title = title;
        this.duration = duration;
        author.publish(this);
    }

    @java.lang.Override
    public double getPrice( ) {
        return price;
    }

    @java.lang.Override
    public String getAuthor( ) {
        return author.toString();
    }

    @java.lang.Override
    public Author returnAuthor( ) {
        return author;
    }

    @java.lang.Override
    public double getDuration( ) {
        return this.duration;
    }

    @java.lang.Override
    public double getProfit( ) {
        return profit;
    }

    @java.lang.Override
    public String toString( ) {
        return title.getTitle();
    }
}