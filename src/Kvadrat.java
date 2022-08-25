public class Kvadrat {
    public void udregnKvadrat(int størrelse, String tegn) {
        for (int i = 0; i < størrelse; i++) {
            for (int j = 0; j < størrelse; j++) {
                System.out.print(" " + tegn + " ");
            }
            System.out.println();
        }
    }
}
