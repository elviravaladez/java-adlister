package model;
import java.util.ArrayList;

public class BeanTest {
    //TODO: Create a class, BeanTest, and include a main method that instantiates a few instances of Album, Author and Quote.

    public static void main(String[]args) {
        //TODO: In BeanTest, experiment with storing multiple instances of Quote in an arraylist and iterating over it to print out the content and author name of multiple quotes.

//        Album thriller = new Album();
//        thriller.setId(1);
//        thriller.setArtist("Michael Jackson");
//        thriller.setName("Thriller");
//        thriller.setReleaseDate(1982);
//        thriller.setSales(47.3);
//        thriller.setGenre("Pop, Rock, R&B");

        Album thriller = new Album(1, "Michael Jackson", "Thriller", 1982, 47.3,"Pop, Rock, R&B");
        Album backInBlack = new Album(2, "AC/DC", "Back in Black", 1980, 26.1, "Hard rock");


        Author douglasAdams = new Author(1, "Douglas", "Adams");
        Author markTwain = new Author(2, "Mark", "Twain");
        Author kurtVonnegut = new Author(3, "Kurt", "Vonnegut");


        Quote deadlines = new Quote(1, "I love deadlines. I love the whooshing noise they make as they go by.", douglasAdams);
        Quote dontPanic = new Quote(2, "Don't Panic.", douglasAdams);
        Quote timeIllusion = new Quote(3, "Time is an illusion. Lunchtime doubly so." ,douglasAdams);
        Quote clothes = new Quote(4, "Clothes make the man. Naked people have little or no influence on society.", markTwain);
        Quote universe = new Quote(5, "The universe is a big place, perhaps the biggest.", kurtVonnegut);

        ArrayList<Quote> quotes = new ArrayList<>();
        quotes.add(deadlines);
        quotes.add(dontPanic);
        quotes.add(timeIllusion);
        quotes.add(clothes);
        quotes.add(universe);

        for(Quote quote:quotes) {
            String authorFirstName = (quote.getAuthor().getFirstName());
            String authorLastName = quote.getAuthor().getLastName();
            String content = quote.getContent();

            System.out.println("----------------------------------------------------");
            System.out.printf("Author: %s %s%n", authorFirstName, authorLastName);
            System.out.printf("Quote: %s%n", content);

        }
    }
}
