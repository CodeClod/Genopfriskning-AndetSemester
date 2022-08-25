import java.util.ArrayList;

public class Søgning {
    public int søgeMetode(ArrayList<String> liste, String søgeord) {
        if (liste.contains(søgeord)) {
            return liste.indexOf(søgeord);
        }
        else {
            return (-1);
        }
    }
}
