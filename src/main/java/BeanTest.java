import java.util.ArrayList;

public class BeanTest {

    public static void main(String[] args) {

        ArrayList<Authors> group = new ArrayList<>();

        Authors author = new Authors();
        author.setFirstName("Douglas");
        author.setLastName("Adams");


        Authors author1 = new Authors();
        author1.setFirstName("Mark");
        author1.setLastName("Twain");


        Authors author2 = new Authors();
        author2.setFirstName("Kurt");
        author2.setLastName("Vonnegut");

        group.add(author);
        group.add(author1);
        group.add(author2);

        for (Authors names : group){
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
