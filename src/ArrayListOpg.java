import java.util.ArrayList;

public class ArrayListOpg {


    public boolean doesArraylistContainString(ArrayList<String> arraylist, String string) {
        // return arraylist.contains(string);   *Virker ikke alligevel so nvm*

        if (!arraylist.contains(string)) {
            arraylist.add(string);
            return false;
        }
        else {
            System.out.println("The STring has been found");
            return true;
        }

    }


}
