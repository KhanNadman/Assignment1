package Assignment1;

public class coinPattern {
    public static void main(String[] args) {
        coinFactory x = new coinFactory();
      // gets an object of heads and calls for the toss method in the Coin file
        Coin coin1 = x.getCoin(1);

        coin1.toss(); // it calls the toss method of heads

        // gets an object of tails and calls for the toss method in the Coin file
        Coin coin_2 = x.getCoin(2);

        coin_2.toss(); // it calls the toss method of tails
    }
}
