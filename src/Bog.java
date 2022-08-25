public class Bog {
    private String isbn;
    private String titel;
    private int udgivelsesÅr;

    Bog(String isbn, String titel, int udgivelsesÅr) {
        setIsbn(isbn);
        setTitel(titel);
        setUdgivelsesÅr(udgivelsesÅr);
    }

    public int getUdgivelsesÅr() {
        return udgivelsesÅr;
    }
    public String getIsbn() {
        return isbn;
    }
    public String getTitel() {
        return titel;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public void setTitel(String titel) {
        this.titel = titel;
    }
    public void setUdgivelsesÅr(int udgivelsesÅr) {
        this.udgivelsesÅr = udgivelsesÅr;
    }


    @Override
    public String toString() {
        return "Bog:  " +
                "\n\tISBN: " + isbn +
                "\n\tTITEL: " + titel  +
                "\n\tUDGIVELSESÅR: " + udgivelsesÅr ;
    }


}
