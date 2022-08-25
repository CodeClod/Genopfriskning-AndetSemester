import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Sortering {

    public void sorterFemStrenge() {
        Scanner input = new Scanner(System.in);
        ArrayList<String> strenge = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            strenge.add(input.next());
        }

        Collections.sort(strenge);

        for (String s : strenge) {
            System.out.println(s);
        }
    }
}
