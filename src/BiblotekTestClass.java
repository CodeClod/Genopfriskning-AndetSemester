public class BiblotekTestClass {
    public static void main(String[] args) {
        Bibliotek biblo = new Bibliotek();

        Bog theMockingbird = new Bog("12532-62346-22f", "The Mockingbird", 1960);
        biblo.addBook(theMockingbird);
        Bog templesOfAcedia = new Bog("14264-73324-25q", "Tempels Of Acedia", 1969);
        biblo.addBook(templesOfAcedia);
        Bog salivatingCookeries = new Bog("63374-39402-91n", "Salivating Cookeries", 2019);
        biblo.addBook(salivatingCookeries);

        biblo.visBøger();
    }



}
