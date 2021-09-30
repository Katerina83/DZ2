package Lesson8;

public class Lesson8 {
    public static void main(String[] args) {
        Author authorName1 = new Author("Ст. Кинг");
        Author authorName2 = new Author("М. и С. Дяченко");
        Book book1 = new Book("Мизери", authorName1, 1987);
        Book book2 = new Book("Долина совести", authorName2, 2001);

        System.out.println("Книга1 - '"+book1.getName() + "' автор - " + authorName1.getAuthorName() + "; год выпуска -  " + book1.getPublishingYear());
        System.out.println("Книга2 - '"+book2.getName() + "' автор - " + authorName2.getAuthorName() + "; год выпуска -  " + book2.getPublishingYear());

        book1.setPublishingYear(1990);
        System.out.println("Новый год издания - "+ book1.getPublishingYear());


    }
}
