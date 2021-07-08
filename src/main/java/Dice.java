import java.util.Random;

public class Dice {
    Integer numberOfDice;

    public Dice(int numberOfDice) {
        this.numberOfDice = numberOfDice;
    }

    public Integer tossAndSum() {
        Integer sumOfRolls = 0;
        Integer rollValue = 0;
        Random r = new Random();
        /* Seed only used for testing method
         *
         * r.setSeed(24);
         */
        int low = 1;
        int high = 7;
        for(int i = 1; i <= numberOfDice; i++) {
            rollValue = r.nextInt(high-low) + low;
            sumOfRolls += rollValue;
        }

        return sumOfRolls;
    }

    public Integer getNumberOfDice() {
        return numberOfDice;
    }
}
