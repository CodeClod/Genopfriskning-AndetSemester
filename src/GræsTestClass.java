import java.util.Scanner;

public class GræsTestClass {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        HvorTitSkalGræssetSlås græs = new HvorTitSkalGræssetSlås();
        System.out.println("Enter height of grass, and then desired height (decimal with comma)");
        System.out.println(græs.skalGræsSlås(input.nextDouble(), input.nextDouble()));
    }
}
