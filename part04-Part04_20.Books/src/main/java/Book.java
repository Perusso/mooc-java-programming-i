public class Book {

    private String title;
    private int pages;
    private int publiYear;


    public Book(String title, int pages, int publiYear) {

        this.title = title;
        this.pages = pages;
        this.publiYear = publiYear;
    }

    public String getTitle() {
        return title;
    }

    public int getPages() {
        return pages;
    }

    public int getPubliYear() {
        return publiYear;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void setPubliYear(int publiYear) {
        this.publiYear = publiYear;
    }

    @Override
    public String toString() {
        return getTitle() + ", " + getPages() + " pages, " + getPubliYear();
    }
}
