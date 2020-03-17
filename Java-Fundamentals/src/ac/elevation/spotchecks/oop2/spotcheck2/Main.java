package ac.elevation.spotchecks.oop2.spotcheck2;

/**
 * @author Yogev Lidor
 * @date 17/03/2020
 */
public class Main {

    private static RareBooks rareBooks = new RareBooks();

    public static void main(String[] args) {
        Author janeA = new Author("Jane Austen", "ja@mail.com", 43);
        Author gustaveF = new Author("Gustave Flaubert", "ga@mail.com", 49);
        Author rogerR = new Author(" Roger Rosenblatt ", "rr@mail.com", 36);
        Author fionnualaK = new Author("Fionnuala Kearney ", "fk@mail.com", 28);


        Book PrideAndPrejudice = new Book("Pride and Prejudice", janeA, 35);
        Book MadameBovary = new Book("Madame Bovary", gustaveF, 55);
        Book theBookOfLove1 = new Book("The Book of Love", rogerR, 80);
        Book theBookOfLove2 = new Book("The Book of Love", fionnualaK, 67);
        Book emma = new Book("Emma", janeA, 43);

        System.out.println(rareBooks.addBook(PrideAndPrejudice));
        System.out.println(rareBooks.addBook(MadameBovary));
        System.out.println(rareBooks.addBook(theBookOfLove1));
        System.out.println(rareBooks.addBook(theBookOfLove2));
        System.out.println(rareBooks.addBook(emma));
        System.out.println(rareBooks.addBook(PrideAndPrejudice));
    }
}
