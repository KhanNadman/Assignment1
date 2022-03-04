package Assignment1;

public class coinFactory {
   // checks to see if the coin is heads or tails
    public Coin getCoin(int tossValue) {
      // checks to see if user has inputted 1
      // entering 1 means heads
        if (tossValue == 1) {
            return new head();

        }
        // checks to see if user has inputted 2
        // entering 2 means tails
        else if (tossValue == 2) {
            return new tail();
        }
        return null; // in case the user inputs any other number other than 1 or 2 it would return NULL
    }
}