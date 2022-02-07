import java.util.ArrayList;

public class BeanTest {

    public static void main(String[] args) {

        ArrayList<Author> group = new ArrayList<>();

        Author author = new Author();
        author.setFirstName("Douglas");
        author.setLastName("Adams");


        Author author1 = new Author();
        author1.setFirstName("Mark");
        author1.setLastName("Twain");


        Author author2 = new Author();
        author2.setFirstName("Kurt");
        author2.setLastName("Vonnegut");

        group.add(author);
        group.add(author1);
        group.add(author2);

        for (Author names : group){
            System.out.println("names.getFirstName() = " + names.getFirstName());
            System.out.println("names.getLastName() = " + names.getLastName());
        }

        ArrayList<Quote> quotes = new ArrayList<>();
        Quote quote = new Quote();
        quote.SetAuthor(group.get(0).getFirstName());
        quote.SetContent("Hello, How are you doing");

        System.out.println("quote.getAuthor() = " + quote.getAuthor());
        System.out.println("qoute.getContent() = " + quote.getContent());
    }

}
