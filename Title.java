public final class Title {
    private String title;
    private String subtitle;

    public Title ( String title ) {
        this.title = title;
        this.subtitle = null;
    }

    public Title ( String title, String subtitle ) {
        this.title = title;
        this.subtitle = subtitle;
    }

    public String getTitle ( ) {
        if (subtitle !=  null) {
            return title + " / " + subtitle;
        } else {
            return title;
        }
    }
}