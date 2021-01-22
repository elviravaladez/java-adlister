package models;
import java.util.ArrayList;

public class BeanTest {
    //TODO: Create a class, BeanTest, and include a main method that instantiates a few instances of Album, Author and Quote.

    public static void main(String[]args) {
        //TODO: In BeanTest, experiment with storing multiple instances of Quote in an arraylist and iterating over it to print out the content and author name of multiple quotes.
        Album thriller = new Album();
        thriller.setId(1L);
        thriller.setArtist("Michael Jackson");
        thriller.setName("Thriller");
        thriller.setReleaseDate(1982);
        thriller.setSales(47.3);
        thriller.setGenre("Pop, Rock, R&B");

        Album backInBlack = new Album();
        backInBlack.setId(2L);
        backInBlack.setArtist("AC/DC");
        backInBlack.setName("Back in Black");
        backInBlack.setReleaseDate(1980);
        backInBlack.setSales(26.1);
        backInBlack.setGenre("Hard rock");



        Author douglasAdams = new Author();
        douglasAdams.setId(1L);
        douglasAdams.setFirstName("Douglas");
        douglasAdams.setLastName("Adams");

        Author markTwain = new Author();
        markTwain.setId(2L);
        markTwain.setFirstName("Mark");
        markTwain.setLastName("Twain");

        Author kurtVonnegut = new Author();
        kurtVonnegut.setId(3L);
        kurtVonnegut.setFirstName("Kurt");
        kurtVonnegut.setLastName("Vonnegut");



        Quote deadlines = new Quote();
        deadlines.setId(1L);
        deadlines.setContent("I love deadlines. I love the whooshing noise they make as they go by.");
        deadlines.setAuthor(douglasAdams);

        Quote dontPanic = new Quote();
        dontPanic.setId(2L);
        dontPanic.setContent("Don't Panic.");
        dontPanic.setAuthor(douglasAdams);

        Quote timeIllusion = new Quote();
        timeIllusion.setId(3L);
        timeIllusion.setContent("Time is an illusion. Lunchtime doubly so.");
        timeIllusion.setAuthor(douglasAdams);

        Quote clothes = new Quote();
        clothes.setId(4L);
        clothes.setContent("Clothes make the man. Naked people have little or no influence on society.");
        clothes.setAuthor(markTwain);



        ArrayList<Quote> quotes = new ArrayList<>();
        quotes.add(deadlines);
        quotes.add(dontPanic);
        quotes.add(timeIllusion);
        quotes.add(clothes);

        for(Quote quote:quotes) {
            String authorFirstName = (quote.getAuthor().getFirstName());
            String authorLastName = (quote.getAuthor().getLastName());
            String content = quote.getContent();

            System.out.println("----------------------------------------------------");
            System.out.printf("Author: %s %s%n", authorFirstName, authorLastName);
            System.out.printf("Quote: %s%n", content);

        }
    }
}
