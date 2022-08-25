import java.util.ArrayList;
import java.util.Locale;

public class ProperCase {
    public String setproperCase(String preProperString) {
        StringBuilder properCase = new StringBuilder();
        for (String s:
                preProperString.split(" ")) {
            if (s.toUpperCase().equals(s)) {
                properCase.append(s + " ");
            }
            else if (s.length() > 3) {
                properCase.append(s.substring(0,1).toUpperCase(Locale.ROOT) + s.substring(1) + " ");
            }
            else if (s.length() <= 3) {
                properCase.append(s.toLowerCase(Locale.ROOT) + " ");
            }
        }
        return properCase.toString();
    }
}
