public final class Paperback implements Book {
    private final Author author;
    private final Title title;
    private final double price = 10.0;
    private final double profit = 1.0;
    private final int pageCount;

    public Paperback(Author author, Title title, int pageCount) {
        this.author = author;
        this.title = title;
        this.pageCount = pageCount;
        author.publish(this);
    }

    @java.lang.Override
    public double getPrice() {
        return price;
    }

    @java.lang.Override
    public String getAuthor ( ) {
        return author.toString();
    }

    @java.lang.Override
    public Author returnAuthor ( ) {
        return author;
    }

    @java.lang.Override
    public double getDuration ( ) {
        return this.pageCount;
    }

    @java.lang.Override
    public double getProfit ( ) {
        return profit;
    }

    @java.lang.Override
    public String toString ( ) {
        return title.getTitle();
    }
}