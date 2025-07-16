public class Book {
    private String title;
    private Author author;
    private int yearOfPublic;

    public Book(String name, Author author, int yearOfPublic) {
        this.title = name;
        this.author = author;
        this.yearOfPublic = yearOfPublic;
    }

    public String getTitle() {
        return this.title;
    }

    public Author getAuthor() {
        return author;
    }

    public int getYearOfPublic() {
        return this.yearOfPublic;
    }

    public void setYearOfPublic(int yearOfPublic) {
        this.yearOfPublic = yearOfPublic;
    }
}
