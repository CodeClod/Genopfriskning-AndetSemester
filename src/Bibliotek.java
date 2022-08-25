import java.util.ArrayList;

public class Bibliotek{

    ArrayList<Bog> bøger = new ArrayList<>();


    Bog theMockingbird = new Bog("12532-62346-22f", "TheMockingbird", 1960);

    public void addBook(Bog bog) {
        bøger.add(bog);
    }

    public void visBøger() {
        for (Bog b:
             bøger) {
            System.out.println(b);
        }
    }
}
