
public class HvorTitSkalGræssetSlås {


    public int skalGræsSlås(double højde, double ønsketHøjde) {
        int dage;
        if (højde > ønsketHøjde) {
            return 0;
        }
        for (dage = 0; højde < ønsketHøjde; ++dage) {
            højde += 0.8;
        }
        return dage;
    }

}
