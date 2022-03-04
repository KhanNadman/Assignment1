package Assignment1;

public class coinPattern {
    public static void main(String[] args) {
        coinFactory x = new coinFactory();

        Coin coin1 = x.getCoin(1);

        coin1.toss();

        Coin coin_2 = x.getCoin(2);

        coin_2.toss();
    }
}
