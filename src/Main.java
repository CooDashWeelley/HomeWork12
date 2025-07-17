
public class Main {
    public static void main(String[] args) {
        Author ivanov = new Author("И. ", "Иванов");
        System.out.println(ivanov.getAuthor());
        Author petrov = new Author("П. ", "Петров");
        System.out.println(petrov.getAuthor());
        Book bookOfIvanov = new Book("Приключения Петрова", ivanov, 2000);
        System.out.println("Книга: " + bookOfIvanov.getTitle() + ", автор: " + bookOfIvanov.getAuthor().getAuthor() + ", год публикации: " + bookOfIvanov.getYearOfPublic());
        Book bookOfPetrov = new Book("Драконы Руси", petrov, 1990);
        System.out.println("Книга: " + bookOfPetrov.getTitle() + ", автор: " + bookOfPetrov.getAuthor().getAuthor() + ", год публикации: " + bookOfPetrov.getYearOfPublic());
        bookOfIvanov.setYearOfPublic(1994);
        System.out.println("Год публикации: " + bookOfIvanov.getYearOfPublic());
        System.out.println(bookOfPetrov);
        System.out.println(ivanov);
    }
}