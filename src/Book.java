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

    @Override
    public String toString() {
        return title + ", " + author.toString() + ", " + yearOfPublic;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Book diff = (Book) other;
        return this.title.equals(diff.title) && this.author.equals(diff.author) && this.yearOfPublic == diff.yearOfPublic;
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(title);
    }
}