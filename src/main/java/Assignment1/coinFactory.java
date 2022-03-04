package Assignment1;

public class coinFactory {

    public Coin getCoin(int tossValue) {

        if (tossValue == 1) {
            return new head();

        }
        else if (tossValue == 2) {
            return new tail();
        }
        return null;
    }
}